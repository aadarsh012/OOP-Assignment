//Arrange String in Ascending Order.

import java.util.Scanner;

class ArrangeStringArray {

  public static Scanner sc = new Scanner(System.in);

  public static void main(String args[]) {

    System.out.print("Enter the length of the Array : ");
    int n = sc.nextInt();

    int[] arr = new int[n];
    System.out.print("Enter the Array :");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int index = -1;

    System.out.print("The array in ascending order : ");

    for (int i = 0; i < arr.length - 1; i++) {

      index = i;

      for (int j = i + 1; j < arr.length; j++) {

        if (arr[j] < arr[index])
          index = j;
      }

      int temp = arr[i];
      arr[i] = arr[index];
      arr[index] = temp;
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}