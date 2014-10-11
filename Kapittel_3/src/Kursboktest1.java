public class Kursboktest1
{
  public static void main( String[] args )
  {
	//Kursbok = klasse, protokoll = variabel som kaller opp, kursbok1 = objektet som blir kalt opp?
    Kursbok1 protokoll = new Kursbok1 (); // "Protokoll" er her variabelen som refererer til objektet.  
    /* Betyr linjen over at Kursbok1 protokoll settes lik kursbok1? */
    
    protokoll.visTittel(); // Gjør kall på objektets visTittel-metode
    // hvor er "protokoll" definert? I linje 5, ved at variabelen protokoll i klassen kursbok1 er satt lik, eller definert, som objektet kursbok1?
  }
}