package intro;

public class Main {

	public static void main(String[] args) {
		
		String internetSubeButonu = "Ýnternet Þubesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.19;
		//int vade = 36;
		//boolean dustumu = false;
		
		
		
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar Düþtü");
			
		}else if (dolarBugun>dolarDun) {
			System.out.println("Dolar Yükseldi");
		}
		else {
			System.out.println("Dolar eþittir");
		}
		
		String[] krediler = {
				"Hýzlý Kredi",
				"Mutlu Emekli Kredisi",
				"Konut Kredisi",
				"Çiftçi Kredisi",
				"MSB Kredisi",
				"MEB Kredisi",
				"Kültür Bakanlýðý Kredisi"
		};
		
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		for(int i = 0; i<krediler.length; i++) {
			System.out.println(krediler[i]);
		}

	}

}
