class Solution {
    public int[] getConcatenation(int[] n) {
        int a=0;
        int [] r= new int[n.length*2];
        for (int i = 0; i < n.length; i++) {
            r[i]=n[i];
        }
        for (int i = n.length; i < r.length; i++) {
            r[i]=n[a];
            a++;
        }
        return r;
        
    }
}