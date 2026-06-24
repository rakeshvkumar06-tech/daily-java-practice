class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class Binarysearchtree {

    Node root;

    Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    boolean search(Node root, int key) {
        if (root == null)
            return false;

        if (root.data == key)
            return true;

        if (key < root.data)
            return search(root.left, key);

        return search(root.right, key);
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    int findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }
    int findMax(Node root) {
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }
    int countNodes(Node root) {
        if (root == null)
            return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
     int sum(Node root) {
        if (root == null) {
            return 0;
        }
        return root.data + sum(root.left) + sum(root.right);
    }
    int height(Node root) {

    if (root == null)
        return -1;

    return 1 + Math.max(height(root.left), height(root.right));
}
    public static void main(String[] args) {
        Binarysearchtree tree = new Binarysearchtree();
        int[] arr = {50, 30, 70, 20, 40, 60, 80};
        for (int num : arr) {
            tree.root = tree.insert(tree.root, num);
        }
        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.root);
        System.out.print("\nPreorder Traversal: ");
        tree.preorder(tree.root);
        System.out.print("\nPostorder Traversal: ");
        tree.postorder(tree.root);
        System.out.println("\nSearch 40: " + tree.search(tree.root, 40));
        System.out.println("Search 90: " + tree.search(tree.root, 90));
        System.out.println("Minimum: " + tree.findMin(tree.root));
        System.out.println("Maximum: " + tree.findMax(tree.root));
        System.out.println("Total Nodes: " + tree.countNodes(tree.root));
        System.out.println("Sum of all nodes = " + tree.sum(tree.root));
        System.out.println("Height of BST: " + tree.height(tree.root));
    }
}