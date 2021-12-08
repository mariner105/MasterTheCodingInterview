package exercises;

public class ReverseLinkedList {
    ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        // traverse the list
        while (curr != null) {
            // swap next and prev links
            ListNode nextTemp = curr.next; //store next before replacing it
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}
