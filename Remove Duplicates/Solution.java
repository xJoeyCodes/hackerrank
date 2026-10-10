// Method/snippet only. Add required imports and HackerRank node types in the editor.

public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode llist) {
    SinglyLinkedListNode current = llist;

    while (current != null && current.next != null) {
        if (current.data == current.next.data) {
            current.next = current.next.next;
        } else {
            current = current.next;
        }
    }
    return llist;
}
