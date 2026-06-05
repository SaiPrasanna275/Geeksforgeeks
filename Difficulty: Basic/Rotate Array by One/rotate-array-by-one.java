
class Solution {
    public void rotate(int[] arr) {
        // code here
        int c=0;
        for(int i=0;i<arr.length;i++){
            int temp=arr[c];
            arr[c]=arr[arr.length-1];
            arr[arr.length-1]=temp;
            c++;
        }
    }
}