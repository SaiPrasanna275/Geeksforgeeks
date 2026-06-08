// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        // Code here
        int x=n;
        int sum=0;
        while(x!=0){
            int c=x%10;
            sum=sum*10+c;
            x=x/10;
        }
        return sum;
    }
}