import java.util.Scanner;

public class PZAwJ_PD1 {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("\n1- Sprawdz adres e-mail\n"
					+ "2- Przeanalizuj \"Witaj œwiecie\"\n"
					+ "3- Przelicz kilometry na mile\n"
					+ "4- Analizuj liczby\n"
					+ "0- Zamknij program");
			
			switch(scanner.nextLine())
			{
			case "1":
				Zad1_email.AnalizujEmail();
				break;
			case "2":
				
				break;
			case "3":
				
				break;
			case "0":
				scanner.close();
				return;
			}
		}
	}

}
