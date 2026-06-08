// User function Template for Java

class Solution {
    public int is_StrongNumber(int n) {
        int sum=0;
        int x=n;
        while(x!=0){
            int d=x%10;
            int fact=1;
            for(int i=1;i<=d;i++){
                fact=fact*i;
            }
                sum=sum+fact;
                x=x/10;
        }
        return (sum==n)?1:0;
    }
}