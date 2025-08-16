class Solution {
    public int maximum69Number(int num) {
        int divisor = 1;
        while (num / divisor >= 10) {
            divisor *= 10;
        }

        int x = num;
        while (divisor > 0) {
            int digit = x / divisor;

            if (digit == 6) {
                num += 3 * divisor;  
                break; 
            }

            x %= divisor;    
            divisor /= 10;     
        }

        return num;
    }
}
