package implementation;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

    public BinaryTreeNode root;

    public BinaryTree() {
    }

    public BinaryTree(BinaryTreeNode root) {
        this.root = root;
    }

    public void addBinaryTreeNode(BinaryTreeNode nodeToAdd){
        if (this.root == null){
            this.root = nodeToAdd;
        }else {
            this.root = addBinaryTreeNode(this.root, nodeToAdd);
        }


    }

    private BinaryTreeNode addBinaryTreeNode(BinaryTreeNode curr, BinaryTreeNode nodeToAdd) {
        if (curr == null) {
            return nodeToAdd;
        }

        if (nodeToAdd.internalValue < curr.internalValue) {
            curr.left = addBinaryTreeNode(curr.left, nodeToAdd);
        } else {
            curr.right = addBinaryTreeNode(curr.right, nodeToAdd);
        }

        return curr;
    }

//        if (nodeToAdd.internalValue < curr.internalValue) {
//            if (curr.left == null) {
//                curr.left = nodeToAdd;
//            } else {
//                addBinaryTreeNode(curr.left, nodeToAdd);
//            }
//        } else {
//            if (curr.right == null) {
//                curr.right = nodeToAdd;
//            } else {
//                addBinaryTreeNode(curr.right, nodeToAdd);
//            }
//        }

    public List<Integer> preOrder(){
        List<Integer> values = new ArrayList<>();
        preOrder(this.root, values);
        return values;
    }
    void preOrder(BinaryTreeNode current, List values){

        //Base Case
        if(current == null){
            return;
        }

        //Step 1: add the current Node's value to the values list
        values.add(current.internalValue);

        //Step 2: go LEFT
        preOrder(current.left,values);

        //Step 3: go RIGHT

        preOrder(current.right, values);


    }

    public List<Integer> inOrder(){
        List<Integer> values = new ArrayList<>();

        preOrder(this.root, values);

        return values;
    }

    void inOrder(BinaryTreeNode current,List values){
        //base case
        if (current == null){
            return;
        }

        // Left, current(root), Right

        //Task 1: Go left
        inOrder(current.left,values);

        //Task 2: Add current to values list
        values.add(current.internalValue);
        //Task 3: go right
        inOrder(current.right, values);
    }

    public List<Integer> postOrder(){
        List<Integer> values = new ArrayList<>();

        postOrder(root,values);

        return values;
    }

    void postOrder(BinaryTreeNode current, List<Integer> values){
        //base case
        if (current == null){
            return;
        }

        // Left, Right, Current(root)

        //Task 1: Go left
        postOrder(current.left,values);

        //Task 2: go right
        postOrder(current.right, values);

        //Task 3: Add current to values list
        values.add(current.internalValue);


    }

    public String toString() {
        return "BinaryTree{\n" + treeToString(root, 0) + "}";
    }


    public String treeToString(BinaryTreeNode node, int depth) {
        StringBuilder sb = new StringBuilder();

        // Indent the current node based on its depth
        for (int i = 0; i < depth; i++) {
            sb.append("  ");
        }

        if (node == null) {
            sb.append("null\n"); // Display "null" for a null node
        } else {
            // Display the node's internalValue
            sb.append(node.internalValue).append("\n");

            // Recursively add the left and right subtrees
            sb.append(treeToString(node.left, depth + 1));
            sb.append(treeToString(node.right, depth + 1));
        }

        return sb.toString();
    }
}
