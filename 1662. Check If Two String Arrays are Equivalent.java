class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String arr1Str="";
        String arr2Str="";
        for(int i=0; i<word1.length; i++) {
            for(int j=0; j<word1[i].length(); j++) {
                char ch=word1[i].charAt(j);
                arr1Str+=ch;
            }
        }
        for(int i=0; i<word2.length; i++) {
            for(int j=0; j<word2[i].length(); j++) {
                char ch=word2[i].charAt(j);
                arr2Str+=ch;
            }
        }
        if(arr1Str.equals(arr2Str))
            return true;
        else
            return false;
    }
}