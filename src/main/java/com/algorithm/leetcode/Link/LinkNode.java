package com.algorithm.leetcode.Link;

import lombok.Data;

@Data
public class LinkNode {
    private int index;
    private int value;
    private LinkNode next;

    public LinkNode(int value) {
        this.value = value;
    }

    public LinkNode(int value, LinkNode next) {
        this.value = value;
        this.next = next;
    }
}
