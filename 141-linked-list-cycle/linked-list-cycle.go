/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func hasCycle(head *ListNode) bool {
    if head == nil || head.Next == nil {
        return false
    }

    seenNodes := map[*ListNode]bool{}

    currNode := head
    for currNode.Next != nil {
        seenNodes[currNode] = true
        _, ok := seenNodes[currNode.Next]
        if ok {
            return true
        }
        currNode = currNode.Next;
    }
    return false
}