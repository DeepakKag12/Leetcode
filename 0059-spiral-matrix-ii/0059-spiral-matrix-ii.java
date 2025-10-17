class Solution {
    public int[][] generateMatrix(int n) {
        int top = 0, left = 0;
        int right = n - 1, bottom = n - 1;
        int[][] ans = new int[n][n];
        int num = 1;

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) {
                ans[top][j] = num++;
            }
            top++;

            // top to bottom
            for (int i = top; i <= bottom; i++) {
                ans[i][right] = num++;
            }
            right--;

            // right to left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    ans[bottom][j] = num++;
                }
                bottom--;
            }

            // bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans[i][left] = num++;
                }
                left++;
            }
        }

        return ans;
    }
}
