/*
 * [initial-upload] Salary computation using inheritance and modular input
 * [structure] Shared Scanner via static class; employee → salary extension
 * [logic] Reads name, ID, basic pay, and allowance; computes net salary
 * [run-instructions] Compile with `javac salary.java`, run with `java salary`
 * [notes] Modular read/display methods; suitable for future enhancements
 */

import java.util.Scanner;
class read{
	static Scanner in=new Scanner(System.in);
}
class employee{
	String emp_name;
	int emp_id,basic_pay;
	void read()
	{
		emp_name=read.in.nextLine();
		emp_id=read.in.nextInt();
		basic_pay=read.in.nextInt();
	}
	void display()
	{
		System.out.println("EMPLOYEE DETAILS\n------------------\n Name : "+emp_name+"\nEmpolyee ID : "+emp_id+"\nBasic pay : "+basic_pay);
	}
}

class salary extends employee{
	int allowance,net_salary;
	void salary_read()
	{
		System.out.println("Enter your Name,Empolyee ID ,Basic pay and Allowance :");
		read();
		allowance=read.in.nextInt();
		salary_calculate();
	}
	void salary_calculate()
	{
		net_salary=allowance+basic_pay;
		salary_display();
	}
	void salary_display()
	{
		display();
		System.out.println("Allowance : "+allowance);
		System.out.println("-----------------------------");
		System.out.println("Net Salary : "+net_salary);
	}
	public static void main(String args[]){
		salary s=new salary();
		s.salary_read();
	}
}	
