class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] > nums[r]) {
                // Minimum is in the right half
                l = mid + 1;
            } else {
                // Minimum is in the left half including mid
                r = mid;
            }
        }

        return nums[l];
    }
}
