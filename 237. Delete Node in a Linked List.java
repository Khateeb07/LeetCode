class Solution {
    public void deleteNode(ListNode node) {
        ListNode p=node;
        ListNode t=node;
        while(p.next!=null) {
            ListNode q=p.next;
            p.val=q.val;
            t=p;
            p=p.next;
        }
        t.next=null;
    }
}