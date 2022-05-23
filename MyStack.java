// CCOM4029 002
// Prof. Ordonez
// Source File: MyStack.java
// Purpose: This program is a class implementation of a Stack
//          data structure using a list.
// Runing it: in terminal where the file MyStack.java, compile it
//            by writing javac MyStack.java. After it's done, run
//            it by writing java MyStack

//import package
import java.util.*;

//Create class MyStack
public class MyStack {

  //initialize stack
  private int stack[];

  //initialize capacity
  private int capacity;

  //initialize top
  private int top;

  MyStack(int size){

    //new stack
    stack = new int[size];

    //declare the maximum size of stack
    capacity = size;

    //declare location of top of stack
    top = -1;
  }

  //pop() method to remove and retrun the element at the top of stack
  public int pop(){

    //check wether the stack is empty, if empty return -1
    //and let the user know
    if (isEmpty() == true){

      System.out.print("Stack is empty");
      return -1;
    }

    //return the element at the top of stack and remove it from stack
    else {

      int temp = stack[top];
      --top;
      return temp;
    }
  }

  //push() method to add to top of stack the number "x"
  public void push(int x){

    //If stack is full do nothing and let the user know
    if (top >= (capacity - 1)){

      System.out.print("\nStack is full");
      return;
    }

    //Increment top and add element
    else {

      top++;
      stack[top] = x;
    }
  }

  //isEmpty() method to check wether the stack is empty or not
  public boolean isEmpty(){

    return top == -1;
  }

  //top() method to return or show what element is at the top of the stack
  public int top(){

    return stack[top];
  }

  //main() method to test class MyStack
  public static void main(String[] args)
  {
      //Print purpose of program
      System.out.print("\nThis program is a class implementation of a Stack data structure using a list.\n");
      System.out.print("It will create a stack with size from an input from user and add that amount of elements,\n");
      System.out.print("which are also given by the user. It will finish by showing and removing all elements of\n");
      System.out.print("the stack and demostrating to the user that the stack is empty.\n");

      //Ask user for the desired size of the stack
      System.out.print("\nEnter the desired size of the stack, only integers: ");
      Scanner input = new Scanner(System.in);

      //Input validation, keep asking if the input is not an integer
      while (input.hasNextInt() == false){

        System.out.print("The input was not an integer, enter an integer for the desired size of the stack: ");
        input = new Scanner(System.in);
      }

      //Save the size of the stack
      int stackSize = input.nextInt();

      //Create stack with given size
      MyStack stack = new MyStack(stackSize);

      //Declare counter variable
      int count = 0;

      //While count < stackSize ask the user for element to add to stack
      while (count < stackSize){

        System.out.print("Enter element to add to stack, only integers: ");
        Scanner addToStack = new Scanner(System.in);

        //Input validation, keep asking if the input is not an integer
        while (addToStack.hasNextInt() == false){
          System.out.print("The input was not an integer, enter an integer to add to stack: ");
          addToStack = new Scanner(System.in);
        }

        //Increment count and push new element to stack
        count++;
        stack.push(addToStack.nextInt());
      }

      //Let the user know whether the stack is empty
      System.out.print("\nIs the stack empty?: ");
      System.out.print(stack.isEmpty());

      //Print and remove all elements of the stack
      System.out.print("\n\nElements of the stack: \n");
      while (stack.isEmpty() == false){
        System.out.print(stack.pop());
        System.out.print("\n");
      }

      //Let the user know the stack is empty
      System.out.print("\n");
      stack.pop();
  }
}
