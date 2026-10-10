# Get Node Value from Tail

- Move `lead` forward by `positionFromTail` nodes.
- Move `lead` and `follow` together until `lead` reaches the last node.
- `follow` is now the requested node.

**Pattern:** two pointers with a fixed gap. Time `O(n)`, space `O(1)`.
