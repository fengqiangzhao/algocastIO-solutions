package io.algocasts;

import io.algocasts.datastructure.ListNode;

/**
 * 反转单链表
 * leetcode:35,206
 * Tag:链表
 * Level:易
 */
public class P9 {
    //Time:O(n) Space:O(1)
    public ListNode reverseList(ListNode head) {
        ListNode cur = head, pre = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
