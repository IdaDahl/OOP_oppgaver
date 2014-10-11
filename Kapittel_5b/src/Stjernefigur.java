import javax.swing.*;
 
 public class Stjernefigur
 {
	 public static void main(String[] args)
	 {
		 String antall = JOptionPane.showInputDialog(
             "Velg antall linjer med stjerner");
     int n = Integer.parseInt(antall);
     String tekst = ""; // deklarering av tom string 
     
     // ytre for-løkke
     for (int i = 1; i <= n; i++)
     {
    	 // indre for-løkke. viktig å bruke et annet navn på styrevariabelen enn vi gjør i den ytre løkka
       for (int j = 1; j <= i; j++) 
       {
         tekst += "*   ";
       }
       tekst += "\n"; //går over til neste linje
     }
     JTextArea tekstområde = new JTextArea();
     tekstområde.setText(tekst);
     JOptionPane.showMessageDialog(null, tekstområde);
   }
}