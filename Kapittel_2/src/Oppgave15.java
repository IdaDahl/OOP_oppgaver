import javax.swing.JOptionPane;

public class Oppgave15 {

	public static void main(String[] args) 
	{
		String f�rsteSifferstreng;
		String andreSifferstreng;
		String tredjeSifferstreng;
		
		int f�rstetall;
		int andretall;
		int tredjetall;

		
	      f�rsteSifferstreng =
	              JOptionPane.showInputDialog( "Skriv f�rste heltall:" );
	      andreSifferstreng =
	              JOptionPane.showInputDialog( "Skriv andre heltall:" );
	      f�rsteSifferstreng =
	              JOptionPane.showInputDialog( "Skriv tredje heltall:" );

	      f�rstetall = Integer.parseInt( f�rsteSifferstreng );
	      andretall = Integer.parseInt( f�rsteSifferstreng );
	      tredjetall = Integer.parseInt( f�rsteSifferstreng );
		
	      int minst = f�rstetall;
		
			if ( andretall < minst )
			    minst = andretall;
			if ( tredjetall < minst )
			    minst = tredjetall;
		 
		JOptionPane.showMessageDialog(null, minst + " er minst.");


	}

}
