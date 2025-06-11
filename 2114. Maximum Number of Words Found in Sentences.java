class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords=0;
        for(int i=0; i<sentences.length; i++) {
            int words=0;
            for(int j=0; j<sentences[i].length(); j++) {
                char ch=sentences[i].charAt(j);
                if(ch==' ') words++;
            }
            words++;
            if(maxWords<words) maxWords=words;
        }
        return maxWords;
    }
}