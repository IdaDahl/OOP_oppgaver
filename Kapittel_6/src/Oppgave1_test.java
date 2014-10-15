/*
 * Definer en klasse Sirkel som skal representere en sirkel. 
 * Klassen skal ha et datafelt av type double for sirkelens radius. 
 * Dette skal tildeles verdi via en konstruktørparameter. 
 * Konstruktøren skal sjekke om den radien den mottar som parameter er >= 0.0. 
 * Dersom dette ikke er tilfelle, skal sirkelens radius settes lik 0.0. 
 * Klassen skal ha en get-metode som returnerer sirkelens radius.
 */
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Oppgave1_test 
{
	public static void main( String[] args )
	  {
		//initialiserer konstruktør/døråpneren til klassen Oppgave1_Sirkel
		Oppgave1_Sirkel sirkelData = new Oppgave1_Sirkel (); 
		
		// typekonverterer/caster/parser Stringvariabel til variabel radiusInput av typen double
		double radiusInput = Double.parseDouble(JOptionPane.showInputDialog( "Skriv inn radius i centimeter" ));
		// Sender/gir verdien til variabel radiusInput til setRadius-metoden i klassen Oppgave1_Sirkel.
		sirkelData.setRadius(radiusInput);
		
		//Desimalformatering. String formateringsstreng viser at jeg ønsker enerplass og de to første desimalene, samt lagt inn mellomrom ved store tall
		  String formateringsstreng = "#,###,##0.00";
		  /*
		   * Oppretter et objekt av type DecimalFormat. 
		   * Strengen formateringsstreng fungerer som konstruktørparameter overført som verdi til datafeltene i objektet. 
		   * Variabelen formateringsobjekt blir satt til å referere til (peke på) objektet.
		   */
		  DecimalFormat formateringsobjekt = new DecimalFormat( formateringsstreng );
		  
		  // formaterer double-variabelene til string med riktig desimalformatering
		  String utskriftRadius = formateringsobjekt.format( sirkelData.getRadius() );
		  String utskriftOmkrets = formateringsobjekt.format( sirkelData.diameter() );
		  String utskriftDiameter = formateringsobjekt.format( sirkelData.omkrets() );
		  String utskriftAreal = formateringsobjekt.format( sirkelData.areal() );
		  
		  
		  
		 String utskrift = 
				 "Radius: " + utskriftRadius 
					+ "\n\nDiameter: " + utskriftDiameter 
					+ "\n\nOmkrets: "+ utskriftOmkrets 
					+ "\n \nAreal: " + utskriftAreal 
					+ "\n";
		 
		
		 
		 JOptionPane.showMessageDialog(null, utskrift, "Sirkeldata", JOptionPane.INFORMATION_MESSAGE);
	  }  
}
