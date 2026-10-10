# Find Merge Point

- Use two pointers, one per list.
- When a pointer reaches null, redirect it to the other list's head.
- They travel the same total distance and meet at the shared node.

**Pattern:** two-pointer head switching. Time `O(m + n)`, space `O(1)`.
