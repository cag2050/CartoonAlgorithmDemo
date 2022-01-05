package chapter2.part3;

// 循环队列，通过取余来实现
public class MyQueue {
    // array.length 容量
    private int[] array;
    // front和rear是数组下标
    private int front;
    private int rear;

    public MyQueue(int capacity) {
        array = new int[capacity];
    }

    public void enQueue(int element) throws Exception {
        if ((rear + 1) % array.length == front) {
            throw new Exception("队列已满！");
        }
        array[rear] = element;
        rear = (rear + 1) % array.length;
    }

    public int deQueue() throws Exception {
        if (rear == front) {
            throw new Exception("队列已空！");
        }
        int deQueueElement = array[front];
        front = (front + 1) % array.length;
        return deQueueElement;
    }

    public void output() {
        for (int i = front; i != rear; i = (i + 1) % array.length) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        MyQueue myQueue = new MyQueue(3);
        myQueue.enQueue(3);
        myQueue.enQueue(5);
        myQueue.deQueue();
        myQueue.enQueue(6);
        myQueue.output();
    }
}
