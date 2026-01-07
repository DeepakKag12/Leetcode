class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int a = 0, b = 0, c = n - 1;

        while (b <= c) {
            if (nums[b] == 0) {
                int temp = nums[a];
                nums[a] = nums[b];
                nums[b] = temp;
                a++;
                b++;
            } 
            else if (nums[b] == 1) {
                b++;
            } 
            else { 
                int temp = nums[c];
                nums[c] = nums[b];
                nums[b] = temp;
                c--;
            }
        }
    }
}
