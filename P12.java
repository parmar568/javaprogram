import java.util.Scanner;
class StackException extends Exception
{
    StackException(String s)
    {
        super(s);
    }
}
class Stack1 {
  int top = -1, s[], max;
  Scanner s1 = new Scanner(System.in);;

  Stack1() {
    max = 5;
    s = new int[max];
  }

  Stack1(int len) {
    max = len;
    s = new int[max];
  }

  void push()throws StackException {
    int ele;
    if (top == max - 1)
      throw new StackException("\nStack is Overflow..!!");
    else {
      top++;
      System.out.println("Enter New Element : ");
      ele = s1.nextInt();
      s[top] = ele;
    }
  }

  void pop()throws StackException{
    if (top == -1)
      throw new StackException("\nStack is Underflow..!!");
    else {
      System.out.println("\nRemove Element : " + s[top]);
      top--;
    }
  }

  void traverse()throws StackException {
    if (top == -1)
      throw new StackException("\nStack is Underflow..!!");
    else {
      System.out.print("Elements : ");
      for (int i = top; i >= 0; i--)
        System.out.print(s[i] + " ");
    }
  }
}

public class P12 {
  static Scanner sc=new Scanner(System.in);
  public static void operation(Stack1 s)
  {
 
      while (true)
      {
        try
        {
         System.out.println("\n1.PUSH");
         System.out.println("2.POP");
         System.out.println("3.Traverse");
         System.out.println("4.Exit");
         System.out.println("Enter Your Choice : ");
         int c=sc.nextInt();
         switch (c) {
          case 1:
            s.push();
            break;
          case 2:
            s.pop();
            break;
          case 3:
            s.traverse();
            break;
          case 4:
            System.exit(0);
          default:System.out.println("\nPlease,enter valid one above choice");
            break;
         }
      }
      catch(StackException e)
      {
          System.err.print("\nError : "+e.getMessage());
          e.printStackTrace();
      }
    }
   
  }
  public static void main(String args[])
  {

    boolean t=true;
    while(t)
    {
	     System.out.println("1.Default Stack");
       System.out.println("2.User Length Stack");
       System.out.println("Enter Your Choice : ");
       int c=sc.nextInt();
       if(c==1)
       {
          Stack1 s1=new Stack1();
          operation(s1);
          t=false;
       }
       else if(c==2)
       {
           System.out.println("Enter Stack Length : ");
           c=sc.nextInt();
           Stack1 s2=new Stack1(c);
           operation(s2);
           t=false;
       }
      else
      {
       System.out.println("\nPlease,enter one of above choice");
      }
  }
  }
}

