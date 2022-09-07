import java.util.Scanner;

class ArrayList {

    static int arr[];
    static int size;
    private static Scanner sc = new Scanner(System.in);

    static {
        System.out.print("Enter the size of the array : ");
        size = sc.nextInt();
        arr = new int[size];
    }
}

class ArrayDemo {

    public static Scanner sc = new Scanner(System.in);

    static void input() {

        int n = ArrayList.size;

        System.out.print("Enter the Array : ");
        for (int i = 0; i < n; i++) {

            ArrayList.arr[i] = sc.nextInt();
        }
    }

    static void output() {

        System.out.println("Elements of the Array are : ");
        for (int i = 0; i < ArrayList.size; i++) {

            System.out.print(ArrayList.arr[i] + " ");
        }
        System.out.println();
    }

    static void search() {

        System.out.print("Enter the element to be searched : ");
        int target = sc.nextInt();

        int flag = 1;

        for (int i = 0; i < ArrayList.size; i++) {
            if (target == ArrayList.arr[i]) {
                System.out.println("Element is at position " + i);
                flag = 1;
                break;
            }

            if (flag == 0)
                System.out.println("Element is not present in the array");
        }
    }

    static void sort() {

        for (int i = 0; i < ArrayList.size - 1; i++) {
            for (int j = i + 1; j < ArrayList.size; j++) {
                if (ArrayList.arr[i] > ArrayList.arr[j]) {
                    int temp = ArrayList.arr[i];
                    ArrayList.arr[i] = ArrayList.arr[j];
                    ArrayList.arr[j] = temp;
                }
            }
        }

        output();
    }

    public static void main(String args[]) {

        int flag = 1;

        System.out.println("Enter '1' for input, '2' for output, '3 for search, '4' for sort, '5' for exit");

        while (flag == 1) {

            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();

            if (choice == 1)
                ArrayDemo.input();

            else if (choice == 2)
                ArrayDemo.output();

            else if (choice == 3)
                ArrayDemo.search();

            else if (choice == 4)
                ArrayDemo.sort();

            else {
                flag = 0;
                System.out.println("Exiting ...");
                System.exit(0);
            }
        }
    }
}