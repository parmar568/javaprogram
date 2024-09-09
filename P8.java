import java.util.Scanner;

class Matrix
{
    private int row,col;
    private double m1[][];
    private static double v=1;
    Matrix()
    {
        row=2;
        col=2;
        m1=new double[row][col];
        intilize(row, col, m1);
    }
    Matrix(int row,int col)
    {
        this.row=row;
        this.col=col;
        m1=new double[row][col];
        intilize(row, col, m1);
    } 
    public double getValue(int r,int c)
    {
        return m1[r][c];
    }
    public Matrix add(Matrix m2)
    {

        System.out.println("\nAddition Above two matrix");
        Matrix sum=new Matrix(row,col);
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                sum.m1[i][j]=m1[i][j]+m2.getValue(i, j);
            }
        }
        return sum;
    }
    public Matrix sub(Matrix m2)
    {
 
        System.out.println("\nSubstraction Above two matrix");
        Matrix sum=new Matrix(row,col);
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                sum.m1[i][j]=m1[i][j]-m2.getValue(i, j);
            }
        }
        return sum;
    }
    public Matrix mul(Matrix m2)
    {
       
        System.out.println("\nMultiplication Above two matrix");
        Matrix sum=new Matrix(row,col);
        if(row==col)
        {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {

                 double m=0;
				 for(int k=0;k<col;k++)
				 {
					 m=m+(m1[i][k]*m2.getValue(k,j));
				 }
			
                sum.m1[i][j]=m;
            }
        }
        }
        else
        {
             for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                sum.m1[i][j]=m1[i][j]*m2.getValue(i, j);
            }
        }
        }
        return sum;
    }
    public Matrix transpose()
    {
         Matrix sum=new Matrix(row,col);    
        if(row==col)
        {
         
         for(int i=0;i<row;i++)
         {
            for(int j=0;j<col;j++)
            {
                sum.m1[i][j]=m1[j][i];
            }
         }
        }
        else
        {
      sum=new Matrix(col,row);
   
         for(int i=0;i<col;i++)
         {
             for(int j=0;j<row;j++)
             {
                sum.m1[i][j]=m1[j][i];
             }
         }
        }
        return sum;
    }
    public void intilize(int row,int col,double m1[][])
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                  m1[i][j]=v;
                  v+=1;
                  
            }
        }
    }
    public void user_intialize()
    {
        Scanner sc=new Scanner(System.in);
        int v1;
         for(int i=0;i<row;i++)
         {
            for(int j=0;j<col;j++)
            {
                System.out.println("Enter m["+i+"]["+j+"] value : ");
                
                v1=sc.nextInt();
                m1[i][j]=v1;
            }
         }
    }
    public String toString() 
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(m1[i][j]+"   ");
            }
            System.out.println();
        }
        return " ";
    }
}
public class P8 {
  static Scanner sc=new Scanner(System.in);
  public static void operation(Matrix m1,Matrix m2)
  {
    System.out.println("\nMatrix 1 : ");
    System.out.println(m1);
    System.out.println("\nMatrix 2 : ");
    System.out.println(m2);
      while (true)
      {
         System.out.println("\n1.Own Intialize Matrix");
         System.out.println("2.Addition");
         System.out.println("3.Substraction");
         System.out.println("4.Multiplication");
         System.out.println("5.Transpose of First Matrix");
         System.out.println("6.Exit");
         System.out.println("Enter Your Choice : ");
         int c=sc.nextInt();
         Matrix ans;
         switch (c) {
          case 1:
                    System.out.println("1.Intialize Matrix 1");
					System.out.println("2.Intialize Matrix 2");
					System.out.println("Enter your choice");
					int c1 = sc.nextInt();
					switch (c1) {
						case 1:m1.user_intialize(); 
                               System.out.println("Matrix - 1");
                               System.out.println(m1);
                               break;
                        case 2:m2.user_intialize();
                              System.out.println("Matrix - 2");
                               System.out.println(m2);
                               break;
                        default:System.out.println("Please,enter valid choice");
                    }
                    break;
          case 2:
            ans=m1.add(m2);
            System.out.println(ans);
            break;
          case 3:
          ans=m1.sub(m2);
          System.out.println(ans);
            break;
          case 4:
          ans=m1.mul(m2);
          System.out.println(ans);
            break;
          case 5:
           ans=m1.transpose();
           System.out.println(ans);
           break;
          case 6:
            System.exit(0);
          default:System.out.println("\nPlease,enter valid one above choice");
            break; 
         }
      }
  }
    public static void main(String[] args) {
       
    boolean t=true;
    while(t)
    {
	   System.out.println("1.Default Matrix");
       System.out.println("2.User Length Matrix");
       System.out.println("Enter Your Choice : ");
       int c=sc.nextInt();
       if(c==1)
       {
          Matrix m1=new Matrix();
          Matrix m2=new Matrix();
          operation(m1,m2);
          t=false;
       }
       else if(c==2)
       {
           System.out.println("Enter Matrix row and column : ");
           int r=sc.nextInt();
           c=sc.nextInt();
           Matrix m2=new Matrix(r,c);
           Matrix m3=new Matrix(r,c);
           operation(m2,m3);
           t=false;
       }
      else
      {
       System.out.println("\nPlease,enter one of above choice");
      }
  }
     
    }
}
