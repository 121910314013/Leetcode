class Solution {
    public char nextGreatestLetter(char[] n, char target) {
        int s=0,e=n.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if (target<n[mid]) {
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return n[s%n.length]; 
        
    }
}