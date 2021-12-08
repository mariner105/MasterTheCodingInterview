package exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {

    ReverseLinkedList reverseLinkedList;
    ListNode head;

    @BeforeEach
    void setUp() {
        reverseLinkedList = new ReverseLinkedList();
        head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));
    }

    @Test
    public void sample() {
        reverseLinkedList.reverseList(head);
        ListNode curr = head.next;
        ListNode prev = head;

        while (curr != null) {
            assertTrue(prev.val > curr.val);
            curr = curr.next;
        }
    }
}