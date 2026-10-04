package binary_tree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TopViewOfTree {
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    static class NodeWithDistance {
        Node node;
        int horizontalDistance;

        NodeWithDistance(Node node, int horizontalDistance) {
            this.node = node;
            this.horizontalDistance = horizontalDistance;
        }
    }

    static void printTopView(Node root) {
        if (root == null) {
            return;
        }

        Map<Integer, Integer> topView = new TreeMap<>();
        Queue<NodeWithDistance> queue = new LinkedList<>();
        queue.add(new NodeWithDistance(root, 0));

        while (!queue.isEmpty()) {
            NodeWithDistance current = queue.remove();
            topView.putIfAbsent(current.horizontalDistance, current.node.value);

            if (current.node.left != null) {
                queue.add(new NodeWithDistance(current.node.left, current.horizontalDistance - 1));
            }
            if (current.node.right != null) {
                queue.add(new NodeWithDistance(current.node.right, current.horizontalDistance + 1));
            }
        }

        for (int value : topView.values()) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);

        System.out.print("Top view: ");
        printTopView(root);
    }
}
