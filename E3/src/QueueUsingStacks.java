import java.util.Stack;

public class QueueUsingStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int value) {
        stack1.push(value);
    }

    public int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return stack2.pop();
    }

    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
    public class StackArray {
        private int maxSize;
        private int top;
        private int[] stackArray;

        public StackArray(int size) {
            maxSize = size;
            stackArray = new int[maxSize];
            top = -1;
        }

        public void push(int value) {
            if (top < maxSize - 1) {
                top++;
                stackArray[top] = value;
                System.out.println(value + " pushed into stack");
            } else {
                System.out.println("Stack is full. Cannot push " + value);
            }
        }

        public int pop() {
            if (!isEmpty()) {
                int poppedValue = stackArray[top];
                top--;
                return poppedValue;
            } else {
                System.out.println("Stack is empty. Cannot pop.");
                return -1;
            }
        }

        public boolean isEmpty() {
            return (top == -1);
        }

        public void print() {
            System.out.print("Stack: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            StackArray stack = new StackArray(5);

            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);
            stack.push(50);

            stack.print();

            stack.push(60); // Stack is full. Cannot push 60

            stack.pop();

            stack.print();

            stack.push(60);

            stack.print();
        }
    }
}