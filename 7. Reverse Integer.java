class Solution {
    public int reverse(int x) {
        if(x>0) {
            int rev=0;
            while(x>0) {
                if(rev>(Integer.MAX_VALUE-x%10)/10)
                    return 0;
                rev=rev*10+x%10;
                x/=10;
            }
            return rev;
        } else if(x<0) {
            int temp=-x, rev=0;
            while(temp>0) {
                if(rev>((Integer.MAX_VALUE-(temp%10))/10))
                    return 0;
                rev=rev*10+temp%10;
                temp/=10;
            }
            rev=-rev;
            return rev;
        } else {
            return x;
        }
    }
}
