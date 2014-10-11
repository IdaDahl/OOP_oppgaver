import javax.swing.JOptionPane;

public class Kursboktest3 
{
	public static void main( String[] args)
	{
		Kursbok3 protokoll = new Kursbok3(); // oppretter objekt
		
		//Viser opprinnelig verdi til datafeltet kursnavn:
		JOptionPane.showMessageDialog(null,  "Opprinnelig kursnavn: " +
												protokoll.getKursnavn() );
		// Leser inn ny verdi på kursnavn
		String navn = JOptionPane.showInputDialog( "Skriv kursnavn" );
		protokoll.setKursnavn(navn); // lagrer innlest navn i objektet (hvilket objekt? navn eller protokoll?)
	
		// Viser den nye verdien til datafeltet kursnavn:
		JOptionPane.showMessageDialog(null, "Registrert kursnavn: " + 
											protokoll.getKursnavn() );
		
		// Skriver ut tittel med den nye "verdien" til kursnavn: 
		protokoll.visTittel();
		
	}
}