import javax.swing.JOptionPane;


public class Oppgave4 
{

	public static void main(String[] args) 
	{
	      String f�rsteSifferstreng;
	      String andreSifferstreng;
	      int f�rstetall;
	      int andretall;
	      int sum;

	      f�rsteSifferstreng = JOptionPane.showInputDialog( "Skriv inn f�rste hele tall" );
	      andreSifferstreng = JOptionPane.showInputDialog( "Skriv inn andre hele tall" );

	      f�rstetall = Integer.parseInt( f�rsteSifferstreng );
	      andretall = Integer.parseInt( andreSifferstreng );

	      sum = f�rstetall + andretall;

	      JOptionPane.showMessageDialog( null, f�rsteSifferstreng + 
	    		  " + "  + 
	    		  andreSifferstreng + 
	    		  " = " + 
	    		  sum,
	         "Resultat", JOptionPane.PLAIN_MESSAGE );
	   } 
	}  