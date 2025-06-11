class Solution {
    public String truncateSentence(String s, int k) {
        String result="";
        int words=0;
        for(int i=0; i<s.length(); i++) {
            char ch=s.charAt(i);
            if(ch==' ') words++;
            if(words==k) return result;
            result+=ch;
        }
        return result;
    }
}