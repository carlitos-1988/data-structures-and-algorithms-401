package implementation;

public class BinaryTreeNode {

    Integer internalValue;

    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public BinaryTreeNode(Integer value){
        this.internalValue = value;
    }


    public Integer getInternalValue() {
        return internalValue;
    }

    public void setInternalValue(Integer internalValue) {
        this.internalValue = internalValue;
    }

    @Override
    public String toString() {
        return "BinaryTreeNode{" + "\n"+
                "internalValue=" + internalValue +"\n"+
                ", left=" + left +"\n"+
                ", right=" + right +"\n"+
                '}';
    }
}
