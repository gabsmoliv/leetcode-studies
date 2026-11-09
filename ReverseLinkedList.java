public class ReverseLinkedList {

    /*
     * LeetCode Number 206 - Easy
     * 
     * Given the head of a singly linked list, reverse the list, and return the
     * reversed list.
     * 
     * Constraints:
     * 
     * The number of nodes in the list is the range [0, 5000].
     * -5000 <= Node.val <= 5000
     * 
     */

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
