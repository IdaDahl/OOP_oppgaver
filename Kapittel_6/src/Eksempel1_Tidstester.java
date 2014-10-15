import javax.swing.JOptionPane;

public class Eksempel1_Tidstester
{
  public static void main( String[] args )
  {
	// styrevariabel for do-while-løkke. Så lenge verdi true kjøres løkka atter en gang
    boolean flere = true;  
    
    /* Deklarering av objekt av type Eksempel1_Tidsberegner og gjør kall på dens metode antSekunder
     * Verdien som metoden antSekunder returnerer, blir returnert til kallstedet for metoden. 
     * For å kunne bruke den returnerte verdien i utskriften som følger etterpå, må vi fange opp verdien i variabelen sekunder.
     */
    Eksempel1_Tidsberegner klokke = new Eksempel1_Tidsberegner(); 
    
    do // do-while-løkke initialiseres.
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
      
      // Gjør kall på  verdien som ble retunert etter at objektet Eksempel1_Tidsberegner gjorde kall på dens metode antSekunder
     // Når parameterne kalles opp her er det med sin "ferdig utregnede verdi", altså omgjort til sekunder.
      int sekunder = klokke.antSekunder( timer, min, sek ); 
      
      // Deklarering og initialisering av variabel utskrift av typen String. 
      String utskrift = timetall + " timer, " + minuttall + 
              " minutter, " + sekundtall + " sekunder = " + 
              sekunder + " sekunder.";
      
      // Dialogboks med utregning.
      JOptionPane.showMessageDialog( 
              null, utskrift, "Beregning av tid i sekunder", 
              JOptionPane.PLAIN_MESSAGE );
      
      // Initialisering og deklarering av int-variabel svar som spør bruker om flere beregninger er ønsket
      int svar = JOptionPane.showOptionDialog( 
              null, "Vil du beregne flere tider?", 
              "Tidsberegning", JOptionPane.YES_NO_OPTION, 
              JOptionPane.QUESTION_MESSAGE, null, null, null );
      
      // variabelen flere får her verdi true i de tilfelle variabelen svar er lik Ja-alternativ i dialogboksen
      flere = (svar == JOptionPane.YES_OPTION);
      
    } while ( flere ); // do-while-løkken fortsetter så lenge variabel flere får verdi true i dialogboksen over
  }
}