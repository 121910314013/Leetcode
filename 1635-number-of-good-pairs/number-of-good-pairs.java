class Solution {
    public int numIdenticalPairs(int[] n) {
        int a=0;
        for (int i = 0; i < n.length; i++) {
            for (int j = i+1; j < n.length; j++) {
                if((n[i]==n[j]) && i<j){
                    a++;
                }
            }
        }
        return a;
        
    }
}