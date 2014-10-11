import javax.swing.JOptionPane;
public class Oppgave6 
{
	public static void main(String[] args)
    {
    	String radiusSirkel= JOptionPane.showInputDialog(null, 
    			"Skriv inn radius på sirkel", 
    			"Radius", 
    			JOptionPane.PLAIN_MESSAGE);
    	double pi = 3.14;
    	double radius =  Double.parseDouble(radiusSirkel);
    	
    	while (radius >= 0)
    	{
    	double areal = pi * radius * radius;
    	double omkrets = 2 * pi * radius;
    	String utskrift = "Arealet av sirkelen er: " + areal
				+ " og omkretsen er: " + omkrets;
    	JOptionPane.showMessageDialog( null,
    			utskrift);
    	radiusSirkel= JOptionPane.showInputDialog(null, 
    			"Skriv inn radius på sirkel", 
    			"Radius", 
    			JOptionPane.PLAIN_MESSAGE);
    	radius = Double.parseDouble(radiusSirkel);
    	}
    }
}