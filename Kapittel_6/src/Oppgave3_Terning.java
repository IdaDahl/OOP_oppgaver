import java.util.Random;

public class Oppgave3_Terning
{
  private int verdi;
  private Random generator = new Random();

  // n�r metoden kast kalles opp blir variabelen verdi satt lik et "tilfeldig tall" mellom 1 og 6.
  public void kast()
  {
    verdi = 1 + generator.nextInt( 6 );
  }
  
  // verdien variabel verdi f�r gjennom metoden kast returneres n�r variabelen getVerdi kalles opp
  public int getVerdi()
  {
    return verdi;
  }
}