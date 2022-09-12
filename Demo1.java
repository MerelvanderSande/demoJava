
public class Demo1 {

	public static void main(String[] args) {
		
		new Tekst();
		
		Tekst tekst1 = new Tekst();
		tekst1.stukTekst = "po";
		Tekst tekst2 = new Tekst();
		tekst2.stukTekst = "ging";
		Tekst tekst3 = new Tekst();
		tekst3.stukTekst = "en";
		System.out.println(tekst1.stukTekst + tekst2.stukTekst + tekst3.stukTekst);
		
		}
}

class Tekst {
	String stukTekst;
}



class apparaat {
	
}

class tv extends apparaat{
	
}