class Solution {
    public boolean isValid(String s) {
        Stack st=new Stack();
        for(int i=0; i<s.length(); i++) {
            char ch=s.charAt(i);
            if(st.empty()==true) st.push(ch);
            else if(ch==')' && (Character)st.peek()=='(') st.pop();
            else if (ch=='}' && (Character)st.peek()=='{') st.pop();
            else if (ch==']' && (Character)st.peek()=='[') st.pop();
            else st.push(ch);
        }
        return st.empty();
    }
}