// Method/snippet only. Add required imports and HackerRank node types in the editor.

public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {
    SinglyLinkedListNode lead = llist;
    SinglyLinkedListNode follow = llist;

    for (int i = 0; i < positionFromTail; i++) {
        lead = lead.next;
    }
    while (lead.next != null) {
        lead = lead.next;
        follow = follow.next;
    }
    return follow.data;
}
