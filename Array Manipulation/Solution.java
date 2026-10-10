// Method/snippet only. Add required imports and HackerRank node types in the editor.

public static long arrayManipulation(int n, List<List<Integer>> queries) {
    long[] diff = new long[n + 2];

    for (List<Integer> query : queries) {
        int a = query.get(0);
        int b = query.get(1);
        int k = query.get(2);
        diff[a] += k;
        diff[b + 1] -= k;
    }

    long current = 0;
    long max = Long.MIN_VALUE;
    for (int i = 1; i <= n; i++) {
        current += diff[i];
        max = Math.max(max, current);
    }
    return max;
}
