package tree;

import java.util.ArrayList;
import java.util.HashSet;

public class TreeValuesFinder {
    public ArrayList<Integer> findCommonValues(Tree<Integer> tree1, Tree<Integer> tree2) {

        if(tree1.root == null || tree2.root == null){
            throw new IllegalArgumentException("The tree needs to have a non null root value");
        }

        HashSet<Integer> firstTreeSet = new HashSet<>();
        firstTreeSet = preOrderTraversal(tree1.root, firstTreeSet);

        ArrayList<Integer> sharedValues = new ArrayList<>();
        sharedValues = findCommonValuesPreOrder(tree2.root, sharedValues, firstTreeSet);

        return sharedValues;
    }

    private HashSet<Integer> preOrderTraversal(TreeNode<Integer> node, HashSet<Integer> values) {
        if (node == null) {
            return values;
        }

        values.add(node.value);
        preOrderTraversal(node.left, values);
        preOrderTraversal(node.right, values);

        return values;
    }

    private ArrayList<Integer> findCommonValuesPreOrder(TreeNode<Integer> node, ArrayList<Integer> commonValues, HashSet<Integer> firstTree) {
        if (node == null) {
            return commonValues;
        }

        if (firstTree.contains(node.value)) {
            commonValues.add(node.value);
        }

        findCommonValuesPreOrder(node.left, commonValues, firstTree);
        findCommonValuesPreOrder(node.right, commonValues, firstTree);

        return commonValues;
    }
}
