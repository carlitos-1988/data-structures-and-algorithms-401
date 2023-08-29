/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package insertion;

import graph.Graph;
import org.junit.jupiter.api.Test;
import tree.Tree;
import tree.TreeNode;
import tree.TreeValuesFinder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    HashMap myNewHashMap = new HashMap<>(10);
    Person person1 = new Person("Juan", "Patino", 30);
    Person person2 = new Person("Maria", "Garcia", 25);
    Person person3 = new Person("Carlos", "Lopez", 40);
    Person person4 = new Person("Ana", "Martinez", 28);
    Person person5 = new Person("Pedro", "Rodriguez", 35);
    Person person6 = new Person("Sofia", "Hernandez", 22);
    Person person7 = new Person("Luis", "Gonzalez", 29);
    Person person8 = new Person("Laura", "Sanchez", 31);
    Person person9 = new Person("Diego", "Ramirez", 27);
    Person person10 = new Person("Isabella", "Perez", 33);


    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    void canCreateHashMap(){
        HashMap myNewHashMap = new HashMap<>(10);
        assertNotNull(myNewHashMap);
    }

    @Test
    void insertToHashmap(){
        setAllPersons();
        System.out.println(myNewHashMap.contains(person1.getName()));
        assertTrue(myNewHashMap.contains(person1.getName()));
    }
    @Test
    void checkReturnType(){
        setAllPersons();
        assertEquals(myNewHashMap.get(person5.getName()),person5);
    }
    @Test
    void checkKeys(){
        setAllPersons();
        String myExpectedReturn = "[Maria, Laura, Carlos, Ana, Luis, Isabella, Pedro, Juan, Sofia, Diego]";
        assertEquals(myNewHashMap.keys().toString(),myExpectedReturn);
    }

    @Test
    void checkTreeInsertion(){
        Tree<Integer> myTree1 = new Tree<>();
        myTree1 = setTreeNodes(1,2,3);
        Tree<Integer> myTree2 = new Tree<>();
        myTree2 = setTreeNodes(3,4,5);

        TreeValuesFinder treeValuesFinder = new TreeValuesFinder();
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(3);

        assertEquals(expectedResult,treeValuesFinder.findCommonValues(myTree1,myTree2));
    }

    @Test
    void checkTreeNullness(){
        Tree<Integer> myTree1 = new Tree<>();
        Tree<Integer> myTree2 = new Tree<>();
        TreeValuesFinder treeValuesFinder = new TreeValuesFinder();

        assertThrows(IllegalArgumentException.class , () -> {treeValuesFinder.findCommonValues(myTree1,myTree2);
        });
    }

    @Test
    void startGraph(){
        Graph<Integer> myLocalGraph = new Graph<>();


        myLocalGraph.addEdge(10,20,false);
        myLocalGraph.addEdge(20,30,false);
        myLocalGraph.addEdge(30,40,false);
        myLocalGraph.addEdge(40,50,false);
        myLocalGraph.addEdge(50,10,true);
        myLocalGraph.addEdge(60,70,false);
        myLocalGraph.addEdge(50,60,false);


        System.out.println(myLocalGraph.toString());
        myLocalGraph.getEdgeCount(true);



        assertTrue(myLocalGraph != null);
    }

    @Test
    void checkBreadthFirst(){
        Graph<Integer> myLocalGraph = new Graph<>();


        myLocalGraph.addEdge(10,20,false);
        myLocalGraph.addEdge(20,30,false);
        myLocalGraph.addEdge(30,40,false);
        myLocalGraph.addEdge(40,50,false);
        myLocalGraph.addEdge(50,10,true);
        myLocalGraph.addEdge(60,70,false);
        myLocalGraph.addEdge(50,60,false);

        List<Integer> checker = new ArrayList<>(Arrays.asList(50, 10, 60, 20, 70, 30, 40));

        List myReturnCheck = new ArrayList<>();
        myReturnCheck = myLocalGraph.breathFirst();

        assertEquals(myReturnCheck,checker, "Test Case passed for array:[50, 10, 60, 20, 70, 30, 40]");


    }



    public void setAllPersons(){
        myNewHashMap.set(person1.getName(),person1);
        myNewHashMap.set(person2.getName(),person2);
        myNewHashMap.set(person3.getName(),person3);
        myNewHashMap.set(person4.getName(),person4);
        myNewHashMap.set(person5.getName(),person5);
        myNewHashMap.set(person6.getName(),person6);
        myNewHashMap.set(person7.getName(),person7);
        myNewHashMap.set(person8.getName(),person8);
        myNewHashMap.set(person9.getName(),person9);
        myNewHashMap.set(person10.getName(),person10);
    }

    public Tree setTreeNodes(int x, int y, int z){
        Tree<Integer> tree1 = new Tree<>();
        tree1.root = new TreeNode<> (x);
        tree1.root.left = new TreeNode<>(y);
        tree1.root.right = new TreeNode<>(z);

        return tree1;

    }
}
