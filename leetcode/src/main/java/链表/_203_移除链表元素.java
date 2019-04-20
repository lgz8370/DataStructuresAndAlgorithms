package 链表;

/**
 * @author LuGuoZheng
 * @date 2019/4/19 16:49
 * @Version 3.0
 * @description https://leetcode-cn.com/problems/remove-linked-list-elements/
 */
public class _203_移除链表元素 {

    public static ListNode removeElements(ListNode head, int val) {
        ListNode newHead = new ListNode(1);
        newHead.next = head;
        ListNode header = newHead;
        while (header.next != null) {
            if (header.next.val == val) {
                header.next = header.next.next;
            } else {
                header = header.next;
            }
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        ListNode instance = ListNode.getInstance(1, 2, 6, 3, 4, 5, 6);
        System.out.println(instance);
        System.out.println(removeElements(instance, 6));
    }
}
