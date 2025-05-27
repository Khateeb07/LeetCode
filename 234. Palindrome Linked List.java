class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode p=head;
        int num=0;
        while(p!=null) {
            num=num*10+p.val;
            p=p.next;
        }
        int temp=num, rev=0;
        while(temp>0) {
            rev=rev*10+temp%10;
            temp/=10;
        }
        if(num==rev) return true;
        return false;
    }
}