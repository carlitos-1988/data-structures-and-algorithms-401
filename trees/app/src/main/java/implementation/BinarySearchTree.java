package implementation;

public class BinarySearchTree extends BinaryTree {
    public void add(Integer value) {
        BinaryTreeNode newNode = new BinaryTreeNode(value);
        if (super.root == null) {
            super.root = newNode;
        } else {
            add(super.root, newNode);
        }
    }

    void add(BinaryTreeNode current, BinaryTreeNode nodeToAdd) {
        if (current == null) return;

        if (nodeToAdd.internalValue < current.internalValue) {
            if (current.left == null) {
                current.left = nodeToAdd;
            } else {
                add(current.left, nodeToAdd);
            }
        } else {
            if (current.right == null) {
                current.right = nodeToAdd;
            } else {
                add(current.right, nodeToAdd);
            }
        }

    }

    public boolean contains(Integer value) {
        return contains(root, value);

    }

    boolean contains(BinaryTreeNode current, Integer value) {
        if (current == null) {
            return false;
        }
        if (current.internalValue == value) {
            return true;
        }
        return contains(current.left, value) || contains(current.right, value);

    }

    public int findLargest(){
        int largestValue = findLargest(super.root);
        return  largestValue;

    }

    public int findLargest(BinaryTreeNode current){
        if(current == null){
            return -1;
        }

        int leftLargest = findLargest(current.left);
        int rightLargest = findLargest(current.right);

        //does comparason to check the largest of the two values used Chat-GPT for this
        return Math.max(current.internalValue, Math.max(leftLargest, rightLargest));
    }

}
