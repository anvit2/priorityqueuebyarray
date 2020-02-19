package priority_queue;

public class main {
    public static void main(String[] args) {
        queueByArray n= new queueByArray(10,2);
        queueByArray n1=new queueByArray(20,1);
        queueByArray n2=new queueByArray(30,3);
        queueByArray n3=new queueByArray(40,4);
        queueByArray n4=new queueByArray(50,5);
        myQueueWithArray obj =new myQueueWithArray(5);
      obj.enqueue(n1);
        obj.enqueue(n);
        obj.enqueue(n4);
        obj.enqueue(n3);
        obj.enqueue(n2);
        obj.dequeue();
        obj.printQueue();
        boolean a  = obj.isfull();
        System.out.println(a);

    }
}
