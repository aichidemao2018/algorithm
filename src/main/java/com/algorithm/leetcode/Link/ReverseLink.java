package com.algorithm.leetcode.Link;

import java.util.Objects;

public class ReverseLink {

    public static void main(String args[]) {
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        head.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(null);
        Node newHead = head;
        while (Objects.nonNull(newHead)) {
            System.out.println(newHead.getValue());
            newHead = newHead.getNext();
        }
        System.out.println("----");
        Node solution = solution(head);
        while (Objects.nonNull(solution)) {
            System.out.println(solution.getValue());
            solution = solution.getNext();
        }


    }

    //递归
    public static Node solution(Node head) {
        if (head.getNext() == null) {
            return head;
        }

        Node newHead = solution(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return newHead;

    }
}
