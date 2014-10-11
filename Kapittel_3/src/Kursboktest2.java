import javax.swing.JOptionPane;

public class Kursboktest2
{
  public static void main( String[] args )
  {
    Kursbok2 protokoll = new Kursbok2(); // igjen, hva gjør EGENTLIG protokoll her?

    // Leser inn kursnavn (når objektet kursbok2 kalles opp? Det er med andre ord metoden for objektet?)
    String navn = JOptionPane.showInputDialog("Skriv inn kursnavn:");

    // Viser hvilket kurs det er opprettet kursbok for. 
    // Her kalles objektet visTittel opp. Gjennom parameteren eller variabelen protokoll?
    protokoll.visTittel(navn); 
  }
}