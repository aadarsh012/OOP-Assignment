
//Factorial of a given number.
import java.util.Scanner;

class factorial {

  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    int n = sc.nextInt();

    int i, ans = 1;

    for (i = 1; i <= n; i++) {
      ans = ans * i;
    }

    System.out.println("The factorial of the number : " + ans);
  }
}