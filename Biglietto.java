package biglietto.treno;

/*Creare una classe Biglietto con due attributi: 
 * chilometri ed età del passeggero.
Utilizzare i modificatori dei livelli di accesso per proteggere 
il funzionamento interno della classe ed esporre solo un’interfaccia 
fatta di metodi public, come abbiamo visto in classe e nelle slide.
La classe deve esporre un metodo che calcola il prezzo del biglietto 
secondo la logica:
il prezzo del biglietto è definito in base ai km (0.21 € al km)
va applicato uno sconto del 20% per i minorenni
va applicato uno sconto del 40% per gli over 65
Aggiungere una classe Biglietteria, eseguibile con metodo main, 
in cui si chiede all’utente di inserire il numero di km e l’età del 
passeggero e stampa il prezzo del biglietto calcolato.*/

public class Biglietto {

	//attributes
	private int kilometers ;
	private int passengerAge;
	
	
	//constructor
	public Biglietto(int numberOfKilometers, int passengerYearsOld) {
		super();
		this.kilometers = numberOfKilometers;
		this.passengerAge = passengerYearsOld;
	}
	
	//getter and setter methods
	public int getKilometers() {
		return kilometers;
	}
	public void setKilometers(int totalKilometers) {
		kilometers = totalKilometers;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}
	
	//methods
	public double finalPrice(){
		double ticketPrice = 0;
		if (passengerAge < 18) {
			ticketPrice = kilometers*0.21*0.80;
		}
		else if (passengerAge > 65) {
			ticketPrice = kilometers*0.21*0.60;
		}
		else {
			ticketPrice = kilometers*0.21;
		}
		return ticketPrice;
	}
}
