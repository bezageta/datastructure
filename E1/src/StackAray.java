public class StackAray {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public StackAray(int size) {
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
        StackAray stack = new StackAray(5);

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