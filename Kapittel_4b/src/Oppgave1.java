import javax.swing.JOptionPane;

public class Oppgave1
{
   public static void main( String args[] )
   {
      String førsteSifferstreng;   
      String resultat;        

      int førstetall;
      int andretall = 3;
      
      førsteSifferstreng =
              JOptionPane.showInputDialog( "Skriv inn et heltall:" );

      førstetall = Integer.parseInt( førsteSifferstreng );

     double produkt = førstetall % andretall;

      resultat = "";
     
      if ( produkt == 0 )
    	  resultat = førstetall + " er delelig med " + andretall;
      else
    	  resultat = førstetall + " er ikke delelig med " + andretall;
      
      JOptionPane.showMessageDialog( null, resultat, 
              "Sammenlikningsresultater",
         JOptionPane.INFORMATION_MESSAGE );
   }
}
