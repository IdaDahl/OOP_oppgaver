import javax.swing.JOptionPane;
import java.text.DecimalFormat; // importerer bibliotek som lar oss kontrollere antall desimaler vi �nsker skrevet ut. 

public class FormateringUtskriftDesimaler
{

	public static void main(String[] args) 
	{
		Double x = 34.567143;
		String formateringsstreng = �##0.00�; // # indikerer et siffer, og vises ikke n�r det er null, 0 indikerer et siffer som skal vises uansett, . indikerer komma (p� norsk)
		//variabel av typen String;
		
		Decimalformatformateringsobjekt= new Decimalformat(formateringsstreng);
		//objekt av klassen Decimalformat deklareres og gis verdi fra formateringsstreng som konstrukt�rparameter;
				
		String utskrift= formateringsobjekt.format(x);
	}
}
