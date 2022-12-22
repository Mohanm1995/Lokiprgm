package CaseConversion;
import java.util.Scanner;
public class Xylemm 
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = sc.nextInt();
	int Isum = 0;
	int Osum = 0;
	int copy = num;
	while(num!=0)
	{
		if(copy==num || num<=9)
			Osum = Osum + num%10;
		else
			Isum = Isum + num%10;
		num = num/10;
	}
	if(Osum==Isum)
		System.out.println(copy + " is a Xylem no");
	else
		System.out.println(copy + " is a Phloem no");	
	}
}
