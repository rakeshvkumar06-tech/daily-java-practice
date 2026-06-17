class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
public class linkedlistdemo {
    node head;

    void insertAtbegining(int data){
        node newNode=new node(data);
        newNode.next=head;
        head=newNode;
    }
    void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    
}
 public static void main(String[] args) {
    linkedlistdemo list=new linkedlistdemo();
    list.insertAtbegining(10); 
    list.insertAtbegining(20);
    list.insertAtbegining(30);
    list.display();
    list.insertAtbegining(40);
    list.insertAtbegining(50);
    list.display();  

}
}