package CaseConversion;
import java.util.Scanner;
public class HappyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number...");
		int num = sc.nextInt();
		int copy = num;
		int sum;
		while(num>9)
		{
			sum = 0;
			do{
				int d = num%10;
				sum = sum+d*d;
				num = num/10;
			}
			while(num!=0);
				num=sum;
		}
		if(num==1 || num==7)
		{
			System.out.println("It is a Happy Number...");
		}else
			System.out.println("It is not a Happy Number...");
	}
}

