/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void appHasAGreeting() {
        App classUnderTest = new App();
    }

    @Test
    void createEmptyLinkedList() {
        // Arrange
        LinkedList teskLinkedList = new LinkedList();
        Node mytestNode = new Node(5);

        //assert
        assertTrue(teskLinkedList.head == null, "Condition met passed Test emptyArray created");
    }

    //edge case for ensuring empty array list is generated
    @Test
    void testEmptyListEdgeCase() {
        //Arrange
        LinkedList teskLinkedList = new LinkedList();
        Node mytestNode = new Node(5);
        assertFalse(teskLinkedList.head == mytestNode, "Passed test ?");
    }

    @Test
    void checkInsertToLinkedList() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(5);
        assertTrue(testLinkedList.head.value == 5, "value and Node is there");
    }

    @Test
    void insertToLinkedLits() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(10);

        assertTrue(testLinkedList.head.value == 10, "inserted to linked list ");

    }

    @Test
    void checkValue() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(5);
        testLinkedList.insert(10);
        assertFalse(testLinkedList.includes(5));
    }

    //passed but getting random error
    @Test
    void checkStrings() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(1);
        testLinkedList.insert(2);
        testLinkedList.insert(3);
        StringBuilder result = testLinkedList.toStringA();
        String expectedResult = "{ a }->{ b }->{ c }->";

        assertTrue(expectedResult.equals(result.toString()));
    }

}
