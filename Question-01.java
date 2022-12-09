
//Find the greatest of three numbers
import java.util.Scanner;

class GreatestofThreeNumbers {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();

        int t;
        t = (p > q) ? p : q;
        t = (t > r) ? t : r;

        System.out.println("The greatest of the three numbers: " + t);
    }
}
