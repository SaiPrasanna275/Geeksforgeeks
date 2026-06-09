// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int or=n;
        int sum=0;
        while(or!=0){
            int digit=or%10;
            sum=sum+digit*digit*digit;
            or=or/10;
        }
         return n==sum;
    }
}