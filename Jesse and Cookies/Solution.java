// Method/snippet only. Add required imports and HackerRank node types in the editor.

public static int cookies(int k, List<Integer> A) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>(A);

    int operations = 0;
    while (!minHeap.isEmpty() && minHeap.peek() < k) {
        if (minHeap.size() < 2) return -1;

        int least = minHeap.poll();
        int secondLeast = minHeap.poll();
        minHeap.offer(least + 2 * secondLeast);
        operations++;
    }
    return operations;
}
