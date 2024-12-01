package exam.p5;

public class P5Test {

    public static void main(String[] args) {
        Stack s = new Stack(5);

        s.push(10);
        s.push(20);
        s.push(30);
        s.isFull();
        s.peek();
        s.pop();
        s.peek();
        s.isEmpty();
        s.pop();
        s.pop();
        s.pop();

    }

}
