import javax.swing.JOptionPane;

public class Oppgave6 
{

	public static void main(String[] args) {
		
		String navnString;
		String fødselsårString;
		String utskriftString;

		int fødselsår;
		int år = 2014; // hvordan unngå å skrive dette manuelt, men kode utregning for hvilket år vi er i?
		int sum;
		
		navnString = JOptionPane.showInputDialog("Hallo!\n" +
				"Hva heter du?");
		fødselsårString = JOptionPane.showInputDialog("Hvilket år ble du født?");
		
		fødselsår = Integer.parseInt( fødselsårString );
		sum = år - fødselsår;
		
		utskriftString = "Hei, " + navnString; 
		JOptionPane.showMessageDialog(null, utskriftString + 
				". I år fyller du " + 
				sum + 
				" år.");
	}

}
