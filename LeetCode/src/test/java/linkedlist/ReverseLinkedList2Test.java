package linkedlist;

import main.linkedlist.ListNode;
import main.linkedlist.ReverseLinkedList2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseLinkedList2Test {

    @Test
    void reverseBetween() {
        int[] nums1 = {1, 2, 3, 4, 5};
        ListNode head = ListNode.generateLinkedList(nums1);
        assertEquals(4, new ReverseLinkedList2().reverseBetween(head, 1, 5).next.val);
    }
}