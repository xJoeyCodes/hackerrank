# Array Manipulation

- Use a difference array instead of updating every index in each range.
- Add `k` at `a`, subtract `k` at `b + 1`.
- Take a prefix sum; its running value is the final value at each index.
- Track the maximum. Use `long` to avoid overflow.

**Pattern:** difference array + prefix sum. Time `O(n + q)`.
