package kermistest;

import java.util.Scanner;

public class Kermistest19072018Felix {

	public static void main(String[] args) {
				
				System.out.println("Kies een attractie die je wilt proberen.\n1 voor Botsauto's\n2 voor de Spin\n3 voor het Spiegelpaleis\n4 voor het Spookhuis\n5 voor Hawaii en\n6 voor Ladderklimmen");
				Scanner sc = new Scanner(System.in);
				String myString = sc.nextLine();
				
				int antwoord = Integer.parseInt(myString);
				
				System.out.println(antwoord + "..........."); // op de puntjes wil je later de keuze zien die gelinkt is aan de keuze: 1 voor botsauto's bijv.
				if (antwoord >= 7 ){							// ik wil hier graag ingeven dat de input in de scanner alleen 0 t/m 7 mag zijn. Indien een 8 wordt gekozen wil ik graag dat de syso op lijn 15 print.
					System.out.println("Je kan alleen een keuze van 0 t/m 6 ingeven");
				}
				SpookHuis Spookhuis1 = new SpookHuis();
				if (antwoord == 4) {
					System.out.println("Je hebt voor het spookhuis gekozen");
				}
				
				
	
	}
	
}



class Attractie{
	
}