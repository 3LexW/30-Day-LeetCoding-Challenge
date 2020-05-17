/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode dummyodd = new ListNode(0);
        ListNode dummyeven = new ListNode(0);
        ListNode odd = dummyodd;
        ListNode even = dummyeven;
        
        //Create a list of odd, and a list of even
        int i = 1;
        while (head != null){
            if (i % 2 == 0){
                even.next = head;
                even = even.next;
            }
            else{
                odd.next = head;
                odd = odd.next;
            }
            head = head.next;
            i++;
        }
        
        //Connect the odd, to the even
        odd.next = dummyeven.next;
        
        //Cut the end of the list to avoid any cycle
        even.next = null;
        
        return dummyodd.next;
    }
}
