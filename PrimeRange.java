package training;

import java.util.Scanner;

public class PrimeRange {
	int n,r,j;
	  public void getInputValue()
	  {
		  Scanner sc=new Scanner(System.in);
		   System.out.println("enter first range");
			r=sc.nextInt();
			System.out.println("enter  second range");
			n=sc.nextInt();
				  }
	  public void primeNumber()  
	  {  
		  for(int j=r;j<=n;j++)//this for is used for print 2 to n prime number  
	  {
		  int check=0;
		  for(int i=2;i<r;i++)
		  {
			  if(j%i==0)
			  {
				  check=1;
				  break;
			  }
		  }
			  if(check==0)
			  {
				  System.out.println(j+ "prime number");

			  }
			 /* else
			  {
				  System.out.println(j+ "not prime number");

			  }*/
	      }
		  }
	  
	  
		public static void main(String[] args) {
			PrimeRange p=new PrimeRange();
			p.getInputValue();
			p.primeNumber();

		}

}
