class Solution {
    public String reverseWords(String s) {
        String reversed="";
        String words="";
        s=s.trim();
        for(int i=0; i<s.length(); i++) {
            char ch=s.charAt(i);
            if(ch==' ' && s.charAt(i+1)==' ') {
                continue;
            } else if(ch==' ') {
                words=' '+words;
                reversed=words+reversed;
                words="";
            } else {
                words+=ch;
            }
        }
        return words+reversed;
    }
}
