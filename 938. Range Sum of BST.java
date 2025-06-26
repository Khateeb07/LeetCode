class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null) return 0;
        int sum=0;
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        TreeNode temp=root;
        while(!st.empty()) {
            temp=st.pop();
            if(temp.val>=low && temp.val<=high)
                sum+=temp.val;
            if(temp.right!=null)
                st.push(temp.right);
            if(temp.left!=null)
                st.push(temp.left);
        }
        return sum;
    }
}
