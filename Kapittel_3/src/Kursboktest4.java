import javax.swing.JOptionPane;

public class Kursboktest4
{
  public static void main( String[] args )
  {
    Kursbok4 bok1 = null, bok2 = null;
    // Leser inn et kursnavn:
    String navn = JOptionPane.showInputDialog( "Skriv kursnavn:" );

    bok1 = new Kursbok4( navn ); //oppretter objekt med innlest kursnavn

    int svar = JOptionPane.showOptionDialog( null, 
            "Vil du opprette en kursbok til?",
            "Opprette flere kursbøker?", JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, null, null );

    if ( svar == JOptionPane.YES_OPTION )
    {
      // Leser inn kursnavn:
      navn = JOptionPane.showInputDialog("Skriv kursnavn:");
      bok2 = new Kursbok4(navn);
    }

    // Viser kursnavn for opprettede kursbøker:
    String info = "Har opprettet kursbøker for følgende fag:\n";
    info = info + bok1.getKursnavn();
    if ( bok2 != null )
      info = info + "\n" + bok2.getKursnavn();

    JOptionPane.showMessageDialog( null, info, "Registrert kursnavn",
                                   JOptionPane.PLAIN_MESSAGE );
  }
}