class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashMap <Character, Integer> hm=new HashMap<> ();
        for(int i=0; i<allowed.length(); i++) {
            char ch=allowed.charAt(i);
            hm.put(ch, (int)ch-96);
        }
        int count=0;
        for(int i=0; i<words.length; i++) {
            int len=0;
            for(int j=0; j<words[i].length(); j++) {
                char ch=words[i].charAt(j);
                if(hm.get(ch)==null)
                    break;
                else
                    len++;
            }
            if(len==words[i].length())
                count++; 
        }
        return count;
    }
}