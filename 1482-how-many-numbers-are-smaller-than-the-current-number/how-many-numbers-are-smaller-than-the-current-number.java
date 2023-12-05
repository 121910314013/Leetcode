class Solution {
    public int[] smallerNumbersThanCurrent(int[] n) {
        int [] r = new int[n.length];
        for (int i = 0; i < r.length; i++) {
            int a=0;
            for (int j = 0; j < r.length; j++) {
                if (i!=j & n[i]>n[j]){
                    a++;
                }
            }
            r[i]=a;
            
        }
        return r;
        
    }
}