// Method/snippet only. Add required imports and HackerRank node types in the editor.

public static int height(Node root) {
    if (root == null) return -1;
    return 1 + Math.max(height(root.left), height(root.right));
}
