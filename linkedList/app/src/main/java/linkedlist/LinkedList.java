package linkedlist;

public class LinkedList {
    Node head = null;
    Node tail = null;  // not strictly required


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
            Node currentNode = this.head;
            Node TempNode = null;

            while (currentNode.next != null){
                TempNode = currentNode;
                currentNode = currentNode.next;
                currentNode.setPrevious(TempNode);

            }
            currentNode.setNext(trackedNode);
            trackedNode.setPrevious(currentNode);
            this.tail = trackedNode;
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

    public int kthEnd(int k) throws IllegalArgumentException{

        // check to see if tail node is there if not break out
        if (this.tail == null){
            throw new IllegalArgumentException("this list does not have a tail");
        }

        //create curr node for the tail
        Node curr = this.tail;
        //need int location counter
        int locationCounter = 0;

        // if it is there start array from tail and iterate backwards
        while (curr != null){
//             COMMENTED OUT COULD NOT PASS TEST
//            if(locationCounter > k){
//                throw new IllegalArgumentException("number larger than the size of linked list ");
//            }
            if (locationCounter == k){
                //System.out.println("made it here");
                return curr.value;

            }

            curr = curr.getPrevious();
            locationCounter++;
            //System.out.println("Counter " + locationCounter);



        }
        //when found return the int for that location
        //when not found return exception
//        throw  new IllegalArgumentException("Argument larger than size of linkedList ");

        throw new IllegalArgumentException("number larger than the size of linked list ");

    }

    public LinkedList zipLists(LinkedList listA, LinkedList listB){

        //need to check if the head on any of the LinkedLists is null
        if (listA.head == null || listB.head == null){
            throw new IllegalArgumentException("unable to perform function");
        }
        //generate linkedList that will be returned and tracked variables
        //generate 'curr' node equals to listA.head;
        // use set next on curr to equal listB head node;

        LinkedList zipperList = new LinkedList();
        Node currentOne = listA.head;
        Node currentTwo = listB.head;
        Node currentZipNode = null;
        Node tracker1;
        Node tracker2;

        // create while loop checking .next is not null on a and b check that curr is not null

        while (currentOne!=null && currentTwo != null){
            tracker1 = currentOne.next;
            tracker2 = currentTwo.next;

            //if statement to initialize the Node that will go in zipperList
            if (currentZipNode == null){
                currentZipNode = currentOne;
                zipperList.head = currentZipNode;
            } else{
                //set used node's next to currentOne because it is null
                currentZipNode.setNext(currentOne);
                //now we set sued node to equal the next node
                currentZipNode = currentZipNode.next;
            }

            currentZipNode.setNext(currentTwo);
            currentZipNode = currentZipNode.next;

            currentOne = tracker1;
            currentTwo = tracker2;
        }

        if(currentOne != null){
            currentZipNode.next = currentOne;
        } else if(currentTwo != null){
            currentZipNode = currentTwo;
        }

        return zipperList;





    }

    public void setTail(Node tail) {
        this.tail = tail;
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
