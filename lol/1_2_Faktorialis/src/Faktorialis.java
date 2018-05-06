
public class Faktorialis {

	public static void main(String[] args) {

		//Sz�m�tsa ki 1-t�l 10-ig a sz�mok faktori�lis�t!
		//A faktori�lis sz�m�t�st k�l�n f�ggv�nyben val�s�tsa meg!

		//f�ggv�ny n�lk�l
		int n = 10;
		long faktorialis = 1;

		for (int i = 2; i <= n; i++) {
			faktorialis *= i;
		}

		System.out.println("n faktorialisa: " +
								faktorialis);

		//f�ggv�nyh�v�ssal
		System.out.println("n faktorialisa: " +
								faktorialis(n));
		System.out.println("n faktorialisa: " +
								faktorialis_rekurziv(n));

	}

	//iterat�v megold�ssal
	static private long faktorialis(int n) {
		long faktorialis = 1;

		for (int i = 2; i <= n; i++) {
			faktorialis *= i;
        }

		return faktorialis;
	}

	//rekurz�v megold�ssal
	static private long faktorialis_rekurziv(int n) {
		if (n < 2) {
			return 1;
		} else {
			return n * faktorialis_rekurziv(n - 1);
		}	
	}
		
}
