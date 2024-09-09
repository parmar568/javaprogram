import java.util.Scanner;
interface xyz
{
	void input();
	void output();
}
Class interface2 implements xyz
{
	string name;
	double salary;
	
	public void input()
{
	Scanner p=new Scanner(System.in);
	System.out.println("enter the name");
	name=p.nextline();
	
	System.out.println("enter the slary");
	salary=p.nextdouble();
}
	public void output()
{
	System.out.println("name+""+salary);
}
public static void main(String[] args)
{
	int c;
	xyz c=new interface();
	c.input();
	c.output();
}
}