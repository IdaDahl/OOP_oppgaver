import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Ekstraoppgave {

	public static void main(String[] args) 
	{
		// deklarering og initialisering av variabler
		int tallInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Tast inn tallet du vil se gangetabellen til"));
		int produkt = 0;
		
		JTextArea gangetabellen = new JTextArea();
		gangetabellen.setText(tallInput + "-gangen\n\n");
		
		for (int i = 1; i <= 10; i += 1 )
		{
			produkt = tallInput * i;
			gangetabellen.append(tallInput + " * " + i + " = " + produkt + "\n");
		}
		
		JOptionPane.showMessageDialog(null, gangetabellen);
	}

}
