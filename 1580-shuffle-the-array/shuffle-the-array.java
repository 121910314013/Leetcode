class Solution {
    public int[] shuffle(int[] n, int t) {
        int[] r= new int[n.length];
        int j=0;
        int i=t;
        for (int k = 0; k < n.length; k++) {
            r[k]=n[j];
            k++;
            r[k]=n[i];
            i++;
            j++;
        }
        return r;
        
    }
}