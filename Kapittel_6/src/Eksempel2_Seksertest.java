import javax.swing.JOptionPane;
public class Eksempel2_Seksertest 

{
  public static void main( String[] args )
  {
    Eksempel2_Terning terningen = new Eksempel2_Terning();
    int antKast = 6000;
    int antSeksere = 0; // har ikke fått noen sekser ennå!

    for ( int i = 1; i <= antKast; i++ ) // initialisering av for-setning som kjøres så lenge variabel i er mellom 1 og 6000, altså 6000 kast
    {
      terningen.kast();
      int verdi = terningen.getVerdi();
      if ( verdi == 6 )
        antSeksere++;  // for hver nye sekser økes verdien på denne variabelen med 1.
    }

    String utskrift = "Antall seksere på " + antKast + " terningkast: " +
        antSeksere;
    JOptionPane.showMessageDialog( null, utskrift, "Terningtest",
        JOptionPane.PLAIN_MESSAGE );
  }
}
