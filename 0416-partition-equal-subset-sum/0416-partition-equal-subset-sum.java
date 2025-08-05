class Solution {
    public boolean comb(int[] nums, int sum, int idx, Boolean[][] dp) {
        if (sum == 0) return true;
        if (idx == nums.length || sum < 0) return false;
        if (dp[idx][sum] != null) return dp[idx][sum];

        boolean take = comb(nums, sum - nums[idx], idx + 1, dp);
        boolean notTake = comb(nums, sum, idx + 1, dp);

        return dp[idx][sum] = take || notTake;
    }

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;
        if (sum % 2 != 0) return false;

        int half = sum / 2;
        Boolean[][] dp = new Boolean[nums.length][half + 1];
        return comb(nums, half, 0, dp);
    }
}
