# Reverse a Linked List

- Keep `previous`, `current`, and the saved `next` node.
- Reverse the current link, then advance both pointers.
- When `current` becomes null, `previous` is the new head.

**Pattern:** iterative pointer reversal. Time `O(n)`, space `O(1)`.
