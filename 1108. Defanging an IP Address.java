class Solution {
    public String defangIPaddr(String address) {
        String rep="[.]";
        String result="";
        for(int i=0; i<address.length(); i++) {
            char ch=address.charAt(i);
            if(ch=='.') {
                result+=rep;
                continue;
            }
            result=result+ch;
        }
        return result;
    }
}