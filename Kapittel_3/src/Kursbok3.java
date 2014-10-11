import javax.swing.JOptionPane;


public class Kursbok3 
{
	private String kursnavn;
	//kursnavn er satt med private aksess, og for � kunne gj�re kall p� metoden m� vi derfor bruke en get-metode lengre ned i koden.
	
	public void setKursnavn ( String navn) // hvorfor ikke static her?
	{
	kursnavn = navn; 
	/* variabelen kursnavn settes lik variabelen navn 
	 * navn defineres i kursboktest3-filen og metoden til navn kalles her opp i kursnavn-metoden
	 * dette fordi den brukes i flere klasser og derfor m� v�re i "kj�refilen?
	 */
	}

	public String getKursnavn() 
	/* oppretter public String-variabel med navn getKursnavn. 
	 * funksjonen til getKursnavn
	 */
	{
		return kursnavn; 
		/* Hva returneres? 
		 * Definisjonen av kursnavn-objektet etter at metoden navn er kj�rt gjennom en gang  og har f�tt input fra brukeren, 
		 * alts� returneres kursnavns nye verdi. */
	}
	public void visTittel()
	{
		JOptionPane.showMessageDialog(null, "Kursbok for " + kursnavn); 
		/* Her kunne vi brukt getKursnavn, men siden visTittel defineres innad samme klasse (Kursbok3) blir det overfl�dig. 
		 * Hadde visTittel blitt definert i Kursbokstest3 derimot, ville dette v�rt n�dvendig.
		 */
	}
}
