package training;

import java.util.Scanner;

public class PrimeFor {
  int n;
  public void getInput()
  {
	  Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		n=sc.nextInt();

  }
  public void prime()  
  { 
	  int check=0;
	  for(int i=2;i<n;i++)
	  {
		  if(n%i==0)
		  {
			  check=1;
			  break;
		  }
	  }
		  if(check==0)
		  {
			  System.out.println("prime number");

		  }
		  else
		  {
			  System.out.println("not prime number");

		  }
  }
		   
	public static void main(String[] args) {
		PrimeFor p=new PrimeFor();
		p.getInput();
		p.prime();

	}

}
