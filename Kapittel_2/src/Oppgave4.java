import javax.swing.JOptionPane;


public class Oppgave4 
{

	public static void main(String[] args) 
	{
	      String førsteSifferstreng;
	      String andreSifferstreng;
	      int førstetall;
	      int andretall;
	      int sum;

	      førsteSifferstreng = JOptionPane.showInputDialog( "Skriv inn første hele tall" );
	      andreSifferstreng = JOptionPane.showInputDialog( "Skriv inn andre hele tall" );

	      førstetall = Integer.parseInt( førsteSifferstreng );
	      andretall = Integer.parseInt( andreSifferstreng );

	      sum = førstetall + andretall;

	      JOptionPane.showMessageDialog( null, førsteSifferstreng + 
	    		  " + "  + 
	    		  andreSifferstreng + 
	    		  " = " + 
	    		  sum,
	         "Resultat", JOptionPane.PLAIN_MESSAGE );
	   } 
	}  