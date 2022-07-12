class Stack {
    int size, top;
    int arr[];

    public Stack(int n) {
        top = -1; // initially its empty
        size = n;
        arr = new int[n];
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    void push(int element) {
        try {
            top++;
            arr[top] = element;
        } catch (ArrayIndexOutOfBoundsException e) {
            top--;
            System.out.println("OVERFLOW");
        }
    }

    int pop() {

        int element;
        try {
            element = arr[top];
            top--;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("UNDERFLOW");
            element = -1;
        }

        return element;
    }

    int peek() {
        if (isEmpty()) {
            return -1;
        }
        return arr[top];
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Empty Stack");
            return;
        }
        for (int i = 0; i <= top; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}

// TODO : ADD error handlings

public class q5 {
    public static void main(String[] args) {
        Stack s = new Stack(3);
        s.push(3);
        s.push(1);
        s.push(2);
        s.push(5);
        s.display();
        System.out.println("POPED : " + s.pop());
        s.display();
        System.out.println("POPED : " + s.pop());
        s.display();
        System.out.println("POPED : " + s.pop());
        s.display();
        System.out.println("POPED : " + s.pop());
        s.push(4);
        s.display();
    }
}