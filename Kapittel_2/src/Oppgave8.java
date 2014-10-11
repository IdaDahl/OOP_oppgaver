import javax.swing.JOptionPane;

public class Oppgave8
	{

		public static void main(String[] args) 
		{
			String sekunderString;
			
			int samletsekunder;
			int timer;
			int resttimer;
			int minutter;
			int sekunder;
			
			sekunderString = JOptionPane.showInputDialog( "Skriv inn antall sekunder" );
			
			samletsekunder = Integer.parseInt(sekunderString);
			timer = samletsekunder / 3600;
			resttimer = samletsekunder % 3600;
			minutter = resttimer / 60;
			sekunder = minutter % 60; // evt restminutter
			
			JOptionPane.showMessageDialog(null, timer + " timer, " + 
					minutter + " minutter og " + 
					sekunder + " sekunder");
		}

	}