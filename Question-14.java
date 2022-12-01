interface A {

    final static int a = 10;
    final static int b = 20;

    public abstract void sum();

    public abstract void multiply();
}

class B implements A {

    public void sum() {

        int s = a + b;
        System.out.println("Sum = " + s);
    }

    public void multiply() {

        int m = a * b;
        System.out.println("Product = " + m);
    }
}

class C implements A {

    public void sum() {
        double a = 20.5;
        double b = 30.5;
        double s = a + b;
        System.out.println("Sum = " + s);
    }

    public void multiply() {
        double a = 20.5;
        double b = 30.5;
        double m = a * b;
        System.out.println("Product = " + m);
    }
}

class ABC {

    public static void main(String args[]) {

        B b = new B();
        b.sum();
        b.multiply();

        C c = new C();
        c.sum();
        c.multiply();

        A ref;

        ref = new B();
        ref.sum();
        ref.multiply();

        ref = new C();
        ref.sum();
        ref.multiply();
    }
}