import java.util.Scanner;

class LinkedList
{
  Node head;
  public int numberOfNodes;
  Node[] nodeList;
  static class Node{
    int data;
    Node next;
    Node(){}
    public Node(int d)
    {
      data = d;
      next = null;
    }
  }

  public LinkedList()
  {
    System.out.println("Intializing the list Please enter numeber of nodes you want:");
    Scanner sc = new Scanner(System.in);
    numberOfNodes = sc.nextInt();
    nodeList = new Node[numberOfNodes];
  }

  public void listOprations()
  {
    int i,choice;
    int firstNode= 1;
    Scanner sc = new Scanner(System.in);
    System.out.println("1.To create a node");
    System.out.println("2.TO exit program");
    System.out.print("Enter a choice : ");
    choice = sc.nextInt();
    i=0;
    while(numberOfNodes>=0)
    {
      if(firstNode==1 && choice==1)
      {
        System.out.print("Enter node data :");
        nodeList[i] = new Node(sc.nextInt());
        head = nodeList[i];
        nodeList[i].next = null;
        firstNode++;
        numberOfNodes--;
        i++;
        System.out.println();
        continue;
      }
      System.out.println("1.To create a node");
      System.out.println("2.TO exit program");
      System.out.println("3.To print Linked List");
      System.out.print("Enter a choice : ");
      choice = sc.nextInt();
      if(firstNode!=1 && choice==1)
      {
        System.out.print("Enter node data : ");
        nodeList[i] = new Node(sc.nextInt());
        nodeList[i-1].next = nodeList[i];
        nodeList[i].next = null;
        numberOfNodes--;
        i++;
        System.out.println();
      }
      if(choice==2)
      {
        System.out.println("Terminating program");
        break;
      }
      if(choice==3)
      {
        printList();
      }
    }
  }

  public void printList()
  {
    Node n = head;
    System.out.println();
    while(n !=null)
    {
      System.out.print("Data            Pointer");
      System.out.println();
      System.out.println(n.data+"      "+n.next);
      System.out.println();
      n = n.next;
    }
  }

  public static void main(String[] args)
  {
    LinkedList list = new LinkedList();
    list.listOprations();
  }

}
