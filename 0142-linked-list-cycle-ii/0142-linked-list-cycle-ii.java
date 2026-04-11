/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // ListNode fast=head;
        // ListNode slow=head;
        // while(fast!=null && fast.next!=null){
        //     fast=fast.next.next;
        //     slow=slow.next;
        //     if(fast==slow) return fast;
        // }
        HashSet<ListNode> st=new HashSet<>();
        ListNode temp=head;
        st.add(temp);
        while(temp!=null && temp.next!=null){
            if(st.contains(temp.next)) return temp.next;
            st.add(temp.next);
            temp=temp.next;
        }
        return null;
    }
}