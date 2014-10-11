import javax.swing.JOptionPane;

public class Oppgave1 
{
	public static void main(String[] args) 
	{
		String navn; // Variabelen navn får verdien som svares i dialogboksen som ligger i koden under.
		navn = JOptionPane.showInputDialog("Hallo!\n" + // showInputDialog viser metoden, altså typen dialogboks som skal vises (her med input; skrivefelt).
				"Hva heter du?");
		String utskrift;
		utskrift = "Heisann, " + navn; // her vil verdien for variabelen navn vises og variabelen utskrift tilordnes sine egenskaper i denne linjen og neste
		JOptionPane.showMessageDialog(null, utskrift); //Annen type dialogboks, uten input, hvor verdien for utskrift vises.

	}

}
