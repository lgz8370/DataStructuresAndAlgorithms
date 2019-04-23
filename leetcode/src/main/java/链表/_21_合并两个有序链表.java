package 链表;

/**
 * @author LuGuoZheng
 * @date 2019/4/22 11:23
 * @Version 3.0
 * @description https://leetcode-cn.com/problems/merge-two-sorted-lists/
 */
public class _21_合并两个有序链表 {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(-1);
        ListNode curr = newHead;
        while (l1 != null && l2 != null){
            if (l1.val > l2.val){
                curr.next = l2;
                l2 = l2.next;
                curr = curr.next;
            }else {
                curr.next = l1;
                l1 = l1.next;
                curr = curr.next;
            }
        }

        if (l1 == null){
            curr.next = l2;
        }else {
            curr.next = l1;
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        ListNode l1 = ListNode.getInstance(1, 2, 4);
        ListNode l2 = ListNode.getInstance(1, 3, 4);
        System.out.println(mergeTwoLists(l1, l2));
    }
}
