import javax.swing.JOptionPane;

public class Kursbok4
{
  private String kursnavn;

  /* Konstrukt�r som initialiserer datafeltet kursnavn.
   * En konstrukt�r er kjennetegnet ved at den har samme navn som klassen, 
   * samt en parameterliste mellom vanlige parenteser
   * Her er konstrukt�ren "Kursbok4", alts� det samme som klassen definert i linje 3
   * En konstrukt�r blir utf�rt hver gang vi bruker new-operatoren, ellers ikke.
   */
  public Kursbok4( String n )
  {
    kursnavn = n;
  }

  public void setKursnavn( String navn )
  {
    kursnavn = navn;
  }

  public String getKursnavn()
  {
    return kursnavn;
  }

  public void visTittel()
  {
    JOptionPane.showMessageDialog( null, "Kursbok for " + kursnavn );
  }
}