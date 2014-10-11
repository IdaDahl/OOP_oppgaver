import javax.swing.JOptionPane;

public class VanligeFeil 
{

	public static void main(String[] args) 
	{

		String radiusInsert = JOptionPane.showInputDialog(null, "Skriv inn radius i centimeter. \n Bruk punktumkomma ved desimaltall. ");
		double radius = Double.parseDouble (radiusInsert);
		double pi = 3.14;
		
		if (radius >= 0)
		{
			double areal = pi * radius * radius;
			JOptionPane.showMessageDialog(null, "Arealet til sirkelen er " + areal + " centimeter. ");
		}
	}

}
