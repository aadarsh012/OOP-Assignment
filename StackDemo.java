import java.util.Scanner;

class StackList {

    public int top;
    public int size;
    public int st[];

    private static Scanner sc = new Scanner(System.in);

    public void set() {

        System.out.print("Enter the size of the Stack : ");
        size = sc.nextInt();

        st = new int[size];
        top = -1;
    }

    public void push() {

        System.out.print("Enter the element to be pushed : ");
        int ele = sc.nextInt();

        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            st[top] = ele;
        }
    }

    public void pop() {

        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("The element poped is " + st[top]);
            top--;
        }
    }

    public void display() {

        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.print("The element of the Stack are : ");

            for (int i = top; i >= 0; i--) {
                System.out.print(st[i] + " ");
            }
        }

        System.out.println();
    }
}

class StackDemo {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        StackList s = new StackList();
        s.set();

        int flag = 1;

        System.out.println("Enter '1' for input, '2' for output, '3 for search, '4' for sort, '5' for exit");

        while (flag == 1) {

            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();

            if (choice == 1)
                s.push();

            else if (choice == 2)
                s.pop();

            else if (choice == 3)
                s.display();

            else {
                flag = 0;
                System.out.println("Exiting ...");
                System.exit(0);
            }
        }
    }
}
