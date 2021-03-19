package com.algorithm.leetcode.Link;

import java.util.Objects;

public class ReverseLink {

    public static void main(String args[]) {
        ListNode head = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        head.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(null);
        ListNode newHead = head;
        while (Objects.nonNull(newHead)) {
            System.out.println(newHead.getValue());
            newHead = newHead.getNext();
        }
        System.out.println("----");
        ListNode solution = solution(head);
        while (Objects.nonNull(solution)) {
            System.out.println(solution.getValue());
            solution = solution.getNext();
        }


    }

    //递归
    public static ListNode solution(ListNode head) {
        if (head.getNext() == null) {
            return head;
        }
        //返回逆向指针头节点
        ListNode newHead = solution(head.getNext());
        head.getNext().setNext(head);
        //清空 正向链表 的指针索引
        head.setNext(null);
        return newHead;

    }
}
