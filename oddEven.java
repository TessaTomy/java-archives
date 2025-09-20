import java.util.Scanner;
class oddEven
{
	static String checker(int n)
	{
		if (n%2==0)
			return "Even";
		return "Odd";
	}
	public static void main(String args[])
	{
		Scanner cin=new Scanner(System.in);
		System.out.println("Enter the array size :");
		int n=cin.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the Elements :");
		for(int i=0;i<n;i++)
			a[i]=cin.nextInt();
		System.out.println("---------------------");
		for(int i=0;i<n;i++)
			System.out.println(a[i]+" : "+checker(a[i]));
	}
}
