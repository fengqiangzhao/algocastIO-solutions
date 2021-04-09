package io.algocasts;

import io.algocasts.datastructure.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class P9Test {

    private ListNode genTestCase() {
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(9);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(7);
        ListNode fifth = new ListNode(6);
        ListNode sixth = new ListNode(11);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = null;

        return head;
    }

    @Test
    public void testReverseList() {
        ListNode head = this.genTestCase();

        P9 p = new P9();
        head = p.reverseList(head);
        assertEquals(head.val, 11);
    }
}