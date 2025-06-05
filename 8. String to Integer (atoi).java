class Solution {
    public int myAtoi(String s) {
        int i=0;
        s=s.trim();
        int n=s.length();
        if(n==0)
            return 0;
        int sign=1;
        if(s.charAt(i)=='-') {
            sign=-1;
            i++;
        } else if(s.charAt(i)=='+') {
            i++;
        }
        int result=0;
        while(i<n && s.charAt(i)>='0' && s.charAt(i)<='9') {
            int digit=s.charAt(i)-'0';
            if(result>(Integer.MAX_VALUE-digit)/10)
                return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
            result=result*10+digit;
            i++;
        }
        return (int)(sign*result);
    }
}