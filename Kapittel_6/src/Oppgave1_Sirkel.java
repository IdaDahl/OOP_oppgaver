/*
 * Definer en klasse Sirkel som skal representere en sirkel. 
 * Klassen skal ha et datafelt av type double for sirkelens radius. 
 * Dette skal tildeles verdi via en konstruktørparameter. 
 * Konstruktøren skal sjekke om den radien den mottar som parameter er >= 0.0. 
 * Dersom dette ikke er tilfelle, skal sirkelens radius settes lik 0.0. 
 * Klassen skal ha en get-metode som returnerer sirkelens radius.
 */

public class Oppgave1_Sirkel
{
	//initialiserer variabler
	private double radius;
	double pi = Math.PI;

	//
	public void setRadius(double radiusInput)
	{
		if (radiusInput <= 0.0) //sjekker at radius er større eller lik 0.0
		{
			radiusInput = 0.0; // returnerer verdi 0.0 hvis if-setning har verdi false
		}
		else 
			radius = radiusInput;
	}
		
	public double getRadius ()
	{
		return radius;
	}
		
	
	 public double diameter () // def. og int. av variabel diameter - trenger jeg parameter radius her?
	 {
		 return radius * 2;
	 }
		  
	 public double omkrets() // def. og int omkrets. av variabel
	 {
		 return radius * pi * 2;
	 }
		  
	 public double areal() // def. og int. av variabel areal
	 {
		 return radius * radius * pi;
	 }

	 
}
