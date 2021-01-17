package com.algorithm.leetcode.Link;

import java.util.Objects;

public class Merge {
    public static void main(String[] args) {
        LinkNode linkNode1 = new LinkNode(1);
        LinkNode linkNode12 = new LinkNode(3);

        LinkNode linkNode13 = new LinkNode(5);

        linkNode1.setNext(linkNode12);
        linkNode12.setNext(linkNode13);

        LinkNode linkNode21 = new LinkNode(2);

        LinkNode linkNode22 = new LinkNode(4);

        LinkNode linkNode23 = new LinkNode(6);
        linkNode21.setNext(linkNode22);
        linkNode22.setNext(linkNode23);

        LinkNode node = solution(linkNode1, linkNode21);

        while (Objects.nonNull(node.getValue())) {
            System.out.println(node.getValue());
            node = node.getNext();
        }


    }

    public static LinkNode solution(LinkNode n1, LinkNode n2) {
        if (n1 == null) {
            return n2;
        }
        if (n2 == null) {
            return n1;
        }
        if (n1.getValue() < n2.getValue()) {
            LinkNode solution = solution(n1.getNext(), n2);
            n1.setNext(solution);
            return n1;
        } else {
            LinkNode solution = solution(n1, n2.getNext());
            n2.setNext(solution);
            return n2;
        }

    }
}
