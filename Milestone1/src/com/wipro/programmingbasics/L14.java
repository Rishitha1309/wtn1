package com.wipro.programmingbasics;

public class L14 {
	public static void main(String []args)
	{
	int c=0;
	if(args.length==0)
	{
	System.out.println("Please enter an integer number ");
	}
	else
	{
	for(int i=2;i<=Integer.parseInt(args[0]);i++)
	{
	if(Integer.parseInt(args[0])%i==0)
	{
	c++;
	}
	}
	if(Integer.parseInt(args[0])==0||Integer.parseInt(args[0])==1)
	{
	System.out.println(args[0]+" is neither prime nor composite ");
	}
	else
	{
	if(c==1)
	{
	System.out.println(args[0]+" is a prime number");
	}
	else
	{
	System.out.println(args[0]+" is a not prime number");
	}
	}
	}
	System.exit(0);
	}
	
}
