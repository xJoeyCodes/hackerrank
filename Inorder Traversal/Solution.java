// Method/snippet only. Add required imports and HackerRank node types in the editor.

public static void inOrder(Node root) {
    if (root == null) return;
    inOrder(root.left);
    System.out.print(root.data + " ");
    inOrder(root.right);
}
