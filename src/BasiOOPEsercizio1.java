/*
E' necessario scrivere una applicazione che simula il funzionamento di un frammento del sistema
informativo di un operatore di telefonia cellulare.
Si devono quindi rappresentare i dati relativi ad una carta SIM ed in particolare:
- il numero di telefono
- il credito disponibile in euro
- la lista delle telefonate effettuate
Per ciascuna telefonata deve essere rappresentata la durata in minuti
La classe SIM dovrà fornire le seguenti funzionalità:
- un costruttore parametrizzato che crea una SIM con numero di telefono, un credito e la lista delle
telefonate vuota
- un metodo per l'inserimento di una telefonata con i dati forniti dall'utente.
- una funzione per il calcolo dei minuti totali di conversazione.
- una funzione per il calcolo delle telefonate effettuate verso un certo numero
- una procedura per la stampa dei dati della SIM e l'elenco delle telefonate.

 */
public class BasiOOPEsercizio1 {

	public static void main(String[] args) {
		SIM sim1 = new SIM("3334445555", 5.0f);
		
		sim1.addCall("3384796484", 12.0f);
		sim1.addCall("3384796484", 10.0f);
		sim1.addCall("3384222484", 9.0f);
		
		sim1.printSIMData();

		System.out.println("total call minutes: " + sim1.getTotalMinutes());
		System.out.println("calls to 3384796484: " + sim1.getNumberOfCallsToNumber("3384796484"));
	}

}
