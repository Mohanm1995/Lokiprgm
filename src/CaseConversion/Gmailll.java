package CaseConversion;
import java.util.Scanner;
public class Gmailll 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String...");
		String str = sc.nextLine();
		int Ucount = 0;
		int Lcount = 0;
		int Ncount = 0;
		int Scount = 0;
		for(int i=0; i<str.length(); i++)
			char ch = str.charAt(i);
		if(ch>='A'&& ch<='Z')
			Ucount++;
		else if(ch>'a' && ch<='z')
			Lcount++;
		else if(ch>'0' && ch<='9')
			Ncount++;
		else
			Scount++;
		System.out.println("Upper case count is "+ Ucount);
		System.out.println("Lower case count is "+ Lcount);
		System.out.println("Number case count is "+ Ncount);
		System.out.println("Special char count is "+ Scount);
}
}
