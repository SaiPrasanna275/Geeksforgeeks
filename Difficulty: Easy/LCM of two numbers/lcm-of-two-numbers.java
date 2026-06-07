class Solution {
    public int lcm(int a, int b) {
        // code here
         int x=a;
        int y=b;
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        int gcd=a;
        int lcm=(x*y)/gcd;
        return lcm;
    }
}