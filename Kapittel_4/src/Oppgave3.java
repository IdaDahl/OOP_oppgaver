import javax.swing.JOptionPane;
public class Oppgave3 
{
	public static void main (String [] args)
	{
		String innlestTall = JOptionPane.showInputDialog (null, 
				"Skriv inn antall sekunder: ");
		int tid = Integer.parseInt(innlestTall);
		int timer;
		int minutter;
		int sekunder;
		int sekunderTimer = 3600;
		int sekunderMinutt = 60;
		while ( tid >= 0 )
		{
			timer = tid / sekunderTimer;
			tid = tid % sekunderTimer;
			minutter = tid / sekunderMinutt;
			tid = tid % sekunderMinutt;
			sekunder = tid;
			
			
		JOptionPane.showMessageDialog(null,
				innlestTall + " = " +
				timer + " timer, " + 
				minutter + " minutter, " + " og " +
				sekunder + " sekunder.");
		
		innlestTall = JOptionPane.showInputDialog (null, 
				"Skriv inn antall sekunder: ");
		tid = Integer.parseInt(innlestTall);
		}
		JOptionPane.showMessageDialog(null, "Du har nå avsluttet!");
	}
}