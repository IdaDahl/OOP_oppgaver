import javax.swing.JOptionPane;

public class Oppgave6
{

	public static void main(String[] args) {
		
		String radiusInput = JOptionPane.showInputDialog( "Skriv inn verdi for radius i centimeter.  "
				+ "\n Bruk desimalpunktum." );
		String utskrift = "";
		double radius = Double.parseDouble( radiusInput );
		double pi = 3.14;
		double areal;
		double omkrets;
		
		while (radius >= 1)
		{
			areal = pi * radius * radius;
			omkrets = 2 * pi * radius;
			utskrift = "Arealet er " + areal + " centimeter. "
					+ "\nOmkretsen er " + omkrets + " centimeter. ";
		
			JOptionPane.showMessageDialog( null, utskrift, 
					"Resultat", JOptionPane.PLAIN_MESSAGE);
			radiusInput = JOptionPane.showInputDialog( "Skriv inn verdi for radius (bruk desimalpunktum)" );
			radius = Double.parseDouble( radiusInput );
		}
	}

}
