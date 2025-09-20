// Concepts: abstract class, inheritance, method overriding, polymorphism

import java.util.Scanner;
class read{
	static Scanner in=new Scanner(System.in);
}
abstract class figure{
	int length,breadth,height;
	abstract void area();
	void read(int n)
	{
		System.out.print("\nEnter The Dimensions :\nBreadth :");
		breadth=read.in.nextInt();
		if(n==1)
		{
			System.out.print("length :");
			length=read.in.nextInt();
			return;
		}
		System.out.print("Height :");
		height=read.in.nextInt();
	}
	void display(double n,String s)
	{
		System.out.print("Area of "+s+" : "+n);
	}
}

class rectangle extends figure
{
	void area()
	{
		read(1);
		display(length*breadth,"Rectangle");
	}
}

class triangle extends figure
{
	void area()
	{
		read(0);
		display(0.5*height*breadth,"Triangle");
	}
	public static void main(String[] args)
	{
		triangle t=new triangle();
		rectangle r=new rectangle();
		t.area();
		r.area();
	}
}
