/*
Lag et program som kan fortelle brukeren hvor mange dager det er i en m�ned. Brukeren skal skrive inn navnet p� m�neden. 
Du trenger ikke ta hensyn til skudd�r.
*/
import javax.swing.JOptionPane;

public class Oppgave11 
{
	public static void main(String[] args) 
	{
		// variabel av typen string initialiseres ved inputdialogboks
		String m�ned = JOptionPane.showInputDialog("Skriv inn en m�ned");
		
		// Verdien til variabelen m�ned konverteres til sm� bokstaver ved String-metoden ".toLowerCase"
		// Dette for � omg� Javas skille mellom store og sm� bokstaver, hvilket gj�r at det ikke ser "januar" og "Januar" som lik.
		m�ned = m�ned.toLowerCase();
		String utskrift;
		
		switch (m�ned)
		{
		case "januar": 
			utskrift = "Januar har 31 dager";
			break; // break gj�r at programmet hopper ut av switch-blokka fordi en betingelse er oppfylt
		case "februar": 
			utskrift = "Februar har 28 dager";
			break;
		case "mars": 
			utskrift = "Mars har 31 dager";
			break;
		case "april": 
			utskrift = "April har 30 dager";
			break;
		case "mai": 
			utskrift = "Mai har 31 dager!";
			break;
		case "juni": 
			utskrift = "Juni har 30 dager";
			break;
		case "juli":
			utskrift = "Juli har 31 dager";
				break;
		case "august":
			utskrift = "August har 31 dager!";
				break;
		case "september":
			utskrift = "September har 30 dager";
				break;
		case "oktober":
			utskrift = "Oktober har 31 dager";
				break;
		case "november":
			utskrift = "November har 30 dager";
				break;
		case "desember":
			utskrift = "Desember har 31 dager";
				break;
		default: 
			utskrift = "Dette ekke noen m�ned jeg har h�rt om v�ffal!";
				break; // ikke n�dvendig med break her, men greit � ha med for ryddighetens skyld. 
		}
		JOptionPane.showMessageDialog(null , utskrift, 
				"Dager i m�neden", JOptionPane.INFORMATION_MESSAGE);
	}
}
