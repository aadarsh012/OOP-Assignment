// Define two classes in package p1 :-

// Array class :- input(), output().
// Linked List class :- create(), display().
// Define Array class and Linked List classes for different packages.

import java.util.Scanner;

import package1.Array;
import package1.LinkedList;

class List {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        int n;
        System.out.print("Enter the size of the Array : ");
        n = sc.nextInt();

        Array arr = new Array(n);
        System.out.print("Enter the " + n + " elements : ");
        arr.input();

        System.out.print("All elements of the Array are : ");
        arr.output();

        LinkedList list = new LinkedList();

        list.create();

        System.out.print("All elements of the LinkedList are : ");
        list.display();
    }
}