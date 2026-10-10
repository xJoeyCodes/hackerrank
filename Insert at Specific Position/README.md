# Insert at Specific Position

- If position is `0`, insert before the current head and return the new node.
- Otherwise stop at the node just before the target position.
- Point the new node at the next node, then link the previous node to the new node.

**Pattern:** pointer rewiring. Time `O(n)`.
