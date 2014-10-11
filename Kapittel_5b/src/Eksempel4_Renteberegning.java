// Beregning av rentesrente.
import java.text.NumberFormat;  // Klasse for numerisk formatering
import javax.swing.JOptionPane; // Klasse for dialogbokser
import javax.swing.JTextArea; // Klasse for egne tekstomr�der

public class Eksempel4_Renteberegning
{
   public static void main( String args[] )
   {
      double bel�p;       // totalbel�p ved slutten av hvert �r
      double grunnbel�p = 1000.0;  // grunnbel�pet som blir forrentet
      double rentefot = 0.05;         // rentefot pro anno

      /* oppretter formateringsobjekt opprette et formateringsobjekt 
      * for den pengeenheten som brukes i det landet der java er blitt installert, 
      * i v�rt tilfelle for norske kroner
      */ 
      NumberFormat kroneformat = NumberFormat.getCurrencyInstance();

      // oppretter JTextArea for visning av utskrift
      JTextArea tekstomr�de = new JTextArea();

      // lager overskrift i tekstomr�det
      tekstomr�de.setText( "�r\ttotalbel�p\n" );

      // beregner totalbel�p for hvert �r i 10 �r
      for ( int �r = 1; �r <= 10; �r++ )
      {
    	  // Det gj�res her kall p� metoden pow definert i klassebibliotekets klasse Math. 
    	  // Dersom variablene grunntall og eksponent er av type int eller double og p� 
    	  // forh�nd er blitt deklarert og tilordnet verdi, 
    	  // s� vil instruksjonen Math.pow( grunntall, eksponent ); 
    	  // beregne og returnere potensen 'grunntall opph�yd i eksponent'. 
    	  // Klassen Math inneholder ogs� metoder for de andre vanligste funksjonene vi 
    	  // kjenner fra matematikk (sinus, cosinus, eksponensialfunksjon, etc.). 
         bel�p = grunnbel�p * Math.pow( 1.0 + rentefot, �r );

         // tilf�yer en tekstlinje i tekstomr�det
         tekstomr�de.append(�r + "\t" + kroneformat.format(bel�p) + "\n");
      } // slutt for-l�kke

      // viser resultater
      JOptionPane.showMessageDialog( null, tekstomr�de,
         "Rentesrente", JOptionPane.INFORMATION_MESSAGE );

   } // end main
} // end klasse Renteberegning