class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode p=head;
        int size=0;
        while(p!=null) {
            size++;
            p=p.next;
        }
        p=head;
        int i=0;
        int len=size/2;
        if(size%2==1) {
            len=(size-1)/2;
        }
        int[] firstHalf=new int[len];
        int[] secondHalf=new int[len];
        while(i<len) {
            firstHalf[i++]=p.val;
            p=p.next;
        }
        i=0;
        if(size%2==1)
            p=p.next;
        while(p!=null) {
            secondHalf[i++]=p.val;
            p=p.next;
        }
        i=0;
        int j=len-1;
        while(i<len && j>=0) {
            if(firstHalf[i]!=secondHalf[j])
                return false;
            i++;
            j--;
        }
        return true;
    }
}