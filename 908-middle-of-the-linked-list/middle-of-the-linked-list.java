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
        }

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
    }
}