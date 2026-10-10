# Jesse and Cookies

- Put all sweetness values in a min-heap.
- While the minimum is below `k`, remove the two smallest and insert `least + 2 * secondLeast`.
- If fewer than two values remain while the minimum is too small, return `-1`.

**Pattern:** greedy min-heap. Time `O(n log n)`.
