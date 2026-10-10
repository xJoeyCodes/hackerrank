# 2D Array - DS (Hourglass Sum)

- Check each possible top-left corner of a 3×3 hourglass (rows and columns `0..3`).
- Add the top row, center cell, and bottom row.
- Track the maximum, starting at `Integer.MIN_VALUE` so negative sums work.

**Pattern:** fixed-size grid scan. Time `O(1)` for the fixed 6×6 grid.
