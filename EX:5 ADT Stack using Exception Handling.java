import java.util.Scanner;
class StackOverflowException extends Exception {
    public StackOverflowException(String message) {
        super(message);
    }
}
class StackUnderflowException extends Exception {
    public StackUnderflowException(String message) {
        super(message);
    }
}
class Stack {
    int top = -1;
    int size = 5;
    int[] stack = new int[size];

    void push(int value) throws StackOverflowException {
        if (top == size - 1)
            throw new StackOverflowException("Stack Overflow");
        stack[++top] = value;
        System.out.println(value + " pushed into stack.");
    }
    void pop() throws StackUnderflowException {
        if (top == -1)
            throw new StackUnderflowException("Stack Underflow");
        System.out.println(stack[top--] + " popped from stack.");
    }
    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty.");
            return;
        }
        System.out.println("Stack Elements:");
        for (int i = top; i >= 0; i--)
            System.out.println(stack[i]);
    }
}
public class Program5_StackException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        int choice;
        do {
            System.out.println("\n1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter value: ");
                        s.push(sc.nextInt());
                        break;
                    case 2:
                        s.pop();
                        break;
                    case 3:
                        s.display();
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid Choice");
                }
            } catch (StackOverflowException | StackUnderflowException e) {
                System.out.println(e.getMessage());
            }
        } while (choice != 4);

        sc.close();
    }
}

Output :
1.Push
2.Pop
3.Display
4.Exit
Enter your choice: 1
Enter value: 10
10 pushed into stack.

Enter your choice: 1
Enter value: 20
20 pushed into stack.

Enter your choice: 3
Stack Elements:
20
10

Enter your choice: 2
20 popped from stack.

Enter your choice: 4
Exiting...
