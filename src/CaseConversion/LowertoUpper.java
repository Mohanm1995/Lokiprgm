package CaseConversion;
import java.util.Scanner;
public class LowertoUpper 
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String str = sc.nextLine();
	String rev = " ";
	for(int i=0; i<str.length(); i++)
	{
		char ch = str.charAt(i);
		int x = (int)ch;
		rev = rev+(char)(x-32);
	}
	System.out.println(rev);
}
}