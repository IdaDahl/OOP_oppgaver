import javax.swing.JOptionPane;

public class Oppgave5 {

	public static void main(String[] args) {
		
		String radiusString;
		
		double radius;
		double pi;
		
		radiusString = JOptionPane.showInputDialog( "Skriv inn verdi for radius (bruk desimalpunktum)" );
		
		radius = Double.parseDouble( radiusString );
		pi = 3.14;
		JOptionPane.showMessageDialog( null, pi * radius * radius, //trengte ikke egen variabel for sum nettopp fordi det blir regnet ut i denne dialogboksen (trenger bare sum-variabel hvis stykket skal stilles opp.
		"Resultat", JOptionPane.PLAIN_MESSAGE);
	}

}
