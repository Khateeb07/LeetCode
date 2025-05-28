class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode p=head;
        if(p==null) return head;
        p=p.next;
        ListNode head2=null;
        ListNode t2=null;
        int node=1;
        while(p!=null) {
            int data=0;
            while(p.val!=0) {
                data+=p.val;
                p=p.next;
            }
            p=p.next;
            ListNode t=new ListNode(data);
            if(node==1) {
                head2=t;
                t2=head2;
            } else {
                t2.next=t;
                t2=t2.next;
            }
            node++;
        }
        return head2;
    }
}