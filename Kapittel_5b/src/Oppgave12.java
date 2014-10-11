import javax.swing.JOptionPane;

public class Oppgave12 {

	public static void main(String[] args) 
	{
		int tallInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Skriv inn årstallet du ønsker å sjekke. ")); //, "Skuddår?")); <-AWESOME! Tekst inni svar-feltet!
		String utskrift = "";
		
		if  ( (tallInput % 4 == 0 && tallInput % 100 != 0) || tallInput % 400 == 0)
		{
			utskrift = "And it all startet with the Big Bang, BANG! "
					+ "\nVisst var det skuddår!";
		}

		else 
		{
			utskrift = "Skivebommelom. No skuddår 4 U";
		}
		
		JOptionPane.showMessageDialog(null, utskrift, "Skuddår?", JOptionPane.WARNING_MESSAGE);

	}

}
