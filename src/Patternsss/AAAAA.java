package Patternsss;
import java.util.Scanner;
public class AAAAA 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the no...");
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
			if(i==n/2+1||i==1 || j==1||j==n)
				System.out.print("* ");
			else 
				System.out.print("  ");
		}
		System.out.println();
	}
}
}