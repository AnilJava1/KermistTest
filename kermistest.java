package kermistest;

import java.util.Scanner;

public class kermistest {

	public static void main(String[] args) {
				
				System.out.println("Kies een attractie die je wilt proberen.\n1 voor Botsauto's\n2 voor de Spin\n3 voor het Spiegelpaleis\n4 voor het Spookhuis\n5 voor Hawaii en\n6 voor Ladderklimmen");
				Scanner sc = new Scanner(System.in);
				String antwoord = sc.nextLine();
				
				System.out.println(antwoord + "..........."); // op de puntjes wil je later de keuze zien die gelinkt is aan de keuze: 1 voor botsauto's bijv.
				if (sc.nextLine > 6 || < 0){							// ik wil hier graag ingeven dat de input in de scanner alleen 0 t/m 7 mag zijn. Indien een 8 wordt gekozen wil ik graag dat de syso op lijn 15 print.
					System.out.println("Je kan alleen een keuze van 0 t/m 6 ingeven");
				}
	
	}
	
}



class Attractie{
	
}




/*Stap 1, funct. doelst.: Creëer class Attractie. Check
 *Stap 2, funct.doelst.: Creëer subclass: Botsauto's. Gebruik hiervoor extend omdat botsauto een onderdeel is van attractie. Check.
 *Stap 3, funct.doelst.: Creëer de overige subclassen: Spin, Spiegelpaleis, Spookhuis, Hawaii, Ladderklimmen. Check.
 Controle: wat heb je nu: hoofdklasse = Attractie. Subclassen zijn de 'activiteiten'.  Zijn deze 'verbonden' met de super Attractie? Ja want alles staat op public
 *Stap 4, funct.doelst.: maak een scanner waarin input gegeven kan worden. Check.
 *Stap 5,: funct.doelst.: zorg dat er alleen de keuze's 1 t/m 6 gegeven kan worden. 
 *Stap 5, funct.doelst.: link de scanner aan de attractie.










*/
