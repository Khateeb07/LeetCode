class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hm=new HashMap<>();
        for(int i=0; i<magazine.length(); i++) {
            char key=magazine.charAt(i);
            int val;
            if(hm.containsKey(key)) {
                val=hm.get(key);
                hm.put(key, ++val);
            } else
                hm.put(key, 1);
        }
        for(int i=0; i<ransomNote.length(); i++) {
            char ch=ransomNote.charAt(i);
            int val;
            if(hm.containsKey(ch)) {
                val=hm.get(ch);
                hm.put(ch, --val);
                if(hm.get(ch)==0)
                    hm.remove(ch);
            } else
                return false;
        }
        return true;
    }
}
