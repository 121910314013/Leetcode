class Solution {
    public int findPeakElement(int[] n) {
        int s=0, e = n.length-1;
        while(s<e){ 
            int mid = (s+e)/2;
            if (n[mid]< n[mid+1]){
                s=mid+1;
            }
            else if (n[mid]>n[mid+1]) {
                e=mid;
            }
        }
        return s;
        
    }
}