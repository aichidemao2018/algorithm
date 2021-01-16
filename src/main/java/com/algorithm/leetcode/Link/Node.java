package com.algorithm.leetcode.Link;

import lombok.Data;

@Data
public class Node {
    private int index;
    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
    }
}
