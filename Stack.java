import java.util.Scanner;
/*class Node{
  public int data;
  public static int pointer;
  Node(){
    pointer++;
  }
}*/
class Stack{

  int[] stack;
  public static int stackTop;

  public void addElements(int size)
  {
     Scanner sc = new Scanner(System.in);
     stack = new int[size];
     stackTop = size;
     int i = 0;
     while(i<size)
     {
       System.out.println("Enter an element:");
       stack[i] = sc.nextInt();
       i++;
     }
     System.out.println("Now stack is full Enter your choice of opration");
     stackOpration();
  }

  public void stackOpration()
  {

    Scanner sc = new Scanner(System.in);
    int i = 0;
    System.out.println("Enter your choice 1. to enter an element");
    System.out.println("Enter your choice 2. to delete an element");
    System.out.println("Enter your choice 3. to exit stack");
    i = sc.nextInt();
    int flag = 0;
    while(i<=3&&i>0)
    {
      if(i==1 && stackTop<stack.length)
      {
        System.out.println("Enter element:");
        stack[stackTop++] = sc.nextInt();
        flag = 0;
        showStack();
      }
      if(stackTop==stack.length)
      {
        System.out.println("Stack is full cannot add");
        flag = 0;
        showStack();
      }
      if(i==2 && stackTop>=0)
      {
        stackTop--;
        flag = 0;
        System.out.println("Element got deleted");
        showStack();
      }
      if(i==3)
      {
        System.out.println("Exiting the stack");
        break;
      }
      if(flag!=0)
      break;
      System.out.println("Enter your choice 1. to enter an element");
      System.out.println("Enter your choice 2. to delete an element");
      System.out.println("Enter your choice 3. to exit stack");
      i = sc.nextInt();
    }

  }

  public void showStack()
  {
    int i=0;
    System.out.println("Stack elemnets are:");
    for(i=0;i<stackTop;i++)
    {
        System.out.println(i+". "+stack[i]);
    }
  }

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter size of stack: ");
    int stackSize = sc.nextInt();
    System.out.println("Please enter "+stackSize+" elements in stack:");
    Stack s = new Stack();
    s.addElements(stackSize);
  }
}
