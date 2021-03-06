package linkedlist;

import main.linkedlist.ListNode;
import main.linkedlist.OddEvenLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OddEvenLinkedListTest {

    @Test
    void oddEvenList() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        assertEquals(3, new OddEvenLinkedList().oddEvenList(head).next.val);
    }
}