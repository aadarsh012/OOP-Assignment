import java.util.Scanner;

public class GreatestofThreeNumbers {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        // int a = Integer.parseInt(args[0]);
        // int b = Integer.parseInt(args[1]);
        // int c = Integer.parseInt(args[2]);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int t;
        t = (a > b) ? a : b;
        t = (t > c) ? t : c;

        System.out.println("The greatest of the three numbers: " + t);
    }
}
