import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CustomQueue {
    private Queue queue;

    public CustomQueue() {
        queue = new LinkedList();
    }

    public void enqueue(item) {
        queue.add(item);
    }

    public  dequeue() {
        return queue.poll();
    }

    public T peek() {
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
public static void main(String[] args) {
        CustomQueue<String> stringQueue = new CustomQueue<>();
        stringQueue.enqueue("Hello");
        stringQueue.enqueue("World");
        System.out.println(stringQueue.dequeue());
        System.out.println(stringQueue.dequeue());
        CustomQueue<Integer> intQueue = new CustomQueue<>();
        intQueue.enqueue(1);
        intQueue.enqueue(2);
        System.out.println(intQueue.dequeue());
        System.out.println(intQueue.dequeue());
    }
}

