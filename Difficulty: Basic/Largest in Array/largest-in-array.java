class Solution {
    public static int largest(int[] arr) {
        // code here
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>c){
                c=arr[i];
            }
        }
        return c;
    }
}
