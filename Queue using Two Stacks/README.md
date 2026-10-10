# Queue using Two Stacks

- Push newly enqueued items onto `incoming`.
- For dequeue/peek, transfer all items to `outgoing` only when `outgoing` is empty.
- Pop for dequeue; peek for printing the front.

**Pattern:** amortized queue using two stacks. Each item moves stacks at most once.

**Note:** HackerRank's version is input-driven, so this snippet is the `main` method rather than a reusable method signature.
