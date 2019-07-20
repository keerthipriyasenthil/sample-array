package training;

import java.util.Scanner;

public class SumDigit {
	int n;
	public void getInput()
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter number");
		n=sc.nextInt();
	}
	public void sumDigit()
	{
		int rem;
		int add=0,addition=0,remainder;
		int temp=n;
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			add=add+rem;
		}
		System.out.println(add);
		
		while(add>0)
		{
			remainder=add%10;
			add=add/10;
			addition=addition+remainder;
		}
		System.out.println(addition);
		if(temp % addition==0)
		{
			System.out.println("yes");	
		}
		else 
		{
			System.out.println("no");
		}
	}
	
}
