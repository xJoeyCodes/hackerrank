// Method/snippet only. Add required imports and HackerRank node types in the editor.

public static Node insert(Node root, int data) {
    if (root == null) return new Node(data);

    if (data < root.data) {
        root.left = insert(root.left, data);
    } else if (data > root.data) {
        root.right = insert(root.right, data);
    }
    return root;
}
