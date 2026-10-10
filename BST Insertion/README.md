# BST Insertion

- If the current node is null, create and return the new node.
- Recurse left for smaller values and right for larger values.
- Assign the returned subtree to the matching child and return the original root.

**Pattern:** BST recursion. Average `O(log n)`, worst case `O(n)`.
