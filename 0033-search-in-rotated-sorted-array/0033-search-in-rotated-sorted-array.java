class Solution {
   public int findStart(int[] nums)
   {
    int n=nums.length;
    for(int i=0;i<n-1;i++)
    {
        if(nums[i]>nums[i+1])
        {
            return i+1;
        }
    }
    return 0;
   }
   int BS(int[] nums, int st, int end, int target)
{
    if (st > end)  
        return -1;

    int mid = (st + end) / 2;

    if (nums[mid] == target)
        return mid;
    else if (nums[mid] > target)
        return BS(nums, st, mid - 1, target);
    else
        return BS(nums, mid + 1, end, target);
}

    public int search(int[] nums, int target) {
        int start=findStart(nums);
        int n=nums.length;
        if(target==nums[n-1]) return n-1;
        if(target>nums[n-1])
        {
            return BS(nums,0,start-1,target);

        }
        else
        {
            return BS(nums,start,n,target);
        }
        
    }
}