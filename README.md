# Object Oriented Programming LAB (PCC-CS591)

LAB assignment and Notes of Object Oriented Programming.

## Steps :-

* Install **JAVA**

  ```bash
  sudo apt install default-jdk
  ```

* Check if `JAVA` installed successfully or not.

  ```bash
  javac --version # version check
  ```

* Open Terminal. (Press `Ctrl + Alt + t`)

* Go to any folder location or create a new.

  ```bash
  cd <folder name> # go to an existing folder
  ```
  ```bash
  mkdir <folder name> # create a folder
  cd <folder name> # go to the above folder
  ```

* Create a file.

  ```bash
  touch code.java # create a sample file
  ```

* Write the code on the sample.l file.

  ```bash
  nano code.java
  ```

* Type below argument to run the program.

  ```bash
  javac code.java
  java code.class
  ```

## Questions :-

* ### Question-01

  Find the greatest of three numbers.

* ### Question-02
  
  Arrange String in Ascending Order.

* ### Question-03

  Factorial

* ### Question-04

  Array List

* ### Question-05
  
  Define a class ArrayList and its members are :-

  **a.** Variables :-

  1. `int arr[]` reference variable
  2. `int size`

  Both variables numbers are `static`.

  **b.** Create a static block which initializes the size of the array anf=d reserves space for array.
  
  **c.** Define static methods for following operations :-

  1. `input()` for filling array
  2. `output()` for displaying elements in array
  3. `search()` for aearching an item in array
  4. `sort()` for arranging all elements in array in ascending order.
    
  Define another class `ArrayDemo` which contains `main()` which can access all the methods define in `ArrayList` class. Write a menu driven program :-

  ```bash
  1 -> input()
  2 -> output()
  3 -> search()
  4 -> sort()
  5 -> exit()
  ```

* ### Question-06

  Define a class StackList which contains following variables and methods. All variables and methods are : `top`, `size`, `st[]`

  Methods are :-

  1. `set()` which initializes `top`, `size`, and `st`
  2. `push()`
  3. `pop()`
  4. `display()`

  Now create another class StackDemo which contains main(). The main() access all these methods defined in StackList.
  
  Write a menu driven program to implement the following operations :-

  ```bash
  1 -> push()
  2 -> pop()
  3 -> display()
  4 -> exit()
  ```