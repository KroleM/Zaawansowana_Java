import java.util.Scanner;

public class PZAwJ_PD1 {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		double[] tablica1 = new double[] {1, 2, 3, 4.5};
		double[] tablica2 = new double[] {2.2, 1, 1, 2};
		Wektor wektor = new Wektor(tablica1);
		
		while(true)
		{
			System.out.println("\n1- Sprawdz adres e-mail\n"
					+ "2- Wczytaj wektor (zad. 2.1)\n"
					+ "3- Funkcje zaawansowane Wektor2D (zad. 2.2)\n"
					+ "4- Funkcje zaawansowane Wektor (zad. 2.3)\n"
					+ "0- Zamknij program");
			
			switch(scanner.nextLine())
			{
			case "1":
				Zad1_email.AnalizujEmail();
				break;
			case "2":
				wektor.show();
				System.out.println("Suma elementów wektora: " + wektor.suma());
				System.out.print("Z³¹czenie wektorów: ");
				wektor.add(new Wektor(tablica2)).show();
				break;
			case "3":
				System.out.println("D³ugoœæ wektora: " + new Wektor2D(tablica1).dlugosc());
				break;
			case "4":
				wektor.show();
				System.out.println("Suma elementów wektora: " + wektor.suma());
				System.out.println("Œrednia: " + wektor.srednia());
				System.out.println("Najwiêkszy element: " + wektor.max());
				break;	
			case "0":
				scanner.close();
				return;
			}
		}
	}

}
