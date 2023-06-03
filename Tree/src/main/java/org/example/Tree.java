package org.example;

public class Tree<T> {
    private TreeNode<T> root;

    public Tree(T value) {
        if (value == null) {
            throw new IllegalArgumentException("Cannot insert null value!");
        }

        this.root = new TreeNode<>(value);
    }

    public Tree(T value, Tree<T>... children) {
        this(value);

        for (Tree<T> child : children) {
            this.root.addChild(child.root);
        }
    }

    public TreeNode<T> getRoot() {
        return this.root;
    }

    private void printDFS(TreeNode<T> root, String spaces) {
        if (this.root == null) {
            return;
        }

        System.out.println(spaces + root.getValue());

        TreeNode<T> child;
        for (int i = 0; i < root.getChildrenCount(); i++) {
            child = root.getChild(i);
            printDFS(child, spaces + "   ");
        }
    }

    public void traverseDFS() {
        this.printDFS(this.root, new String());
    }
}
