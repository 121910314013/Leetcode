class Solution {
    public int searchInsert(int[] n, int target) {
        int s=0,e=n.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if (target==n[mid]){
                return mid;

            }
            else if (target>n[mid]) {
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return s;
        
    }
}