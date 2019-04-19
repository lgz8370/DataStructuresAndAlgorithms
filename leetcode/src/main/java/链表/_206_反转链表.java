package 链表;


/**
 * https://leetcode-cn.com/problems/reverse-linked-list/
 * @author luguozheng
 *
 */
public class _206_反转链表 {

    /**
     * https://leetcode-cn.com/problems/reverse-linked-list/
     * 递归方式: 代码注释以递归完第一次执行递归后面的代码解析,后面的一样
     * @param head
     * @return
     */
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null){
			return head;
		}
        ListNode newHead = reverseList(head.next);
		// 刚递归完后相面的head就是倒数第二个节点,head.next就是最后一个节点,在.next就是null,把null设置为head(即倒数第二个几点)则翻转了
		head.next.next = head;
		// 上一个动作已经把当前节点关联到最后一个节点的下一个节点了,所以下面吧当前节点的下一个设置为null即可(本来是最后一个几点到的)
		head.next = null;
        return newHead;
    }


	public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode newHead = null;
        while (head != null){
            // 先取出head.next第二个节点
            ListNode temp = head.next;
            // 把head.next设置为newHead;如果是第一次就是null,不是第一次newHead则不为null
            head.next = newHead;
            // 把head赋值给newHead
            newHead = head;
            // 把预先取出的temp赋值给head循环,如果是最后一个那么temp则为null,结束循环
            head = temp;
        }
		return newHead;
    }

    public static void main(String[] args) {

    }
}
