import java.util.Random;

public class Eksempel2_Terning 
{
  private int verdi;
  private Random generator = new Random();

  public Eksempel2_Terning()
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

