package package1;

import java.util.Scanner;

class Node {

    int info;
    Node link;
}

public class LinkedList {

    public static Scanner sc = new Scanner(System.in);

    Node head;

    public LinkedList() {
        head = new Node();
    }

    public void create() {

        Node ptr = head;
        int ch;

        do {
            ptr.link = new Node();
            ptr = ptr.link;

            System.out.print("Enter the info : ");
            ptr.info = sc.nextInt();

            System.out.print("Press '1' to Continue, otherwise Exit : ");
            ch = sc.nextInt();
        } while (ch == 1);
    }

    public void display() {

        Node ptr = head.link;

        while (ptr != null) {
            System.out.print(ptr.info + " ");
            ptr = ptr.link;
        }
        System.out.println();
    }
}
