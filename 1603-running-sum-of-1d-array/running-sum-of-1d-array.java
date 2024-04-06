class Solution {
    public int[] runningSum(int[] arr) {
        int[] res= new int[arr.length];
        res[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            res[i]=arr[i]+res[i-1];
        }
        return res;
    }
}