class Solution {
    public int maximumWealth(int[][] arr) {
        int res=0;
        for (int row = 0; row < arr.length; row++) {
            int sum=0;
            for (int col = 0; col < arr[row].length; col++) {
                sum+=arr[row][col];
            }
            if (res<sum){
                res=sum;
            }
        }
        return res;
        
    }
}