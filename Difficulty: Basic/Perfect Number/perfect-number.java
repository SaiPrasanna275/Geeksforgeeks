// User function Template for Java

class Solution {
    int isPerfect(int N) {
        // code here
        int or=N;
        int sum=0;
        while(or!=0){
            int fact=1;
            int t=or%10;
        for(int i=1;i<=t;i++){
            fact=fact*i;
        }
            sum=sum+fact;
            or=or/10;
            
        }
        return (N==sum)?1:0;
    }
}