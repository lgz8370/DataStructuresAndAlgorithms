package 链表;


/**
 * @author luguozheng
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }

    /**
     *
     * @param vals 节点值
     * @return 头部节点对象
     */
    public static ListNode getInstance(int... vals) {
        if (vals.length == 0) {
	        return null;
        }
        ListNode zero = new ListNode(-1);
        ListNode temp = zero;
        for (int val : vals) {
            ListNode listNode = new ListNode(val);
            temp.next = listNode;
            temp = listNode;
        }
        return zero.next;
    }

}
