package 链表;


/**
 * https://leetcode-cn.com/problems/linked-list-cycle/
 * @author luguozheng
 * 快慢秒针
 */
public class _141_环形链表 {
	
	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null){
			return false;
		}

		// 慢指针
        ListNode slow = head.next;
		// 快指针
        ListNode fast = head.next.next;
        // 如果循环到fast.next为null则链表循环结束,直接返回false
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            // 如果该链表为环形链表则最终快指针会赶上慢指针,则为同一个节点,返回true
            if (slow == fast){
                return true;
            }
		}
		return false;
    }
	
}
