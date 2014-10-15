/*
 * Skriv en klasse Tidskonvertering som gir et testprogram for klassen Tidskonverterer. 
 * Programmet skal opprette et Tidskonverterer-objekt. Programmet skal gjentatte ganger kunne lese inn et antall sekunder fra brukeren. 
 * Det innleste antallet skal konverteres til timer, minutter og sekunder, ved at programmet gjør kall på Tidskonverterer-objektets metode konvertertTid, 
 * med den innleste verdi som aktuell parameter. Resultatet av konverteringen skal skrives ut i en dialogboks. 
 * Programmet skal avsluttes når det leses inn en negativ verdi for antall sekunder.
 */
public class Oppgave2_Tidskonverterer
{
	// deklarering av variabel
	int antSekunder;
	
	//set-metode som henter verdien til sekunderInput og setter den lik antSekunder
	public void setAntSekunder(int sekunderInput)
	{
			antSekunder = sekunderInput;
	}
	
	//initialisering og deklarering av variabel konvertertTid av typen String
	  public String konvertertTid()
	  {
		  // returverdien til variabel konvertertTid, utregning med bruk av variabel antSekunder
	    return 	(antSekunder / 3600) + " timer, " 
	    		+ (antSekunder % 3600) / 60 + " minutter og " 
	    		+ (antSekunder % 3600) % 60 + " sekunder. ";
	  }
	  
	}