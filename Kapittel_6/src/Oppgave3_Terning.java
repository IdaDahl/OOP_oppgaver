import java.util.Random;

public class Oppgave3_Terning
{
  private int verdi;
  private Random generator = new Random();

  // når metoden kast kalles opp blir variabelen verdi satt lik et "tilfeldig tall" mellom 1 og 6.
  public void kast()
  {
    verdi = 1 + generator.nextInt( 6 );
  }
  
  // verdien variabel verdi får gjennom metoden kast returneres når variabelen getVerdi kalles opp
  public int getVerdi()
  {
    return verdi;
  }
}