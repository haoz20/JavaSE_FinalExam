package exam.p5;

public class Stack {
    private int[] stack;
    private int top = -1;
    private int n;

    public Stack(int n) {
        this.n = n;
        this.stack = new int[this.n];
    }

    public void push(int x) {
        if (this.top == this.n-1) {
            System.out.println("Stack Overflow");
        } else {
            this.stack[this.top + 1] = x;
            this.top++;
            System.out.println("Pushed " + x);
        }
    }

    public void pop() {
        if (this.top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Popped " + stack[this.top]);
            this.stack[this.top] = 0;
            this.top--;
        }
    }

    public void peek() {
        if (this.top == -1) {
            System.out.println("Stack is empty");
        }else {
            System.out.println("Top: " + stack[this.top]);
        }
    }

    public void isEmpty() {
        System.out.println(this.top == -1 ? "Stack is empty":"Stack is not empty");
    }

    public void isFull() {
        System.out.println(this.top == this.n-1 ? "Stack is full":"Stack is not full");
    }

//    public void getAll() {
//        for (int n: this.stack) {
//            System.out.print(n + " ");
//        }
//    }


}
