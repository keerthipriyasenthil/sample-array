package training;

import java.util.Scanner;

public class IncomeTaxCalculator {
	int n,t1,t2,t3;
	double it,it1,it2 ;
	void getInput()
	{
       Scanner scan=new Scanner(System.in);
	     System.out.println("enter number1:");
			n=scan.nextInt();

	}
	void  income(){
		if(n<=20000)
		{
			System.out.println("no tax");
		}
		else if((n>20000)&&(n<=40000))
		{
			t1=n-20000;
			it=((t1*10)/100);
			System.out.println(it);
		}
		else if((n>40001)&&(n<=60000))
		{
			t2=n-40000;
			it1=(t2*20/100)+((20000*10)/100);
			
			System.out.println(it1);
		}
		else if(n>=60001)
		{
			t3=n-60000;
			it2=(t3*30/100)+6000;
			System.out.println(it2);
		}
	}

	public static void main(String[] args) {
		IncomeTaxCalculator i=new IncomeTaxCalculator();
		i.getInput();
		i.income();

	}

}
