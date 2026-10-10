# Top View

- Do level-order traversal (BFS), tracking each node's horizontal distance from the root.
- Left child decreases distance; right child increases it.
- Keep only the first node encountered at each distance; a sorted map prints left-to-right.

**Pattern:** BFS + horizontal distance. Time `O(n log n)`, space `O(n)`.
