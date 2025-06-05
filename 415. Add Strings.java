class Solution {
    public String addStrings(String num1, String num2) {
        String result="";
        int i=num1.length()-1;
        int j=num2.length()-1;
        int sum=0, carry=0;
        while(i>=0 && j>=0) {
            int ch1=num1.charAt(i--)-48;
            int ch2=num2.charAt(j--)-48;
            sum=ch1+ch2+carry;
            if(sum>9) {
                carry=sum/10;
                sum=sum%10;
            } else
                carry=0;
            result=(char)(sum+48)+result;
        }
        while(i>=0) {
            int ch=num1.charAt(i--)-48;
            sum=ch+carry;
            if(sum>9) {
                carry=sum/10;
                sum%=10;
            } else
                carry=0;
            result=(char)(sum+48)+result;
        }
        while(j>=0) {
            int ch=num2.charAt(j--)-48;
            sum=ch+carry;
            if(sum>9) {
                carry=sum/10;
                sum%=10;
            } else
                carry=0;
            result=(char)(sum+48)+result;
        }
        if(carry!=0)
            result=(char)(carry+48)+result;
        return result;
    }
}