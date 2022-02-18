//implementation of Queue by a array
public class QueueArray {
    int arr[];
    int front,rear;

    QueueArray(int size)
    {
        arr=new int[size];
        front=rear=-1;
    }

    public boolean queueIsFull()
    {
        return (rear==arr.length-1);
    }

    public boolean queueIsEmpty()
    {
        return (front==-1);
    }

    public void enqueue(int data)
    {
        if(queueIsFull())
        {
            System.out.println("overflow");
        }
        else if(queueIsEmpty())
        {
            front=0;
            rear=rear+1;
            arr[rear]=data;
        }
        else
        {
            rear=rear+1;
            arr[rear]=data;
        }
    }

    public void dequeue()
    {
       if(queueIsEmpty())
       {
           System.out.println("arr is empty");
       }
       else
       {
           front=front+1;
       }
    }

    public void display()
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

class Main1
{
    public static void main(String[] args)
    {
        QueueArray obj=new QueueArray(5);
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.enqueue(50);
        obj .display();
        obj.enqueue(60);

        obj.dequeue();
        obj.dequeue();
        
        obj.enqueue(70);


    }
}