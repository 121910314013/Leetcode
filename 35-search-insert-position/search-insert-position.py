class Solution:
    def searchInsert(self, n: List[int], t: int) -> int:
        s,e=0,len(n)-1
        while(s<=e):
            mid = int((s+e)/2)
            if(t == n[mid]):
                return mid
            elif t> n[mid]:
                s=mid+1
            else:
                e=mid-1
        return s
        