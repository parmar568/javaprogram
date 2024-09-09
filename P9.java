import java.util.Scanner;

abstract class shape
{
  int v1,v2;
  shape()
  {}
  shape(int v1,int v2)
  {
      this.v1=v1;
      this.v2=v2;
  }
  shape(int v)
  {
      this.v1=v;
      this.v2=v;
  }
  abstract double area();
  abstract double perimeter();
}
class Rectangle extends shape
{
    Rectangle()
    {
        v1=12;
        v2=10;
    }
    Rectangle(int v1,int v2)
    {
        super(v1,v2);
    }
    double area()
    {
        return v1*v2;
    }
    double perimeter()
    {
        return 2*(v1+v2);
    }
}
class Triangle extends shape
{
    int v3;
    Triangle()
    {
       v1=10;
       v2=v1;   
       v3=13;
    }
    Triangle(int v1,int v2)
    {
        super(v1);
        v3=v2;
    }
    double area()
    {
        return (v1*v3)/2;
    }
    double perimeter()
    {
        return v1+v2+v3;
    }
}

class Circle extends shape
{
    Circle()
    {
        v2=5;
    }
    Circle(int r)
    {
        super(r);
    }
    double area()
    {
        return 3.14*v2*v2;
    }
    double perimeter()
    {
        return 2*3.14*v2;
    }
}
public class P9
{
static Scanner sc=new Scanner(System.in);
  public static void operation(shape s)
  {
    while (true)
    {
        System.out.println("\n1.Area");
        System.out.println("2.Perimeter");
        System.out.println("3.exit");
        System.out.println("Enter operation no : ");
        int c=sc.nextInt();
        switch(c)
        {
            case 1:System.out.println("\nArea : "+s.area());
                   break;
            case 2:System.out.println("Perimeter : "+s.perimeter());
                    break;
            case 3:
                   return;
            default:System.out.println("please,enter valid choice");
        }
    }
  }
  public static void main(String[] args) {
  while (true) {
    
 
    System.out.println("\nVarious shape to perform operation : ");
    System.out.println("1.Rectangle");
    System.out.println("2.Triangle");
    System.out.println("3.Circle");
    System.out.println("4.exit");
    System.out.println("Enter Shape no to perform operation  : ");
    int choice=sc.nextInt();
    if(choice==1)
    {
       System.out.println("\n1.User Default size Rectangle");
       System.out.println("2.Use Specific size Rectangle");
       System.out.println("Enter No Specific Rectange Use : ");
       int c=sc.nextInt();
       if(c==1)
       {
         Rectangle  r = new Rectangle();
         operation(r);
       }
       else if(c==2)
       {
         int l,b;
         System.out.println("\nEnter l and b : ");
         l=sc.nextInt();
         b=sc.nextInt();
         Rectangle r=new Rectangle(l,b);
         operation(r);
       }
       else
         System.out.println("please,enter valid choice");
    }
    else if(choice==2)
    {
        System.out.println("1.User Default size Triangle");
       System.out.println("2.Use Specific size Triangle");
       System.out.println("Enter No Specific Triangle Use : ");
       int c=sc.nextInt();
       if(c==1)
       {
         Triangle  r = new Triangle();
         operation(r);
       }
       else if(c==2)
       {
         int l,b;
         System.out.println("\nEnter height and base : ");
         l=sc.nextInt();
         b=sc.nextInt();
         Triangle r=new Triangle(l,b);
         operation(r);
       }
       else
         System.out.println("please,enter valid choice");
    }
    else if(choice==3)
    {
        System.out.println("1.User Default size Circle");
        System.out.println("2.Use Specific size Circle");
        System.out.println("Enter No Specific Circle Use : ");
        int c=sc.nextInt();
        if(c==1)
        {
          Circle  r = new Circle();
          operation(r);
        }
        else if(c==2)
        {
          int l,b;
          System.out.println("\nEnter Circle Radius ");
          l=sc.nextInt();
        
          Circle r=new Circle(l);
          operation(r);
        }
        else
          System.out.println("please,enter valid choice");
    }
    else if(choice==4)
      System.exit(0);
    else
      System.out.println("\nPlease,entr valid choice");
  }
}
}
