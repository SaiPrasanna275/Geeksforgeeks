class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
        int c=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==b[i]){
                c++;
            }
            if(c==a.length){
                return true;
            }
        }
        return false;
    }
}