class Solution {
    public int[] productExceptSelf(int[] n) {
        int [] r= new int[n.length];
        r[0]=1;
        int s=1;
        for (int i = 1; i < n.length; i++) {
            r[i]=r[i-1]*n[i-1];
        }
        for (int i = n.length-1; i >=0; i--) {
            
            r[i]=r[i]*s;
            s*=n[i];
        }
        return r;
        
    }
}