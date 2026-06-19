class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class doublylinkedlist {

    Node head;
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }
    void deleteAtbegining(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        head = head.next;
        head.prev = null;
}
    void deleteAtend(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
        head = null;
        return;
    }
         Node temp = head;
    while (temp.next.next != null) {
        temp = temp.next;
    }
    temp.next = null;
}
void insertAtPosition(int data, int position) {
    Node newNode = new Node(data);
    if (position == 1) {
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        return;
    }
    Node temp = head;
    for (int i = 1; i < position - 1 && temp != null; i++) {
        temp = temp.next;
    }
    if (temp == null) {
        System.out.println("Invalid Position");
        return;
    }
    newNode.next = temp.next;
    newNode.prev = temp;
    if (temp.next != null) {
        temp.next.prev = newNode;
    }
    temp.next = newNode;
}    
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
       doublylinkedlist list = new doublylinkedlist();
        // Insert at Beginning
        // list.insertAtBeginning(30);
        // list.insertAtBeginning(20);
        // list.insertAtBeginning(10);
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        //list.deleteAtbegining();
       // list.deleteAtend();
        list.insertAtPosition(25, 3);


        list.display();
    }
}