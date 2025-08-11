class Solution {
    public int help(int n,int[] dp)
    {
        if(n<=1) return n;
        if(dp[n]!=0){
            return dp[n];
        }
        return dp[n]=fib(n-1)+fib(n-2);

    }

    public int fib(int n) {
        int [] dp=new int[n+1];
        if(n<=1) return n;
        dp[0]=0;
        dp[1]=1;
        
        return help(n,dp);

        
    }
}