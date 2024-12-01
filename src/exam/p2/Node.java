package exam.p2;

public class Node {
    private int node;
    private int leftNode;
    private int rightNode;

    public Node(int node, int leftNode, int rightNode) {
        this.node = node;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public int getNode() {
        return node;
    }

    public void setNode(int node) {
        this.node = node;
    }

    public int getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(int leftNode) {
        this.leftNode = leftNode;
    }

    public int getRightNode() {
        return rightNode;
    }

    public void setRightNode(int rightNode) {
        this.rightNode = rightNode;
    }
}
