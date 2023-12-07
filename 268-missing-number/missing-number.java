class Solution {
    public int missingNumber(int[] arr) {
        int i=0;
        while (i<arr.length) {
            int c= arr[i];
            if (arr[i]!=arr.length && arr[i]!=arr[c]){
                int temp=arr[i];
                arr[i]=arr[c];
                arr[c]=temp;
            }
            else{
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if(j!=arr[j]){
                return j;
            }
        }
        return arr.length;
    
        
    }
}