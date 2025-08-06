import java.util.*;

class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        Map<String, Integer> memo = new HashMap<>();
        return countWays(nums, 0, 0, target, memo);
    }

    private int countWays(int[] nums, int idx, int sum, int target, Map<String, Integer> memo) {
        if (idx == nums.length) {
            return sum == target ? 1 : 0;
        }

        String key = idx + "," + sum;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int add = countWays(nums, idx + 1, sum + nums[idx], target, memo);
        int subtract = countWays(nums, idx + 1, sum - nums[idx], target, memo);

        memo.put(key, add + subtract);
        return add + subtract;
    }
}
