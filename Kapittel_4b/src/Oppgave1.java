import javax.swing.JOptionPane;

public class Oppgave1
{
   public static void main( String args[] )
   {
      String f�rsteSifferstreng;   
      String resultat;        

      int f�rstetall;
      int andretall = 3;
      
      f�rsteSifferstreng =
              JOptionPane.showInputDialog( "Skriv inn et heltall:" );

      f�rstetall = Integer.parseInt( f�rsteSifferstreng );

     double produkt = f�rstetall % andretall;

      resultat = "";
     
      if ( produkt == 0 )
    	  resultat = f�rstetall + " er delelig med " + andretall;
      else
    	  resultat = f�rstetall + " er ikke delelig med " + andretall;
      
      JOptionPane.showMessageDialog( null, resultat, 
              "Sammenlikningsresultater",
         JOptionPane.INFORMATION_MESSAGE );
   }
}
