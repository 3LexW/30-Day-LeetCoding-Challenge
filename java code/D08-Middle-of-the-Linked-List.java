class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;                         //Fast pointer moves twice as fast as the slow pointer
        ListNode slow = head;
        while (fast != null && fast.next != null){    //When fast reaches the end of the list, slow is at the middle of the list
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}

//1. [1 ,2,3,4,5,6]
//    FS
//2. [1,2,3,4,5,6]
//      S,F
//3. [1,2,3,4,5,6]
//        S   F
//4. [1,2,3,4,5,6]
//          S     F -> Return 4
