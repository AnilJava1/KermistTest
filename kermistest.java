package kermistest;

import java.util.Scanner;

public class kermistest {

	public static void main(String[] args) {
				
				System.out.println("Kies een attractie die je wilt proberen.\n 1 voor Botsauto's \n");
				Scanner scanner = new Scanner(System.in);
				String antwoord = scanner.nextLine();
				System.out.println(antwoord + "Dat is fout.");
				}
	}



class Attractie{
	
}




/*Stap 1, funct. doelst.: Creëer class Attractie. Check
 *Stap 2, funct.doelst.: Creëer subclass: Botsauto's. Gebruik hiervoor extend omdat botsauto een onderdeel is van attractie. Check.
 *Stap 3, funct.doelst.: Creëer de overige subclassen: Spin, Spiegelpaleis, Spookhuis, Hawaii, Ladderklimmen. Check.
 Controle: wat heb je nu: hoofdklasse = Attractie. Subclassen zijn de 'activiteiten'.  Zijn deze 'verbonden' met de super Attractie? Ja want alles staat op public
 *Stap 4, funct.doelst.: maak een scanner waarin input gegeven kan worden.










*/
