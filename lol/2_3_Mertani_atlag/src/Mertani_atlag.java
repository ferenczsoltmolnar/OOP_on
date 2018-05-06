
import java.util.Scanner;

public class Mertani_atlag {
	public static void main(String[] args) {
/*
Deklar�ljon, majd foglaljon helyet egy 10 elem� double t�mb sz�m�ra!
A t�mbelemek �rt�k�t a standard inputr�l olvassa be!
Haszn�lja a Scanner oszt�lyt!
Sz�m�tsa ki a t�mbelemek m�rtani �tlag�t (a t�mbelemek szorzata annyiadik gy�k alatt,
ah�ny tag� a szorzat)!. Gy�kvon�shoz haszn�lja a Math oszt�ly pow() hatv�nyoz� met�dus�t,
amelynek els� param�tere a hatv�nyalap (double),
m�sodik param�tere a hatv�nykitev� (double)
�s double �rt�ket ad vissza!		
*/
		double[] valostomb = new double[10];
		Scanner bemenet = new Scanner(System.in);
		
		for (int i = 0; i < valostomb.length; i++) {
			System.out.println("Kerem adja meg a(z) " + (i + 1) + ". elem erteket!");			
			valostomb[i] = bemenet.nextDouble();			
		}
		
		double mertani_atlag = 1;

		for (int i = 0; i < valostomb.length; i++) {
			mertani_atlag *= valostomb[i];
		}
		/*
		for (double valosszam : valostomb) {
			mertani_atlag *= valosszam;
		}
		*/
		
		mertani_atlag = Math.pow(mertani_atlag, 
								1.0 / valostomb.length);

		System.out.println("A tomb elemeinek mertani atlaga:");
		System.out.println(mertani_atlag);
		
		bemenet.close();
	}
}
