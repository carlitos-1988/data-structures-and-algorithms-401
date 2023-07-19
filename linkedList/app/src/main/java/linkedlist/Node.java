package linkedlist;

public class Node {
    public int value;
    public Node next = null;

    public Node previous = null;

    Node(int value)
    {
        this.value = value;
    }

    Node(){

    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setNext(Node next) {
        if(next.equals(null)){
            System.out.println("Empty Node passed In");
        } else{
            this.next = next;
        }

    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + this.value +
                ", next=" + this.next +
                ", previous=" + this.previous +
                '}';
    }
}
