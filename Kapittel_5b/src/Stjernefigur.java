import javax.swing.*;
 
 public class Stjernefigur
 {
	 public static void main(String[] args)
	 {
		 String antall = JOptionPane.showInputDialog(
             "Velg antall linjer med stjerner");
     int n = Integer.parseInt(antall);
     String tekst = ""; // deklarering av tom string 
     
     // ytre for-l�kke
     for (int i = 1; i <= n; i++)
     {
    	 // indre for-l�kke. viktig � bruke et annet navn p� styrevariabelen enn vi gj�r i den ytre l�kka
       for (int j = 1; j <= i; j++) 
       {
         tekst += "*   ";
       }
       tekst += "\n"; //g�r over til neste linje
     }
     JTextArea tekstomr�de = new JTextArea();
     tekstomr�de.setText(tekst);
     JOptionPane.showMessageDialog(null, tekstomr�de);
   }
}