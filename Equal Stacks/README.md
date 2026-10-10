# Equal Stacks

- Calculate each stack's total height.
- While the totals differ, remove the top cylinder from a stack with the greatest total and subtract its height.
- When all totals match, return that height.

**Pattern:** greedy reduction. Time `O(n1 + n2 + n3)`. The lists are ordered top-to-bottom.
