import javax.swing.JOptionPane;

public class Eksempel1_Tidstester
{
  public static void main( String[] args )
  {
	// styrevariabel for do-while-l�kke. S� lenge verdi true kj�res l�kka atter en gang
    boolean flere = true;  
    
    /* Deklarering av objekt av type Eksempel1_Tidsberegner og gj�r kall p� dens metode antSekunder
     * Verdien som metoden antSekunder returnerer, blir returnert til kallstedet for metoden. 
     * For � kunne bruke den returnerte verdien i utskriften som f�lger etterp�, m� vi fange opp verdien i variabelen sekunder.
     */
    Eksempel1_Tidsberegner klokke = new Eksempel1_Tidsberegner(); 
    
    do // do-while-l�kke initialiseres.
    {
      String timetall = JOptionPane.showInputDialog( 
              "Skriv antall timer (heltall):" );
      String minuttall = JOptionPane.showInputDialog( 
              "Skriv antall minutter (heltall):" );
      String sekundtall = JOptionPane.showInputDialog( 
              "Skriv antall sekunder (heltall):" );
      
      // Typekonvertering (casting) fra variabeltype String til int. 
      int timer = Integer.parseInt( timetall );
      int min = Integer.parseInt( minuttall );
      int sek = Integer.parseInt( sekundtall );
      
      // Gj�r kall p�  verdien som ble retunert etter at objektet Eksempel1_Tidsberegner gjorde kall p� dens metode antSekunder
     // N�r parameterne kalles opp her er det med sin "ferdig utregnede verdi", alts� omgjort til sekunder.
      int sekunder = klokke.antSekunder( timer, min, sek ); 
      
      // Deklarering og initialisering av variabel utskrift av typen String. 
      String utskrift = timetall + " timer, " + minuttall + 
              " minutter, " + sekundtall + " sekunder = " + 
              sekunder + " sekunder.";
      
      // Dialogboks med utregning.
      JOptionPane.showMessageDialog( 
              null, utskrift, "Beregning av tid i sekunder", 
              JOptionPane.PLAIN_MESSAGE );
      
      // Initialisering og deklarering av int-variabel svar som sp�r bruker om flere beregninger er �nsket
      int svar = JOptionPane.showOptionDialog( 
              null, "Vil du beregne flere tider?", 
              "Tidsberegning", JOptionPane.YES_NO_OPTION, 
              JOptionPane.QUESTION_MESSAGE, null, null, null );
      
      // variabelen flere f�r her verdi true i de tilfelle variabelen svar er lik Ja-alternativ i dialogboksen
      flere = (svar == JOptionPane.YES_OPTION);
      
    } while ( flere ); // do-while-l�kken fortsetter s� lenge variabel flere f�r verdi true i dialogboksen over
  }
}