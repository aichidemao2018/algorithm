package com.algorithm.leetcode.Link;

/**
 * 给你单链表的头指针 head 和两个整数 left 和 right ，其中 left <= right 。请你反转从位置 left 到位置 right 的链表节点，返回 反转后的链表 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-linked-list-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * 输入：head = [1,2,3,4,5], left = 2, right = 4
 * 输出：[1,4,3,2,5]
 */
public class ReverseLink2 {
    public static void main(String[] args) {

    }

    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dummyNode = new ListNode(-1);
        dummyNode.getNext().setNext(head);
        ListNode pre = null;
        for (int i = 0; i < left - 1; i++) {
            pre = head.getNext();
        }

        ListNode cur = pre.getNext();
        ListNode next;
        for (int i = 0; i < right - left; i++) {

        }
        return null;
    }
}