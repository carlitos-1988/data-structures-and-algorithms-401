/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package linkedlist;



public class App {


    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();

        myLinkedList.insert(1);
        myLinkedList.insert(2);
        myLinkedList.insert(3);
        myLinkedList.insert(5);
        myLinkedList.insert(8);

        StringBuilder myResult = new StringBuilder();
        myResult = myLinkedList.toStringA();
//        System.out.println(myResult.toString());

        myLinkedList.insertAfter(10,11);
        StringBuilder myOtherResult = new StringBuilder();
        myOtherResult = myLinkedList.toStringA();
//        System.out.println(myOtherResult.toString());

//        myLinkedList.insert(55);
//        myLinkedList.setTail(new Node(66));
//        System.out.println(myLinkedList.toStringA());


        LinkedList testForPrevious = new LinkedList();
        testForPrevious.insert(11);
        testForPrevious.insert(22);
        testForPrevious.insert(33);
        testForPrevious.insert(44);
        testForPrevious.insert(55);
        testForPrevious.insert(66);

        StringBuilder printResults = new StringBuilder();
        printResults = testForPrevious.toStringA();
        System.out.println(printResults.toString());

        System.out.println(testForPrevious.kthEnd(4));

        System.out.println("------------------------------------------------------");

        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        list1.insert(1);
        list1.insert(3);
        list1.insert(2);

        list2.insert(5);
        list2.insert(9);
        list2.insert(4);

        LinkedList zippedList = new LinkedList();
        zippedList = zippedList.zipLists(list1,list2);

        StringBuilder zipResults = new StringBuilder();
        zipResults = zippedList.toStringA();
        System.out.println(zipResults.toString());




    }
}
