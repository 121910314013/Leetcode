class Solution {
    public int maximumWealth(int[][] n) {
        int a=0;
        for (int i = 0; i < n.length; i++) {
            int b=0;
            for (int j = 0; j < n[0].length; j++) {
                b+=n[i][j];
            }
            if(a<b){
                a=b;
            }
        }
        return a;
    }
}