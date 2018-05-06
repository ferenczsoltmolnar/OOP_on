public class Ikerprimek {
	public static void main(String[] args) {
		//�ll�tsa el� az 1 �s 100 k�z� es� sz�mokb�l
		//k�sz�thet� �sszes sz�mp�rt
		//(a sz�mp�rok k�l�nb�z� sz�mokb�l �llnak).
		//Sz�molja meg, hogy ezek k�z�l
		//h�ny sz�mp�rra igaz, hogy ikerpr�mek
		//�s �rja ki ezeket a sz�mp�rokat a konzolra.
		//Megold�s: 8 ilyen sz�mp�r van.
		//Az ikerpr�mek olyan pr�msz�mok,
		//melyek k�l�nbs�ge 2 (pl. 5 �s 7 ikerpr�mek).
				
		int also_hatar = 1, felso_hatar = 100;
		int darab = 0;
		int i, j;
		
		System.out.println("Ikerprimek:");
		
		for (i = also_hatar; i < felso_hatar; i++) {

			boolean i_prime = primszamE(i);
			
			for (j = i + 1; j <= felso_hatar; j++) {
				if (i_prime && primszamE(j)) {
					if (j - i == 2) {
						darab++;
						System.out.println(i + ", " + j);
					}					
				}
			}
		}
		
		System.out.println(darab + " darab ikerprim van a megadott szamok kozott.");
	}

	public static boolean primszamE(int szam) {
		if (szam < 2) {
			return false;
		}
		
		for (int i = 2; i <= szam / 2; i++) {
			if (szam % i == 0) {
				return false;
			}
		}
		
		return true;
	}
		
	//logikai t�pus haszn�lat�val
	public static boolean primszamE2(int szam) {
		//talalt-e osztot
		boolean talalt = false;
		
		if (szam < 2) {
			return false;
		}
		
		for (int i = 2; i <= szam / 2; i++) {
			if (szam % i == 0) {
				talalt = true;
				break;
			}
		}
		
		return !talalt;
	}
}
