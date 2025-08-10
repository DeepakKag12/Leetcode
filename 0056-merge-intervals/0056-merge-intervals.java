import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        int m = intervals[0].length;

        // Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> inner1 = new ArrayList<>();
        inner1.add(intervals[0][0]);
        inner1.add(intervals[0][1]);
        ans.add(inner1);

        for (int i = 1; i < n; i++) {
            int lastS = ans.get(ans.size() - 1).get(0);
            int lastE = ans.get(ans.size() - 1).get(1);
            int currS = intervals[i][0];
            int currE = intervals[i][1];

            if (currS <= lastE && currE >= lastS) {
                ans.get(ans.size() - 1).set(0, Math.min(lastS, currS));
                ans.get(ans.size() - 1).set(1, Math.max(lastE, currE));
            } else {
                ArrayList<Integer> row = new ArrayList<>();
                row.add(currS);
                row.add(currE);
                ans.add(row);
            }
        }

        int[][] result = new int[ans.size()][m];
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = ans.get(i).get(j);
            }
        }

        return result;
    }
}
