package biglietto.treno;

import java.util.Scanner;

public class Biglietteria {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Salve, sono il calcolatore del tuo biglietto");
		System.out.println("Inserisci il numero di chilometri che percorrerai: ");
		int inputUtente = scan.nextInt();
		System.out.println("Adesso invece inserisci la tua et‡: ");
		int et‡Utente = scan.nextInt();
		
		Biglietto ticket = new Biglietto(inputUtente,et‡Utente);
		
		System.out.println("Il prezzo del tuo biglietto Ë : " + ticket.finalPrice());
		
		scan.close();
	}
}
