package binary_tree;

import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestor {
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    static boolean findPath(Node root, int target, List<Node> path) {
        if (root == null) {
            return false;
        }

        path.add(root);
        if (root.value == target || findPath(root.left, target, path) || findPath(root.right, target, path)) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }

    static Node lowestCommonAncestor(Node root, int first, int second) {
        List<Node> firstPath = new ArrayList<>();
        List<Node> secondPath = new ArrayList<>();
        if (!findPath(root, first, firstPath) || !findPath(root, second, secondPath)) {
            return null;
        }

        Node ancestor = null;
        int index = 0;
        while (index < firstPath.size() && index < secondPath.size()
                && firstPath.get(index) == secondPath.get(index)) {
            ancestor = firstPath.get(index);
            index++;
        }
        return ancestor;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Node ancestor = lowestCommonAncestor(root, 4, 5);
        System.out.println("Lowest common ancestor: " + (ancestor == null ? -1 : ancestor.value));
    }
}