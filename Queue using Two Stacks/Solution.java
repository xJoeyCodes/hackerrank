// Method/snippet only. Add required imports and HackerRank node types in the editor.

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int q = scanner.nextInt();
    Deque<Integer> incoming = new ArrayDeque<>();
    Deque<Integer> outgoing = new ArrayDeque<>();

    for (int i = 0; i < q; i++) {
        int type = scanner.nextInt();
        if (type == 1) {
            incoming.push(scanner.nextInt());
        } else {
            if (outgoing.isEmpty()) {
                while (!incoming.isEmpty()) outgoing.push(incoming.pop());
            }
            if (type == 2) outgoing.pop();
            else System.out.println(outgoing.peek());
        }
    }
}
