// Method/snippet only. Add required imports and HackerRank node types in the editor.

public static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
    SinglyLinkedListNode node = new SinglyLinkedListNode(data);
    if (head == null) {
        return node;
    }

    SinglyLinkedListNode current = head;
    while (current.next != null) {
        current = current.next;
    }
    current.next = node;
    return head;
}
