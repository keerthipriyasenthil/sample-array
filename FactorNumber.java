package training;

import java.util.Scanner;

public class FactorNumber {
	int n,i;
	public void getInput()
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter number");
		n=sc.nextInt();
	}
    public  void factorNum()
  {
	  for(int i=1;i<n;i++)
	  {
		  if(n%i==0)
		  {
			  
			  System.out.println(i); 
		  }
	  }
	 
  }
  
	}
