import java.util.Random;

public class Oppgave3_Terning
{
  private int verdi;
  private Random generator = new Random();

  public Oppgave3_Terning()
  {
    kast();
  }

  public void kast()
  {
    verdi = 1 + generator.nextInt( 6 );
  }

  public int getVerdi()
  {
    return verdi;
  }
}