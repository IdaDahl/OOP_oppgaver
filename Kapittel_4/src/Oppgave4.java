import javax.swing.JOptionPane;

public class Oppgave4 
{
	public static void main (String [] args)
	{
		
		String innlestTall = JOptionPane.showInputDialog (null, 
				"Skriv inn antall sekunder: ");
		int tid = Integer.parseInt(innlestTall);
		int timer, minutter, sekunder;
		int sekunderTimer = 3600;
		int sekunderMinutt = 60;
		
		while ( tid >= 0 )
		{
			minutter = tid / sekunderMinutt;
			timer = minutter / sekunderMinutt;
			minutter = minutter - (timer * sekunderMinutt);
			sekunder = tid - (timer * sekunderTimer) - (minutter * sekunderMinutt);
			
			String utskrift = "";
			
			if (timer > 0)
			{
				utskrift = timer + " t ";
			}
			if (minutter > 0)
			{
				utskrift += minutter + " m ";
			}
			
			utskrift += sekunder + " s ";
			
			JOptionPane.showMessageDialog(null,
				utskrift);
			
			innlestTall = JOptionPane.showInputDialog (null, 
					"Skriv inn antall sekunder: ");
			tid = Integer.parseInt(innlestTall);
		}
		JOptionPane.showMessageDialog(null, "Takk for dine sekund!");
	}
}