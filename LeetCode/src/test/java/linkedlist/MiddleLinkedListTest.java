package linkedlist;

import main.linkedlist.ListNode;
import main.linkedlist.MiddleLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MiddleLinkedListTest {

    @Test
    void middleNode() {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);

        assertEquals(3, new MiddleLinkedList().middleNode(node).val);

    }
}