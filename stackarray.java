public class stackarray {

    int[] stack = new int[5];
    int top = -1;

    void push(int data) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        stack[top] = data;
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println("Popped Element: " + stack[top]);
        top--;
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Top Element: " + stack[top]);
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Stack Elements:");

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {

        stackarray s = new  stackarray();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        s.display();

        s.peek();

        s.pop();

        System.out.println("After Pop:");
        s.display();
    }
}