class Stack {
    private int arr[];
    private int top;
    private int capacity;

    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) throws Exception {
        if (top == capacity - 1) throw new Exception("Stack Overflow!");
        arr[++top] = x;
    }

    public int pop() throws Exception {
        if (top == -1) throw new Exception("Stack Underflow!");
        return arr[top--];
    }
}

public class StackExceptionHandling {
    public static void main(String[] args) {
        Stack stack = new Stack(2);
        try {
            stack.push(1);
            stack.push(2);
            stack.push(3); // Should throw exception
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
