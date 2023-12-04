class Solution {
    public int[] searchRange(int[] n, int target) {
        int [] r={-1,-1};
        int start = fun(n, target, true);
        int end = fun(n, target, false);
        r[0]=start;
        r[1]=end;
        // System.out.println(Arrays.toString(r));
        return r;
    }
    static int fun(int[] n, int target , boolean hey){
        int ans=-1;
        int s=0;
        int e = n.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if (target<n[mid]){
                e=mid-1;
            }
            else if (target>n[mid]) {
                s=mid+1;
            }
            else{
                ans=mid;
                if(hey){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
                
            }
        }
        return ans;
    }
}