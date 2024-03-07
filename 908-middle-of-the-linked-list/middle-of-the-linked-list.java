/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        if (head.next == null) {
            return head;
        } else if (head.next.next == null) {
            return head.next;
        }
        
        ListNode slow = head;
        ListNode fast = head.next;

        printSlowAndFast(slow, fast);
        while (fast != null) {
            //printSlowAndFast(slow, fast);
            slow = slow.next;
            fast = getNextFast(fast);
            printSlowAndFast(slow, fast);
        }
        return slow;


        /*
        int counter = 0;
        ListNode currNode = head;
        while(currNode.next != null) {
            counter++;
            currNode = currNode.next;
        }

        int counterToMid = (int) Math.ceil(counter/2.0f);
        ListNode midOfList = head;
        System.out.println(midOfList);
        while(counterToMid > 0) {
            midOfList = midOfList.next;
            counterToMid--;
        }
        return midOfList;
        */
    }

    private ListNode getNextFast(ListNode fast) {
        return fast.next == null ? null : fast.next.next;
    }

    private void printSlowAndFast(ListNode slow, ListNode fast) {
        var slowValue = slow != null ? slow.val : -1;
        var fastValue = fast != null ? fast.val : -1;
        var msg = String.format("Slow: %d, Fast: %d", slowValue, fastValue);
        System.out.println(msg);
    }
}