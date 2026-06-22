class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class StackUsingLinkedList {
    Node top;
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
    void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Popped: " + top.data);
        top = top.next;
    }
    void peek() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Top Element: " + top.data);
    }
    void display() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;
        }
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Stack after Push:");
        stack.display();
        stack.peek();

        stack.pop();

        System.out.println("Stack after Pop:");
        stack.display();
    }
}