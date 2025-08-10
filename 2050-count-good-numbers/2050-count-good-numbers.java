class Solution {
    int mod = 1000000007;

    public long expo(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) != 0) { 
                res = (res * a) % mod;
            }
            a = (a * a) % mod;
            b >>= 1; 
        }
        return res;
    }

    public int countGoodNumbers(long n) {
        long odd = n / 2;
        long even = n - odd;

        long ans = (expo(5, even) * expo(4, odd)) % mod;
        return (int) ans;
    }
}
