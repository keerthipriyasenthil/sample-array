package training;

import java.util.Scanner;

public class SumAverage {
	int num,n,sum=0,average;
	Scanner sc=new Scanner(System.in);
	public void getInput()
	{
		
	    System.out.println("enter number");
		num=sc.nextInt();
	}
	public void sum()
	{
		int count=0;
		for(int i=0;i<num;i++)
		{
			sum=sum+num;
			count=count+1;
			 System.out.println("do you want to continue(c/q)");
			 char ch=sc.next().charAt(0);
			 if(ch=='q')
			 {
				 System.out.println ("QUIT");
				 break;
			 }
			 System.out.println("enter number1");
			 num=sc.nextInt();
			}
		System.out.println("sum" +sum);
		 average=sum/count;
		 System.out.println(+average);

	}
	
	}
