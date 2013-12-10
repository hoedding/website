package packe_junit;

public class Konto { 

	 

	 private long kontostand; // Kontostand in Eurocent 

	 

	 public Konto(long anfangsstand) { 

	 this.kontostand = anfangsstand; 

	 } 

	 

	 public void setzeKontostand(int betrag) { // zum Testen 

	 this.kontostand = betrag; 

	 } 

};