class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[c];
                arr[c]=arr[i];
                arr[i]=temp;
                c++;
            }
        }
        
    }
}