package intro;

public class Main {

	public static void main(String[] args) {
		
		String internetSubeButonu = "�nternet �ubesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.19;
		//int vade = 36;
		//boolean dustumu = false;
		
		
		
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar D��t�");
			
		}else if (dolarBugun>dolarDun) {
			System.out.println("Dolar Y�kseldi");
		}
		else {
			System.out.println("Dolar e�ittir");
		}
		
		String[] krediler = {
				"H�zl� Kredi",
				"Mutlu Emekli Kredisi",
				"Konut Kredisi",
				"�ift�i Kredisi",
				"MSB Kredisi",
				"MEB Kredisi",
				"K�lt�r Bakanl��� Kredisi"
		};
		
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		for(int i = 0; i<krediler.length; i++) {
			System.out.println(krediler[i]);
		}

	}

}
