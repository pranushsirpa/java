public class DivideByZeroExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}



1) Create a CustomStack class with operations Push, Pop, Peek, and IsEmpty. Demonstrate its
 LIFO behavior by pushing integers onto the stack, then popping and displaying them until the 
stack is empty.




import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class CustomStack {
    private List stack;

    public CustomStack() {
        stack = new ArrayList();
    }

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        CustomStack<Integer> stack = new CustomStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

2) Develop a CustomQueue class with methods for Enqueue, Dequeue, Peek, and IsEmpty. 
Show how your queue can handle different data types by enqueuing strings and integers, 
then dequeuing and displaying them to confirm FIFO order.


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

