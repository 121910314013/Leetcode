class Solution {
    public int[] runningSum(int[] n) {
        int [] r= new int[n.length];
        r[0]=n[0];
        for (int i = 1; i < r.length; i++) {
            r[i]=r[i-1]+n[i];
        }
        return r;
    }
}