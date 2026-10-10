# Tree Height

- Base case: an empty tree has height `-1` under HackerRank's edge-count definition.
- Recursively find each subtree's height and return one plus the larger height.

**Pattern:** tree recursion. Time `O(n)`, space `O(h)` call stack.

**Signature reminder:** use `Node root` (the HackerRank binary-tree node type), not `SinglyLinkedListNode`.
