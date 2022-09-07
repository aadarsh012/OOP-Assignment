class ArrangeStringArray {

  public static void main(String[] args) {

    System.out.println("The array in ascending order : ");

    for (int i = 0; i < args.length - 1; i++) {

      for (int j = i + 1; j < args.length; j++) {

        if (args[i].compareTo(args[j]) > 0) {

          String temp = args[i];
          args[i] = args[j];
          args[j] = temp;
        }
      }
    }

    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }
  }
}