// Method/snippet only. Add required imports and HackerRank node types in the editor.

public static SinglyLinkedListNode insertNodeAtPosition(
        SinglyLinkedListNode llist, int data, int position) {
    SinglyLinkedListNode node = new SinglyLinkedListNode(data);
    if (position == 0) {
        node.next = llist;
        return node;
    }

    SinglyLinkedListNode current = llist;
    for (int i = 0; i < position - 1; i++) {
        current = current.next;
    }
    node.next = current.next;
    current.next = node;
    return llist;
}
