class Solution {
    public static int findMean(int[] arr) {
        // code here
        int mean=0;
        int len=arr.length;
        for(int i=0;i<arr.length;i++){
            mean=mean+arr[i];
        }
        int c=mean/len;
        return c;
    }
};