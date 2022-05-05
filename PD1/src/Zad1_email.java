import java.util.Scanner;

public class Zad1_email 
{	
	public static void AnalizujEmail()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj e-mail:");
		AnalizujEmail(scanner.nextLine());
	}
	public static void AnalizujEmail(String email)
	{
		//boolean et = false;
		byte ile = 0;
		for(int i=0; i<email.length(); i++)
		{
			if(email.charAt(i) == '@') ile++;
		}
		if(email.contains("@") && !email.startsWith("@") && !email.endsWith("@") && ile < 2 && email.indexOf('.', email.indexOf("@")) > 0)
			System.out.println("Adres e-mail " + email + " jest prawid³owy.");
		else  System.out.println("Nieprawid³owy adres e-mail.");
			
	}
	
}
