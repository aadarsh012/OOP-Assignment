import java.util.Scanner;

abstract class stack {

    int list[];
    int top, size;

    stack(int n) {

        size = n;
        list = new int[n];
        top = -1;
    }

    abstract void push();

    void pop() {

        if (top == -1)
            System.out.println("Stack is empty");

        else {
            System.out.println("Popped element is " + list[top]);
            top--;
        }
    }

    void display() {

        if (top == -1)
            System.out.println("Stack is empty");

        else {
            System.out.println("Stack elements are:");
            for (int i = top; i >= 0; i--)
                System.out.println(list[i] + " ");
        }
    }
}

class growable_stack extends stack {

    growable_stack(int n) {

        super(n);
    }

    void push() {

        if (top == size - 1) {
            int list1[] = new int[size * 2];
            for (int i = 0; i < size; i++) {
                list1[i] = list[i];
            }
            size = 2 * size;
            list = list1;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements : ");
        list[++top] = sc.nextInt();
    }
}

class simple_stack extends stack {

    public Scanner sc = new Scanner(System.in);

    simple_stack(int n) {
        super(n);
    }

    void push() {

        if (top == size - 1) {
            System.out.println("Overflow");
        } else {
            System.out.println("Enter the items : ");
            list[++top] = sc.nextInt();

        }
    }

}

class stackDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the stack : ");
        n = sc.nextInt();
        simple_stack s1 = new simple_stack(n);
        growable_stack g1 = new growable_stack(n);
        stack ref;
        int ch;
        do {
            System.out.println("1. for growable stack\n2. for simple stack\nSelect : ");
            ch = sc.nextInt();

            if (ch == 1) {
                ref = g1;
            }

            else if (ch == 2) {
                ref = s1;
            }

            else {
                System.out.println("Wrong selection");
                continue;
            }

            System.out.println("1. for push\n2. for pop\n3. for display\n 0. for exit\nSelect : ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    ref.push();
                    break;

                case 2:
                    ref.pop();
                    break;

                case 3:
                    ref.display();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Wrong Selection");
            }
        } while (ch != 0);
    }
}