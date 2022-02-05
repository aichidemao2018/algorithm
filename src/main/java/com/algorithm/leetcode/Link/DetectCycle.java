package com.algorithm.leetcode.Link;

import java.util.HashSet;
import java.util.Set;

/**
 * 环型链表2
 * <p>
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
 * <p>
 * 不允许修改 链表。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/linked-list-cycle-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class DetectCycle {
    public static void main(String[] args) {

    }

    /**
     * 输出环形链表的索引下表
     *
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> cycles = new HashSet();
        while (head != null) {
            if (cycles.contains(head)) {
                return head;
            } else {
                cycles.add(head);
            }
            head = head.getNext();
        }
        return null;
    }

    /**
     * 首先第一步还是需要先确定是否有环，和141思路基本一样
     * 判断fast是否能走到null节点即可~
     * 判断有环以后，再重新定义一个指针pre指向head
     * pre和slow一起前进，相遇的节点就是入环节点！
     * <p>
     * 作者：nickBean
     * 链接：https://leetcode-cn.com/problems/linked-list-cycle-ii/solution/nick-shuang-zhi-zhen-gui-tu-sai-pao-suan-nb9k/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     *
     * @param head
     * @return
     */
    public ListNode detectCycle2(ListNode head) {
        Set<ListNode> cycles = new HashSet();
        while (head != null) {
            if (cycles.contains(head)) {
                return head;
            } else {
                cycles.add(head);
            }
            head = head.getNext();
        }
        return null;
    }
}
