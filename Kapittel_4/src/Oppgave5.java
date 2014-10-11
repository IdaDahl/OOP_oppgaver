import javax.swing.JOptionPane;
public class Oppgave5 
{
	public static void main (String [] args)
	{
		String gram = JOptionPane.showInputDialog(null,
				"Hvor mye veier brevet i hele gram?");
		double vekt = Integer.parseInt(gram);
		double porto = 0.0;
		
		while (vekt >=0)
		{
		if ( vekt <= 20 )
			porto = 9.00;
		else if ( vekt <= 50 )
			porto = 14.00;
		else if ( vekt <= 100 )
			porto = 17.00;
		else if ( vekt <= 350 )
			porto = 27.00;
		else if ( vekt <= 1000 )
			porto = 67.00;
		else if ( vekt <= 2000 )
			porto = 145.00;
		
		String utskrift = "";
		if (vekt > 2000 )
			utskrift = "Brevet er for tungt.";
		else
			utskrift = "Porto er: " + porto + " kr.";
		JOptionPane.showMessageDialog (null, utskrift);
		
		gram = JOptionPane.showInputDialog(null,
				"Hvor mye veier brevet i hele gram?");
		vekt = Integer.parseInt(gram);
		}
	}
}