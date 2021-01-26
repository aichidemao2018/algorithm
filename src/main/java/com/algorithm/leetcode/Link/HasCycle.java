package com.algorithm.leetcode.Link;

import java.util.HashSet;
import java.util.Set;

public class HasCycle {
    public static void main(String[] args) {

    }

    private Boolean solution(LinkNode head) {
        Set<LinkNode> exists = new HashSet<>();
        while (head != null) {

            if (!exists.add(head)) {
                return true;
            }
            head = head.getNext();
        }
        return false;
    }
}
