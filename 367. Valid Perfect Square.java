class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==0) return false;
        else if(num==1) return true;
        int start=1, end=num, mid=-1;
        while(start<=end) {
            mid=start+(end-start)/2;
            if((long)mid*mid==(long)num) return true;
            else if((long)mid*mid<(long)num) start=mid+1;
            else end=mid-1;
        }
        return false;
    }
}