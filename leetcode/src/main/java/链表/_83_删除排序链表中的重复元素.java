package 链表;


/**
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 * @author luguozheng
 *
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * 示例 1:
 *
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 *
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 */
public class _83_删除排序链表中的重复元素 {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode newHead = head;
        while (newHead != null && newHead.next != null){
            if (newHead.val == newHead.next.val){
                newHead.next = newHead.next.next;
            }else {
                newHead = newHead.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        System.out.println(deleteDuplicates(ListNode.getInstance(1, 1, 2,1,3,1)));
    }
}
