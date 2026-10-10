// Method/snippet only. Add required imports and HackerRank node types in the editor.

public static void postOrder(Node root) {
    if (root == null) return;
    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.data + " ");
}
