class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class linkedlistdeletebegining {
    Node head;
    void insertAtbegining(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    void deleteAtbegining() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }
    public static void main(String[] args) {
        linkedlistdeletebegining list = new linkedlistdeletebegining();
        list.insertAtbegining(10);
        list.insertAtbegining(20);
        list.insertAtbegining(30);
        System.out.println("Before Deletion:");
        list.display();
        list.deleteAtbegining();
        System.out.println("After Deletion:");
        list.display();
    }
}