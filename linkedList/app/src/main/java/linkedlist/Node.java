package linkedlist;

public class Node {
    public int value;
    public Node next = null;

    Node(int value)
    {
        this.value = value;
    }

    Node(){

    }

    public void setNext(Node next) {
        if(next.equals(null)){
            System.out.println("Empty Node passed In");
        } else{
            this.next = next;
        }

    }
}
