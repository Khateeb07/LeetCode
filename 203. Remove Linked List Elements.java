class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return head;
        ListNode p=head;
        ListNode t=null;
        ListNode head2=null;
        while(p!=null) {
            if(p.val==val) {
                p=p.next;
                continue;
            }
            ListNode temp=p;
            if(t==null) {
                t=temp;
                head2=t;
            } else {
                t.next=temp;
                t=t.next;
            }
            p=p.next;
            t.next=null;
        }
        return head2;
    }
}