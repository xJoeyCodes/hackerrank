# Delete a Node

- If deleting position `0`, return `head.next` because the head changes.
- Otherwise move to the node before the target and skip the target with `current.next = current.next.next`.
- Return the original head.

**Pattern:** pointer rewiring. Time `O(n)`.
