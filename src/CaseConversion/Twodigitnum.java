package CaseConversion;

import java.util.Scanner;

public class Twodigitnum 
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the 2 digit number");
	int no = sc.nextInt();
	int d1 = no%10;
	int d2 = no/10;
	int sum = d1 + d2 + (d1*d2);
	if(sum==no)
	{
		System.out.println(no + " is a special 2 digit no");
	}else{
		System.out.println(no + " is not a special 2 digit no");
	}
	}
}
	