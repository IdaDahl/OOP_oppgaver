import javax.swing.JOptionPane;

public class Oppgave15 {

	public static void main(String[] args) 
	{
		String førsteSifferstreng;
		String andreSifferstreng;
		String tredjeSifferstreng;
		
		int førstetall;
		int andretall;
		int tredjetall;

		
	      førsteSifferstreng =
	              JOptionPane.showInputDialog( "Skriv første heltall:" );
	      andreSifferstreng =
	              JOptionPane.showInputDialog( "Skriv andre heltall:" );
	      førsteSifferstreng =
	              JOptionPane.showInputDialog( "Skriv tredje heltall:" );

	      førstetall = Integer.parseInt( førsteSifferstreng );
	      andretall = Integer.parseInt( førsteSifferstreng );
	      tredjetall = Integer.parseInt( førsteSifferstreng );
		
	      int minst = førstetall;
		
			if ( andretall < minst )
			    minst = andretall;
			if ( tredjetall < minst )
			    minst = tredjetall;
		 
		JOptionPane.showMessageDialog(null, minst + " er minst.");


	}

}
