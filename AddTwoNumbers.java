
public class AddTwoNumbers {

    /*
     * LeetCode Number 88 - Easy
     * 
     * You are given two non-empty linked lists representing two non-negative
     * integers. The digits are stored in reverse order, and each of their nodes
     * contains a single digit. Add the two numbers and return the sum as a linked
     * list.
     * 
     * You may assume the two numbers do not contain any leading zero, except the
     * number 0 itself.
     * 
     * Constraints:
     * 
     * The number of nodes in each linked list is in the range [1, 100].
     * 0 <= Node.val <= 9
     * It is guaranteed that the list represents a number that does not have leading
     * zeros.
     * 
     * Expected outputs for the given examples:
     * -> 7,0,8
     * -> 0
     */

    public static void main(String[] args) {
        System.out.println(addTwoNumbers(new ListNode(2, new ListNode(4, new ListNode(3))),
                new ListNode(5, new ListNode(6, new ListNode(4)))));
        System.out.println(addTwoNumbers(new ListNode(0), new ListNode(0)));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        // Loop as long as there are nodes to process or a carry remains
        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = x + y + carry;
            carry = sum / 10; // Calculate the carry for the next iteration (e.g., 18 / 10 = 1)

            // Create a new node with the single digit (e.g., 18 % 10 = 8)
            current.next = new ListNode(sum % 10);
            current = current.next;

            // Advance pointers if possible
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }

        return dummyHead.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}