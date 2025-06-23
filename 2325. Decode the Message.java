class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> table=new HashMap<>();
        int alpha=97;
        for(int i=0; i<key.length(); i++) {
            if(key.charAt(i)!=' ' && table.get(key.charAt(i))==null)
                table.put(key.charAt(i), (char)alpha++);
        }
        String result="";
        for(int i=0; i<message.length(); i++) {
            if(message.charAt(i)==' ')
                result+=message.charAt(i);
            else {
                result+=table.get(message.charAt(i));
            }
        }
        return result;
    }
}
