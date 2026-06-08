class Solution {
    public String isAutomorphic(int n) {
        // code here
       int c=n;
       int square=n*n;
       while(c>0){
           if(c%10!=square%10){
               return "Not Automorphic";
           }
           c=c/10;
           square=square/10;
       }
       return "Automorphic";
    }
}