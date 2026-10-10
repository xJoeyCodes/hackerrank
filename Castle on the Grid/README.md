# Castle on the Grid

- Run BFS from the start cell.
- From each cell, scan in all four directions until hitting a wall or grid edge.
- Every reachable unvisited cell in a straight line is one move away; record its distance and enqueue it.
- Return the goal's distance, or `-1` if unreachable.

**Pattern:** BFS on a grid with sliding moves. Worst-case time can be `O(n^3)` with repeated ray scans.
