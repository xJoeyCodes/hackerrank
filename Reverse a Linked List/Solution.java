// Method/snippet only. Add required imports and HackerRank node types in the editor.

public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
    SinglyLinkedListNode previous = null;
    SinglyLinkedListNode current = llist;

    while (current != null) {
        SinglyLinkedListNode next = current.next;
        current.next = previous;
        previous = current;
        current = next;
    }
    return previous;
}
