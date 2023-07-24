package linkedlist;

public class Queue {

    Node front = null;
    Node back = null;

    public Queue() {
    }

    public void enqueue(Node node) {
        if (this.back == null) {
            this.back = node;
        } else {
            this.back.setNext(node);
            this.back = node;
        }
    }

    public int dequeue() {
        if (front != null) {
            int returnValue = this.front.value;
            this.front = this.front.next;
            return returnValue;
        } else {
            return -1;
        }
    }

    public int peek(){
        if (this.front != null){
            return this.front.value;
        }else{
            return -1;
        }
    }

    public boolean isEmpty(){
        return this.front == null;
    }


}
