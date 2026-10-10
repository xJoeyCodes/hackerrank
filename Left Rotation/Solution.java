// Method/snippet only. Add required imports and HackerRank node types in the editor.

public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    int n = arr.size();
    d %= n;
    List<Integer> result = new ArrayList<>(n);

    for (int i = 0; i < n; i++) {
        result.add(arr.get((i + d) % n));
    }
    return result;
}
