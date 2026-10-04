package binary_tree;

public class BuildTreeFromPreorder {
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    static int index = 0;

    static Node buildTree(int[] preorder) {
        if (index >= preorder.length) {
            return null;
        }
        if (preorder[index] == -1) {
            index++;
            return null;
        }

        Node root = new Node(preorder[index++]);
        root.left = buildTree(preorder);
        root.right = buildTree(preorder);
        return root;
    }

    static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.value + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 4, -1, -1, -1, 3, -1, -1};
        index = 0;
        Node root = buildTree(values);

        System.out.print("Preorder: ");
        preorder(root);
    }
}
