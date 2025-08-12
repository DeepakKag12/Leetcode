import java.util.Arrays;

class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int maxlen = 1;
        long sum = 0;
        int l = 0;

        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];

            while ((long)(r - l + 1) * nums[r] - sum > k) {
                sum -= nums[l];
                l++;
            }

            maxlen = Math.max(maxlen, r - l + 1);
        }

        return maxlen;
    }
}
