package com.algorithm.leetcode.Link;

import java.util.Objects;

public class Merge {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode12 = new ListNode(3);

        ListNode listNode13 = new ListNode(5);

        listNode1.setNext(listNode12);
        listNode12.setNext(listNode13);

        ListNode listNode21 = new ListNode(2);

        ListNode listNode22 = new ListNode(4);

        ListNode listNode23 = new ListNode(6);
        listNode21.setNext(listNode22);
        listNode22.setNext(listNode23);

        ListNode node = solution(listNode1, listNode21);

        while (Objects.nonNull(node.getValue())) {
            System.out.println(node.getValue());
            node = node.getNext();
        }


    }

    public static ListNode solution(ListNode n1, ListNode n2) {
        if (n1 == null) {
            return n2;
        }
        if (n2 == null) {
            return n1;
        }
        if (n1.getValue() < n2.getValue()) {
            ListNode solution = solution(n1.getNext(), n2);
            n1.setNext(solution);
            return n1;
        } else {
            ListNode solution = solution(n1, n2.getNext());
            n2.setNext(solution);
            return n2;
        }

    }
}
