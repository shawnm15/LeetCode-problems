/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        
        if (head==null || head.next == null){
            return head;
        }
        
        if (current.next.val == current.val) {
                current.next = current.next.next;
        } else {
                current = current.next;
        }
        ListNode rest = deleteDuplicates(current);
        
        return head;
        
    }
    
}



/*
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
        if (current.next.val == current.val) {
            current.next = current.next.next;
        } else {
            current = current.next;
        }
        }
        return head;
        
    }
    
}






*/
