package Patternsss;
import java.util.Scanner;
public class www
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
				if(j==1||j==n||(i+j==n+1&&j<=n/2+1)||(i==j&&j>=n/2+1))
				System.out.print("* ");
			else 
				System.out.print("  ");
		}
		System.out.println();
	}
}
}