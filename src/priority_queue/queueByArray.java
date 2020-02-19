package priority_queue;

public class queueByArray {
    int data;
    int priority;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public queueByArray(int d, int p)
{
    data=d;
    priority=p;
}
}
