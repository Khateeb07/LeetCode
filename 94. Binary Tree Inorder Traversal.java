class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<TreeNode> visited=new ArrayList<>();
        ArrayList<Integer> output=new ArrayList<>();
        if(root==null) return output;
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        TreeNode temp;
        while(!st.empty()) {
            temp=st.peek();
            if(visited.contains(temp)) {
                output.add(temp.val);
                st.pop();
                continue;
            }
            if(temp.right==null && temp.left==null) {
                output.add(temp.val);
                st.pop();
                continue;
            }
            if(temp.right!=null || temp.left!=null) {
                temp=st.pop();
            }
            if(temp.right!=null)
                st.push(temp.right);
            visited.add(temp);
            st.push(temp);
            if(temp.left!=null)
                st.push(temp.left);
        }
        return output;
    }
}
