import javax.swing.JOptionPane;

public class Oppgave2 
{

	public static void main(String[] args) 
	{
		String fornavn;
		fornavn = JOptionPane.showInputDialog("Hva er ditt fornavn?"); //definering av variabelen fornavn, type dialogboks + svar = fornavnet.
		
		String etternavn;
		etternavn = JOptionPane.showInputDialog("Hei, " + fornavn + ".\n" + // definering av variabelen etternavn.
		"Hva er ditt etternavn?");
		
		String fulltnavn;
		fulltnavn = "Velkommen, " + fornavn + " " + etternavn; //definering av variabelen fulltnavn, med både tekst og bruk av tidligere definerte variabler
		
		JOptionPane.showMessageDialog(null, fulltnavn); // ny type dialogboks, uten input. 
		}

}
