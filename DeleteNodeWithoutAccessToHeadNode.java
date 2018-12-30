class DeleteNodeWithoutAccessToHeadNode {
    public void deleteNode(ListNode node) {
        if(node == null)
            return;
        
        int value = node.next.val;
        node.val = value;
        node.next = node.next.next;
    }
}
