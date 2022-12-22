package CaseConversion;
import java.util.Scanner;
public class FreqWords 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence...");
		String str = sc.nextLine();
		String ch[] = str.split(" ");
		int dup = -1;
		int fr[] = new int[ch.length];
		for (int i = 0; i < ch.length; i++) 
		{
			int count = 1;
			for (int j = i+1; j < ch.length; j++) 
			{
				if(ch[i].equals(ch[j]))
				{
					count++;
					fr[j] = dup;
				}
			}
			if (fr[i]!=dup) {
				fr[i]=count;
			}
		}
		for (int i = 0; i < fr.length; i++) {
			if (fr[i]!=dup) {
				System.out.println(ch[i]+"--->"+fr[i]);
			}
		}
	}
}
