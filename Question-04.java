//Array List

import java.util.*;

class ArrayList {

    public static Scanner sc = new Scanner(System.in);

    static int[] arr;
    static int size;

    static {

        System.out.println("Enter the size of the array : ");
        size = sc.nextInt();

        arr = new int[size];
    }

    public static void input() {

        System.out.println("Enter the elements of the array : ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void output() {

        System.out.println("The array is: ");

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void search() {

        System.out.println("Enter the number to be found : ");

        int x;
        int flag = 0;
        x = sc.nextInt();

        for (int i = 0; i < size; i++) {

            if (arr[i] == x) {

                System.out.println("The number has been found at " + i + "th index");
                flag++;
                break;
            }
        }

        if (flag == 0) {
            System.out.println("The number is not found!");
        }
    }

    public static void sort() {

        int ch;

        do {
            System.out.println("1. Ascending");
            System.out.println("2. Descending");
            System.out.println("3. Back");
            System.out.println("Enter your choice(1-3) : ");

            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("The array in ascending sorted order : ");
                    Arrays.sort(arr);
                    for (int i = 0; i < size; i++)
                        System.out.println(arr[i]);
                    break;

                case 2:
                    System.out.println("The array in descending sorted order : ");
                    Arrays.sort(arr);
                    for (int i = 0; i < size / 2; i++) {
                        int temp = arr[i];
                        arr[i] = arr[size - i - 1];
                        arr[size - i - 1] = temp;
                    }

                    for (int i = 0; i < size; i++)
                        System.out.println(arr[i]);
                    break;

                default:
                    System.out.println("Enter a valid choice!");

            }

        } while (ch != 3);
    }
}

class ArrayDemo {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int ch;

        do {
            System.out.println("1. Input");
            System.out.println("2. Output");
            System.out.println("3. Search");
            System.out.println("4. Sort");
            System.out.println("5. Exit");
            System.out.println("Enter your choice(1-5) : ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    ArrayList.input();
                    break;

                case 2:
                    ArrayList.output();
                    break;

                case 3:
                    ArrayList.search();
                    break;

                case 4:
                    ArrayList.sort();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Enter a valid choice!");
            }
        } while (ch != 5);
    }
}
