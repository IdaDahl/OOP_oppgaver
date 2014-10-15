public class Eksempel1_Tidsberegner
{
	int sekunder;
	
	public void setSekunder(int sekunderInput)
	{
			sekunder = sekunderInput;
	}
		
	public double getRadius ()
	{
		return sekunder;
	}
	
  public int antSekunder( int timer, int min, int sek )
  {
    return timer * 3600 + min * 60 + sek;
  }
}