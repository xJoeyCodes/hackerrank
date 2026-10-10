// Method/snippet only. Add required imports and HackerRank node types in the editor.

public static void topView(Node root) {
    if (root == null) return;

    class Item {
        Node node;
        int hd;
        Item(Node node, int hd) { this.node = node; this.hd = hd; }
    }

    Queue<Item> queue = new ArrayDeque<>();
    Map<Integer, Integer> firstAtDistance = new TreeMap<>();
    queue.add(new Item(root, 0));

    while (!queue.isEmpty()) {
        Item item = queue.remove();
        firstAtDistance.putIfAbsent(item.hd, item.node.data);

        if (item.node.left != null) queue.add(new Item(item.node.left, item.hd - 1));
        if (item.node.right != null) queue.add(new Item(item.node.right, item.hd + 1));
    }

    for (int value : firstAtDistance.values()) {
        System.out.print(value + " ");
    }
}
