class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode p=head;
        if(p==null) return head;
        p=p.next;
        ListNode head2=null;
        int node=1;
        while(p!=null) {
            int data=0;
            while(p.val!=0) {
                data+=p.val;
                p=p.next;
            }
            p=p.next;
            ListNode t=new ListNode(data);
            ListNode t2=head2;
            if(node==1) head2=t;
            else {
                while(t2.next!=null) t2=t2.next;
                t2.next=t;
            }
            node++;
        }
        return head2;
    }
}