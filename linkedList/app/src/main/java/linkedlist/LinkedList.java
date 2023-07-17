package linkedlist;

public class LinkedList {
    Node head = null;
    Node tail = null;  // not strictly required

    Node previous = null;

    public LinkedList(){
        this.head = null;
        this.tail = null;
    }


    //Will insert at the end of the linkedList seemed more challenging
    public void insert(int value) {
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

    public void insertBefore(int searchValue, int newValue){

        Node curr = this.head;
        Node newNode = new Node(newValue);

        while (curr != null && curr.next != null){

            if(curr.next.value == searchValue){
                //this will set created node's next node to current node's next value
                newNode.next = curr.next;
                //we set current node to be next variable and return out since no need to iterate
                curr.next = newNode;
                return;
            }
            //need this to continue iterating if not infinite loop happens
            curr = curr.next;
        }
        //this is for the event that the loop did not find anything
        curr.next = newNode;
    }

    // same as before only thing changed was the if statement
    public void insertAfter(int searchValue, int newValue){
        Node curr = this.head;
        Node newNode = new Node(newValue);

        while (curr != null && curr.next !=null){
            if (searchValue < curr.next.value){
                System.out.println(searchValue + " modified");
                newNode.next = curr.next;
                curr.next = newNode;
                return;
            }
            curr = curr.next;
        }
        curr.next = newNode;
    }


    public StringBuilder toStringA()
    {
        StringBuilder toStringLinkedList = new StringBuilder();
        Node curr = this.head;

        while (curr != null){
            toStringLinkedList.append("{ ");
            toStringLinkedList.append(curr.value);
            toStringLinkedList.append(" }->");


            curr = curr.next;
        }

        return toStringLinkedList;
    }
}
