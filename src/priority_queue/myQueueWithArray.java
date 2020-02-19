package priority_queue;

public class myQueueWithArray {
    int front;
    int rear;
    queueByArray arr[];
    public myQueueWithArray(int size)
    {
        front=-1;
        rear=-1;
        arr=new queueByArray[size];
    }
    public boolean isempty()
    {
        return front==-1;
    }
    public boolean isfull()
    {
        return rear==arr.length-1;
    }
    public void enqueue(queueByArray newelement) {
        int i = 0;
        if (arr == null) {
            System.out.println("Not created");
        } else if (isfull()) {
            System.out.println("overflow");
        } else if (isempty()) {
            front++;
            rear++;
            arr[rear] = newelement;
        } else {
            for (i = rear; i >= front; i--) {
                if (newelement.priority < arr[i].priority) {
                    arr[i + 1] = arr[i];

                } else {
                    break;
                }
            }
            arr[i+1] = newelement;
            rear++;
        }
    }

        public void dequeue()

        {
            if(arr==null)
            {
                System.out.println("not created");
            }
            else if(isempty())
            {
                System.out.println("queue is empty");
            }
            else
            {
                arr[front]=null;
                front++;
            }
        }
            public void printQueue() {
                for (int i = front ; i<=rear;i++){
                    System.out.println(arr[i].data);
                }
            }
        }


