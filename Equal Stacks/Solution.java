// Method/snippet only. Add required imports and HackerRank node types in the editor.

public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
    int i = 0, j = 0, k = 0;
    int sum1 = h1.stream().mapToInt(Integer::intValue).sum();
    int sum2 = h2.stream().mapToInt(Integer::intValue).sum();
    int sum3 = h3.stream().mapToInt(Integer::intValue).sum();

    while (true) {
        if (sum1 == sum2 && sum2 == sum3) return sum1;

        if (sum1 >= sum2 && sum1 >= sum3) {
            sum1 -= h1.get(i++);
        } else if (sum2 >= sum1 && sum2 >= sum3) {
            sum2 -= h2.get(j++);
        } else {
            sum3 -= h3.get(k++);
        }
    }
}
