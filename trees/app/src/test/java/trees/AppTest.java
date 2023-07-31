/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import implementation.BinaryTree;
import implementation.BinaryTreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void checkEmptyTree(){
        BinaryTree myBinaryTree = new BinaryTree();
        Assertions.assertTrue(myBinaryTree.root == null);
    }

    @Test
    void checkNode(){

        BinaryTreeNode myNode = new BinaryTreeNode(10);
        BinaryTree myBinaryTree = new BinaryTree(myNode);


        Assertions.assertTrue(myBinaryTree.root.getInternalValue() == 10);
    }



    @Test
    void testInsert(){
        BinaryTree binaryTree = new BinaryTree();

       



//        System.out.println(binaryTree.postOrder());
//        System.out.println(binaryTree.preOrder());
//        System.out.println(binaryTree.inOrder());

        String expected ="[6, 5, 4, 3, 2, 1]";

        System.out.println(binaryTree.treeToString(binaryTree,3));
        Assertions.assertEquals(expected.toString(), binaryTree.postOrder().toString());


    }

    @Test
    void testPostOrder(){
        BinaryTree binaryTree = new BinaryTree();
        BinaryTreeNode one = new BinaryTreeNode(1);
        BinaryTreeNode two = new BinaryTreeNode(2);
        BinaryTreeNode three = new BinaryTreeNode(3);
        BinaryTreeNode four = new BinaryTreeNode(4);
        BinaryTreeNode five = new BinaryTreeNode(5);
        BinaryTreeNode six = new BinaryTreeNode(6);



        binaryTree.addBinaryTreeNode(one);
        binaryTree.addBinaryTreeNode((two));
        binaryTree.addBinaryTreeNode(three);
        binaryTree.addBinaryTreeNode(four);
        binaryTree.addBinaryTreeNode(five);
        binaryTree.addBinaryTreeNode(six);

        String expected ="[6, 5, 4, 3, 2, 1]";

        Assertions.assertEquals(expected.toString(), binaryTree.postOrder().toString());
    }
}
