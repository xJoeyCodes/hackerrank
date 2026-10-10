# Remove Duplicates

- The list is sorted, so duplicates are adjacent.
- If the next node has the same value, skip it without advancing.
- Otherwise advance to the next node.

**Pattern:** in-place linked-list scan. Time `O(n)`, space `O(1)`.
