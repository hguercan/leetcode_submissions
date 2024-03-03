/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func removeNthFromEnd(head *ListNode, n int) *ListNode {
    pointerToHead := &ListNode{Next: head}
    var nodes []*ListNode
    currNode := pointerToHead
    for currNode != nil {
        nodes = append(nodes, currNode)
        currNode = currNode.Next
    }
    nodesLen := len(nodes)
    nodesToRemoveIndex := nodesLen - n -1
    nodes[nodesToRemoveIndex].Next = nodes[nodesToRemoveIndex].Next.Next
    return pointerToHead.Next
}