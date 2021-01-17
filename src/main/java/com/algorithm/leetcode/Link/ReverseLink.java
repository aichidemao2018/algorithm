package com.algorithm.leetcode.Link;

import java.util.Objects;

public class ReverseLink {

    public static void main(String args[]) {
        LinkNode head = new LinkNode(1);
        LinkNode n2 = new LinkNode(2);
        LinkNode n3 = new LinkNode(3);
        LinkNode n4 = new LinkNode(4);
        head.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(null);
        LinkNode newHead = head;
        while (Objects.nonNull(newHead)) {
            System.out.println(newHead.getValue());
            newHead = newHead.getNext();
        }
        System.out.println("----");
        LinkNode solution = solution(head);
        while (Objects.nonNull(solution)) {
            System.out.println(solution.getValue());
            solution = solution.getNext();
        }


    }

    //递归
    public static LinkNode solution(LinkNode head) {
        if (head.getNext() == null) {
            return head;
        }

        LinkNode newHead = solution(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return newHead;

    }
}
