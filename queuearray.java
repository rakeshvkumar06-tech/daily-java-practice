class queuearray{
    int[]queue;
    int size;
    int front;
    int rear;
queuearray(int size){
    this.size=size;
    queue =new int[size];
     front=-1;
     rear=-1;

}
    
void enqueue(int data){
    if(rear==queue.length-1){
        System.out.println("Queue is overflow");
        return;
    }
    if(front==-1){
        front=0;
    }
    rear++;
    queue[rear]=data;
}
void display(){
    for(int i=front;i<=rear;i++){
        System.out.println(queue[i]+" ");
    }
}

    

public static void main(String[]args) {
    queuearray q=new queuearray(5);
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.enqueue(40);
    q.display();
}
}
