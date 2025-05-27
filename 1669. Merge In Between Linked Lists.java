class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode p=list1;
        int i=1;
        while(i<a) {
            p=p.next;
            i++;
        }
        ListNode end1=p;
        while(i<=b) {
            p=p.next;
            i++;
        }
        ListNode start1=p.next;
        p.next=null;
        end1.next=list2;
        ListNode q=list2;
        while(q.next!=null) q=q.next;
        q.next=start1;
        return list1;
    }
}