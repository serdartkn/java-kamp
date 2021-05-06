package intro;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Integer[] sayilar = {1,2,3,4,5};
		
		List<Integer> liste = Arrays.asList(sayilar);
		System.out.println(liste.toArray(sayilar));
		
	}	

}
