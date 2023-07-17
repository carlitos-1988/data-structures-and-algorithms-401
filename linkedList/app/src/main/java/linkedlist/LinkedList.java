package linkedlist;

public class LinkedList {
    Node head = null;
    Node tail = null;  // not strictly required

    public LinkedList(){
        this.head = null;
        this.tail = null;
    }


    //Will insert at the end of the linkedList seemed more challenging
    public void insert(int value)
    {
        Node trackedNode = new Node(value);

        if(this.head == null){
            this.head = trackedNode;
        }else{
            Node currentNode = head;
            while (currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.setNext(trackedNode);
        }



    }
    public boolean includes(int value)
    {

        Node curr = this.head;

        while (curr.next != null){
            if(curr.value == value){
                return true;
            }
            curr = curr.next;
        }

        return false;
    }


    public StringBuilder toStringA()
    {
        StringBuilder toStringLinkedList = new StringBuilder();
        Node curr = this.head;
        char myCharTracker = 97;
        while (curr != null){
            toStringLinkedList.append("{ ");
            toStringLinkedList.append(myCharTracker);
            toStringLinkedList.append(" }->");

            myCharTracker ++;
            curr = curr.next;
        }

        return toStringLinkedList;
    }
}
