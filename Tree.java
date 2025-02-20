public class Tree {
    // Node class
    private class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    private Node root;

    public Tree() {
        root = null;
    }

    // Insert method to add elements to the tree
    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    // Contains method to search for a key
    public Integer contains(int key) {
        Node result = containsRec(root, key);
        return (result == null) ? null : result.data;
    }

    // Recursive search helper method
    private Node containsRec(Node root, int key) {
        if (root == null || root.data == key) {
            return root;
        }

        if (key < root.data) {
            return containsRec(root.left, key);
        }

        return containsRec(root.right, key);
    }
}
