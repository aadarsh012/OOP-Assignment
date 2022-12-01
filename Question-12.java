import java.util.Scanner;

class Employee {

    public Scanner sc = new Scanner(System.in);

    public String name;
    public int age;
    public double salary;

    public Employee next;
    public Employee link;

    Employee() {

    }

    Employee(String name, int age, double salary) {

        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void details() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
    }
}

class Employee_List {

    public Scanner sc = new Scanner(System.in);

    Employee start;

    Employee_List() {
        start = new Employee();
    }

    void setData() {

        String s;
        int a;
        double d;
        int choice;

        Employee ptr = start;

        do {
            System.out.print("Name : ");
            s = sc.nextLine();

            System.out.print("Age : ");
            a = sc.nextInt();

            System.out.print("Salary : ");
            d = sc.nextDouble();

            ptr.next = new Employee(s, a, d);
            ptr = ptr.next;

            System.out.print("Press '1' to continue : ");
            choice = sc.nextInt();
        } while (choice != 0);
    }

    void display() {
        Employee ptr = start.link;

        while (ptr != null) {
            ptr.details();
            ptr = ptr.link;
        }
    }
}

class List_Employee {

    public static void main(String args[]) {

        Employee_List el = new Employee_List();
        el.setData();
        el.display();
    }
}