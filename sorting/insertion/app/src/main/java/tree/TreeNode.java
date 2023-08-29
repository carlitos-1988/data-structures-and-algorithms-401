package tree;

import java.util.LinkedList;

public class TreeNode <T>{
    T value;
    public  TreeNode<T> left;
    public TreeNode<T> right;

    private LinkedList<TreeNode<T>> connections;

    public TreeNode(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
        this.connections = new LinkedList<>();
    }

    public LinkedList<TreeNode<T>> getConnections() {
        return this.connections;
    }

    public void setConnections(LinkedList<TreeNode<T>> connections) {
        this.connections = connections;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public TreeNode<T> getLeft() {
        return this.left;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public TreeNode<T> getRight() {
        return this.right;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }



    @Override
    public String toString() {
        String leftValue = (left != null) ? left.getValue().toString() : "null";
        String rightValue = (right != null) ? right.getValue().toString() : "null";
        return "TreeNode{" +
                "value=" + value +
                ", left=" + this.left.value +
                ", right=" + this.right.value +
                '}';
    }
}
