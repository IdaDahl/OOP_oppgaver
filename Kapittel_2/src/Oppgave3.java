import javax.swing.JOptionPane;

public class Oppgave3
{
   public static void main( String args[] )
   {
      String f�rsteSifferstreng;
      String andreSifferstreng;

      int f�rstetall;
      int andretall;
      int sum;

      // Leser inn f�rste tall fra bruker i form av en sifferstreng:
      f�rsteSifferstreng = JOptionPane.showInputDialog( 
      		"Skriv inn f�rste hele tall" );

      // Leser inn andre tall fra bruker i form av en sifferstreng:
      andreSifferstreng =
         JOptionPane.showInputDialog( "Skriv inn andre hele tall" );

      // Konverterer sifferstrengene til tallverdier:
      f�rstetall = Integer.parseInt( f�rsteSifferstreng );
      andretall = Integer.parseInt( andreSifferstreng );

      // Adderer tallene og lagrer summen i variabelen sum:
      sum = f�rstetall + andretall;

      // Viser resultatet:
      JOptionPane.showMessageDialog( null, "Summen er " + sum,
         "Svaret p� regnestykket", JOptionPane.PLAIN_MESSAGE );
   } // slutt p� main-metoden
}  // slutt p� klassen Addisjon