import javax.swing.JOptionPane;
public class Eksempel2_Seksertest 

{
  public static void main( String[] args )
  {
    Eksempel2_Terning terningen = new Eksempel2_Terning();
    int antKast = 6000;
    int antSeksere = 0; // har ikke f�tt noen sekser enn�!

    for ( int i = 1; i <= antKast; i++ ) // initialisering av for-setning som kj�res s� lenge variabel i er mellom 1 og 6000, alts� 6000 kast
    {
      terningen.kast();
      int verdi = terningen.getVerdi();
      if ( verdi == 6 )
        antSeksere++;  // for hver nye sekser �kes verdien p� denne variabelen med 1.
    }

    String utskrift = "Antall seksere p� " + antKast + " terningkast: " +
        antSeksere;
    JOptionPane.showMessageDialog( null, utskrift, "Terningtest",
        JOptionPane.PLAIN_MESSAGE );
  }
}
