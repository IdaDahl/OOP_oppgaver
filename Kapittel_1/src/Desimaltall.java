
import javax.swing.JOptionPane;


public class Desimaltall 
{

	public static void main(String[] args) 
	{
	      String førsteDesimalstring;
	      String andreDesimalstring;
	      double førstedesimaltall;
	      double andredesimaltall;
	      double sum;

	      førsteDesimalstring = JOptionPane.showInputDialog( "Skriv inn første desimaltall (bruk desimalpunktum)" );
	      andreDesimalstring = JOptionPane.showInputDialog( "Skriv inn andre desimaltall (bruk desimalpunktum)" );

	      førstedesimaltall = Double.parseDouble( førsteDesimalstring );
	      andredesimaltall = Double.parseDouble( andreDesimalstring );

	      sum = førstedesimaltall + andredesimaltall;

	      JOptionPane.showMessageDialog( null, førsteDesimalstring + 
	    		  " + "  + 
	    		  andreDesimalstring + 
	    		  " = " + 
	    		  sum,
	         "Resultat", JOptionPane.PLAIN_MESSAGE );
	   } 
	}  