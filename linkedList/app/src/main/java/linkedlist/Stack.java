package linkedlist;

public class Stack {

    Node top = null;
    private int size;

    public Stack() {
        this.size = 0;
    }

    public Stack(Node node) {
        this.top = node;
        this.size = 0;
    }

    public void push(Node inputNode) {
        //set the inputs node.next to be equal to the top since it is LIFO meaning method will push from top the stack will always be created with at least one Node already there
        inputNode.next = this.top;
        this.top = inputNode;
        this.size++;
    }

    public int pop() {
        if (this.top == null) {
            throw new IllegalArgumentException("stack is currently null");
        } else {
            int topValue = this.top.value;
            this.top = top.next;
            this.size--;
            return topValue;
        }
    }

    public int peek() {
        if (this.top == null) {
            throw new IllegalArgumentException("list is null");
        } else {
            return this.top.value;
        }
    }

    public boolean isEmpty() {
        if (this.top != null) {
            return true;
        } else {
            return false;
        }

    }

    public int getSize() {
        return size;
    }


}
