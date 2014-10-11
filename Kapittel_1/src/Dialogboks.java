import javax.swing.JOptionPane;

public class Dialogboks 
{
	public static void main(String[] args) // string viser at variabeltypen vi har med å gjøre er tekst
	{
		JOptionPane.showMessageDialog(null, "Hallo!\n" + // null = midtstiller dialogboksen, \n = linjeskift, + viser at resterende tekst hører til?
				"Dette programmet skriver\n" + 
				"over flere linjer"); // alltid semikolon for å avslutte kommandoen. 

	}

}
