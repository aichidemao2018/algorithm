package com.algorithm.leetcode.Link;

import lombok.Data;

@Data
public class ListNode {
    private int index;
    private int value;
    private ListNode next;

    public ListNode(int value) {
        this.value = value;
    }

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }
}
