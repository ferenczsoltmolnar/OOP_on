
public class Szamharmas {
	public static void main(String[] args) {
		//1 �s 100 k�z�tti sz�mokb�l k�pezz�k
		//a Pitagoraszi sz�mh�rmasokat
		//�s �rjuk ki t�bl�zatos form�ban
		//(megold�s: 52 ilyen sz�mh�rmas van)!
		//A Pitagoraszi sz�mh�rmasok
		//egy der�ksz�g� h�romsz�g oldalainak
		//eg�sz m�r�sz�mai, azaz teljes�l r�juk,
		//hogy a2 + b2 = c2.
		
		int also_hatar = 1, felso_hatar = 100;
		int darab = 0;
		int i, j, k;
		
		System.out.println("Szamharmasok:");
		
		for (i = also_hatar; i < felso_hatar - 1; i++) {
			
			for (j = i + 1; j < felso_hatar; j++) {
				
				for (k = j + 1; k <= felso_hatar; k++) {

					if (i * i + j * j == k * k) {
							darab++;
							System.out.println(i + ", " + j + ", " + k);													
					}										
				}								
			}
		}
		
		System.out.println(darab + " darab szamharmas van a megadott szamok kozott.");				
	}
}
