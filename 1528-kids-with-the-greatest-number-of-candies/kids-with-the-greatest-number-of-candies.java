class Solution {
    public List<Boolean> kidsWithCandies(int[] n, int t) {
        ArrayList<Boolean> r =  new ArrayList<Boolean>(n.length);
        int a=0;
        // int t=3;
        for (int i : n) {
            if (i>a){
                a=i;
            }
        }
        for (int i = 0; i < n.length; i++) {
            if(n[i]+t >= a){
                r.add(true);
            }
            else{
                r.add(false);
            }
        }
        return r;
    }
}