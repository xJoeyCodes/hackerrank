# Lowest Common Ancestor

- In a BST, if both values are smaller than the current node, go left.
- If both are larger, go right.
- Otherwise, the current node is where their paths split, so return it.

**Pattern:** BST property. Average `O(log n)`, worst case `O(n)`.
