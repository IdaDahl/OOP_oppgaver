import javax.swing.JOptionPane;

public class Oppgave6 
{

	public static void main(String[] args) {
		
		String navnString;
		String f�dsels�rString;
		String utskriftString;

		int f�dsels�r;
		int �r = 2014; // hvordan unng� � skrive dette manuelt, men kode utregning for hvilket �r vi er i?
		int sum;
		
		navnString = JOptionPane.showInputDialog("Hallo!\n" +
				"Hva heter du?");
		f�dsels�rString = JOptionPane.showInputDialog("Hvilket �r ble du f�dt?");
		
		f�dsels�r = Integer.parseInt( f�dsels�rString );
		sum = �r - f�dsels�r;
		
		utskriftString = "Hei, " + navnString; 
		JOptionPane.showMessageDialog(null, utskriftString + 
				". I �r fyller du " + 
				sum + 
				" �r.");
	}

}
