package p1;

import java.util.Scanner;

public class Array {

    public static Scanner sc = new Scanner(System.in);

    int list[], n;

    public Array(int m) {

        n = m;
        list = new int[n];
    }

    public void input() {

        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
    }

    public void output() {

        for (int i = 0; i < n; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}