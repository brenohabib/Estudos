package org.Arvore;

public class Tree {
    public enum Position {
        LEFT,
        CENTER,
        RIGHT
    }

    private static class Node {
        private String label;
        private int value;
        private Node left, center, right;

        public Node(String label, int value) {
            this.label = label;
            this.value = value;
        }
    }

    private Node root;

    public Tree() {
        root = null;
    }

    public void insertNode(String parentLabel, String label, int value, Position position) {
        if (root == null) {
            root = new Node(label, value);
            return;
        }

        Node parentNode = findNode(root, parentLabel);

        if (parentNode == null) {
            System.out.println("Nó especificado não existe");
            return;
        }

        Node newNode = new Node(label, value);
        switch (position) {
            case LEFT:
                parentNode.left = newNode;
                break;
            case CENTER:
                parentNode.center = newNode;
                break;
            case RIGHT:
                parentNode.right = newNode;
                break;
        }
    }

    public void removeNode(String parentLabel, Position position) {
        if (root == null) {
            return;
        }

        if (parentLabel == null) {
            root = null;
            return;
        }

        Node parentNode = findNode(root, parentLabel);

        if (parentNode == null) {
            System.out.println("Nó especificado não existe");
            return;
        }

        switch (position) {
            case LEFT:
                removeNode(parentNode.left);
                parentNode.left = null;
                break;
            case CENTER:
                removeNode(parentNode.center);
                parentNode.center = null;
                break;
            case RIGHT:
                removeNode(parentNode.right);
                parentNode.right = null;
                break;
        }
    }

    private void removeNode(Node node) {
        if (node == null) {
            return;
        }

        removeNode(node.left);
        removeNode(node.center);
        removeNode(node.right);

        node.left = null;
        node.center = null;
        node.right = null;
    }

    private Node findNode(Node current, String label) {
        if (current == null) {
            return null;
        }

        if (current.label.equals(label)) {
            return current;
        }

        Node found = findNode(current.left, label);
        if (found != null) {
            return found;
        }

        found = findNode(current.center, label);
        if (found != null) {
            return found;
        }

        return findNode(current.right, label);
    }

    public int getNodeValue(String label) {
        if (root == null) {
            return -1;
        }
        Node node = findNode(root, label);
        if (node == null) {
            return -1;
        }
        return node.value;
    }

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insertNode(null, "root", 0, null);
        tree.insertNode("root", "a", 1, Position.LEFT);
        tree.insertNode("root", "b", 2, Position.CENTER);
        tree.insertNode("root", "c", 3, Position.RIGHT);
        tree.insertNode("c", "d", 4, Position.LEFT);
        tree.insertNode("c", "e", 5, Position.RIGHT);

        tree.removeNode("root", Position.RIGHT);

        System.out.println(tree.getNodeValue("d"));
    }
}