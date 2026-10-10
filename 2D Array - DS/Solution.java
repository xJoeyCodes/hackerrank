// Method/snippet only. Add required imports and HackerRank node types in the editor.

public static int hourglassSum(List<List<Integer>> arr) {
    int max = Integer.MIN_VALUE;

    for (int r = 0; r <= 3; r++) {
        for (int c = 0; c <= 3; c++) {
            int sum = arr.get(r).get(c) + arr.get(r).get(c + 1)
                    + arr.get(r).get(c + 2)
                    + arr.get(r + 1).get(c + 1)
                    + arr.get(r + 2).get(c) + arr.get(r + 2).get(c + 1)
                    + arr.get(r + 2).get(c + 2);
            max = Math.max(max, sum);
        }
    }
    return max;
}
