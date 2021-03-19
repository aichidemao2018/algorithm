package com.algorithm.leetcode.Link;

import java.util.HashSet;
import java.util.Set;

public class HasCycle {
    public static void main(String[] args) {

    }

    private Boolean solution(ListNode head) {
        Set<ListNode> exists = new HashSet<>();
        while (head != null) {

            if (!exists.add(head)) {
                return true;
            }
            head = head.getNext();
        }
        return false;
    }

    private Boolean solution2(ListNode head) {
        if (head == null || head.getNext() == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.getNext();

        while (slow != fast) {
            if (fast == null || fast.getNext() == null) {
                return false;
            }
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return true;
    }

}
