
import javax.swing.JOptionPane;


public class Desimaltall 
{

	public static void main(String[] args) 
	{
	      String f�rsteDesimalstring;
	      String andreDesimalstring;
	      double f�rstedesimaltall;
	      double andredesimaltall;
	      double sum;

	      f�rsteDesimalstring = JOptionPane.showInputDialog( "Skriv inn f�rste desimaltall (bruk desimalpunktum)" );
	      andreDesimalstring = JOptionPane.showInputDialog( "Skriv inn andre desimaltall (bruk desimalpunktum)" );

	      f�rstedesimaltall = Double.parseDouble( f�rsteDesimalstring );
	      andredesimaltall = Double.parseDouble( andreDesimalstring );

	      sum = f�rstedesimaltall + andredesimaltall;

	      JOptionPane.showMessageDialog( null, f�rsteDesimalstring + 
	    		  " + "  + 
	    		  andreDesimalstring + 
	    		  " = " + 
	    		  sum,
	         "Resultat", JOptionPane.PLAIN_MESSAGE );
	   } 
	}  