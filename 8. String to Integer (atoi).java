class Solution {
    public int myAtoi(String s) {
        int i=0;
        int n=s.length();
        while(i<n && s.charAt(i)==' ')
            i++;
        int sign=1;
        if(s.charAt(i)=='-') {
            sign=-1;
            i++;
        } else if(s.charAt(i)=='+') {
            sign=1;
            i++;
        }
        int result=0;
        while(i<n && s.charAt(i)>='0' && s.charAt(i)<='9') {
            int ch=s.charAt(i)-'0';
            if(result>Integer.MAX_VALUE/10)
                return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
            result=result*10+ch;
            i++;
        }
        return (int)(sign*result);
    }
}