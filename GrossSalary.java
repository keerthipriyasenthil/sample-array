package training;

import java.util.Scanner;

public class GrossSalary {
	int salary;
	double grosssalary;
	void getInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter salary");
		salary=sc.nextInt();

	}
	void salary()
	{
		if(salary<=10000)
		{
			grosssalary=(salary+(((salary*20)/100)+((salary*80)/100)));
			System.out.println(grosssalary);
		}
		else if((salary>=10000)&&(salary<=20000))
		{
			grosssalary=(salary+((salary*0.25)+(salary*0.9)));
			System.out.println(grosssalary);

		}
		else if(salary>20000)
		{
			grosssalary=(salary+((salary*0.3)+(salary*0.95)));
			System.out.println(grosssalary);

		}

	}
	public static void main(String[] args) {
		GrossSalary gs=new GrossSalary();
		gs.getInput();
		gs.salary();

	}

}
