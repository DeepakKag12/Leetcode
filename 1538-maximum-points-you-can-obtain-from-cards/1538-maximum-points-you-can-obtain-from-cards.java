class Solution {
    public int maxScore(int[] cardPoints, int k) {
       int n=cardPoints.length;
    //     int sptr=0;
    //     int endptr=n-1;
    //    -;
    //         }


    //         sum+=Math.max(x,y);
    //         k--;


    //     }
    //     return su while(k!=0)
    //     {
    //         int x=cardPoints[sptr];
    //         int y=cardPoints[endptr];
    //        if (x > y) {
    //        sptr++;
    //    }
    //    else if(x==y)
    //    {
    //     if(cardPoints[sptr+1]>cardPoints[endptr-1])
    //     {
    //         sptr++;
    //     }
    //     else
    //     {
    //         endptr--;
    //     }

    //    }
    //     else {
    //        endptr-m;
    
     int fsum = 0;
for (int i = 0; i < k; i++) {
    fsum += cardPoints[i];
}
int sum = fsum;

for (int i = 0; i < k; i++) {
    fsum += cardPoints[n - 1 - i] - cardPoints[k - 1 - i];
    sum = Math.max(sum, fsum);
}
return sum;

            }
}