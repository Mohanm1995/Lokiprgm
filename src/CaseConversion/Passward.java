package CaseConversion;
import java.util.Scanner;
public class Passward 	
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
		if(str.length()>=8)
		{
			for(int i=0; i<str.length(); i++)
			{
				char ch = str.charAt(i);
				if(ch>='A' && ch<='Z')
					Ucount++;
				else if(ch>'a' && ch<='z')
					Lcount++;
				else if(ch>'0' && ch<='9')
					Ncount++;
				else
					Scount++;
			}
			if(Ucount>=1 && Lcount>=1 && Ncount>=1 && Scount>=1 && str.endsWith("#"))
				System.out.println("Valid Passward...");
			else
				System.out.println("Invalid Passward...");
			}else
		System.out.println("Invalid Passward...");
		}
	}
