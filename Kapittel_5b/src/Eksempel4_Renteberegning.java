// Beregning av rentesrente.
import java.text.NumberFormat;  // Klasse for numerisk formatering
import javax.swing.JOptionPane; // Klasse for dialogbokser
import javax.swing.JTextArea; // Klasse for egne tekstområder

public class Eksempel4_Renteberegning
{
   public static void main( String args[] )
   {
      double beløp;       // totalbeløp ved slutten av hvert år
      double grunnbeløp = 1000.0;  // grunnbeløpet som blir forrentet
      double rentefot = 0.05;         // rentefot pro anno

      /* oppretter formateringsobjekt opprette et formateringsobjekt 
      * for den pengeenheten som brukes i det landet der java er blitt installert, 
      * i vårt tilfelle for norske kroner
      */ 
      NumberFormat kroneformat = NumberFormat.getCurrencyInstance();

      // oppretter JTextArea for visning av utskrift
      JTextArea tekstområde = new JTextArea();

      // lager overskrift i tekstområdet
      tekstområde.setText( "år\ttotalbeløp\n" );

      // beregner totalbeløp for hvert år i 10 år
      for ( int år = 1; år <= 10; år++ )
      {
    	  // Det gjøres her kall på metoden pow definert i klassebibliotekets klasse Math. 
    	  // Dersom variablene grunntall og eksponent er av type int eller double og på 
    	  // forhånd er blitt deklarert og tilordnet verdi, 
    	  // så vil instruksjonen Math.pow( grunntall, eksponent ); 
    	  // beregne og returnere potensen 'grunntall opphøyd i eksponent'. 
    	  // Klassen Math inneholder også metoder for de andre vanligste funksjonene vi 
    	  // kjenner fra matematikk (sinus, cosinus, eksponensialfunksjon, etc.). 
         beløp = grunnbeløp * Math.pow( 1.0 + rentefot, år );

         // tilføyer en tekstlinje i tekstområdet
         tekstområde.append(år + "\t" + kroneformat.format(beløp) + "\n");
      } // slutt for-løkke

      // viser resultater
      JOptionPane.showMessageDialog( null, tekstområde,
         "Rentesrente", JOptionPane.INFORMATION_MESSAGE );

   } // end main
} // end klasse Renteberegning