// Method/snippet only. Add required imports and HackerRank node types in the editor.

public static int minimumMoves(List<String> grid, int startX, int startY, int goalX, int goalY) {
    int n = grid.size();
    int[][] distance = new int[n][n];
    for (int[] row : distance) Arrays.fill(row, -1);

    Queue<int[]> queue = new ArrayDeque<>();
    queue.add(new int[]{startX, startY});
    distance[startX][startY] = 0;

    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};

    while (!queue.isEmpty()) {
        int[] cell = queue.remove();
        int x = cell[0], y = cell[1];
        if (x == goalX && y == goalY) return distance[x][y];

        for (int direction = 0; direction < 4; direction++) {
            int nx = x + dx[direction], ny = y + dy[direction];
            while (nx >= 0 && nx < n && ny >= 0 && ny < n && grid.get(nx).charAt(ny) == '.') {
                if (distance[nx][ny] == -1) {
                    distance[nx][ny] = distance[x][y] + 1;
                    queue.add(new int[]{nx, ny});
                }
                nx += dx[direction];
                ny += dy[direction];
            }
        }
    }
    return -1;
}
