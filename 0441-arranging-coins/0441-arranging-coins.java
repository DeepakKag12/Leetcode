class Solution {
    public int arrangeCoins(int n) {
        int count =0;
        int row=0;
        if(n==0) return 0;
        while((n-row)>0)
        {
            row++;
            count++;
            n=n-row;

        }
        return count;

        
    }
}