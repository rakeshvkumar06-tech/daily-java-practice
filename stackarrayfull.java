public class stackarrayfull {

    int[] stack = new int[5];
    int top = -1;

    void push(int data) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = data;
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Popped: " + stack[top--]);
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == stack.length - 1;
    }

    public static void main(String[] args) {

        stackarrayfull s = new stackarrayfull();

        System.out.println("Is Empty: " + s.isEmpty());

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        System.out.println("Is Full: " + s.isFull());

        s.pop();

        System.out.println("Is Full After Pop: " + s.isFull());
    }
}