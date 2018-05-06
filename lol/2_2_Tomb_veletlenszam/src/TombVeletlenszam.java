import java.util.Random;

public class TombVeletlenszam {

	public static void main(String[] args) {
/*
Deklar�ljon, majd foglaljon helyet egy 10 elem� int t�mb sz�m�ra!
T�ltse fel 1 �s 50 k�z�tti v�letlensz�mokkal a t�mb�t!

1. Haszn�lja a java.util.Random oszt�lyt!
Els� l�p�s egy ilyen t�pus� objektum l�trehoz�sa
a v�letlensz�m gener�tor inicializ�l�s�hoz:
java.util.Random rand = new java.util.Random();
M�sodik l�p�s az oszt�ly nextXXX met�dus�nak h�v�sa.
Ezek a met�dusok 0 �s az argumentumk�nt megadott sz�m �ltal hat�rolt,
fel�lr�l nyitott intervallumb�l �ll�tj�k el� a megfelel� t�pus� v�letlensz�mot.
int random = rand.nextInt(50)+1;

2. Haszn�lja a java.lang.Math oszt�ly random() met�dus�t!
Ez a met�dus a [0,1) fel�lr�l nyitott intervallumb�l
egy lebeg�pontos v�letlensz�mot ad vissza.
A sz�mtartom�nyt a C-b�l ismert
(fels�hat�r-als�hat�r+1)+als�hat�r
k�plettel adhatjuk meg.
int random = (int)(Math.random() * 50) + 1;

�rja ki a t�mbelemeket ford�tott sorrendben!
Keresse meg a t�mbben a legnagyobb p�ros sz�mot!
Figyelje meg mi a k�l�nbs�g, ha a for ciklust,
illetve ha a foreach ciklust haszn�lja! 
 */
		//int[] tomb = new int[10];
		int tomb[] = new int[10];
		Random veletlenobjektum = new Random();

		System.out.println("A tomb elemei:");
		for (int i = 0; i < tomb.length; i++) {
			tomb[i] = veletlenobjektum.nextInt(50) + 1;
			//tomb[i] = (int)(Math.random() * 50) + 1;
			System.out.println(tomb[i]);
		}
		
		System.out.println();
		System.out.println("A tomb elemei forditott sorrendben");
		
		for (int i = tomb.length - 1 ; i >= 0; i--) {
			System.out.println(tomb[i]);
		}
		
		/*
		for (int i = 0; i < tomb.length; i++) {
			System.out.println(tomb[tomb.length - 1 - i]);
		}
		*/

		//a legnagyobb szamanak megkeresese
		int legnagyobb_index = 0;
		for (int i = 1; i < tomb.length; i++) {
			if (tomb[i] > tomb[legnagyobb_index]) {
				legnagyobb_index = i;
			}			
		}
		
		System.out.println();
		System.out.println("A legnagyobb szam: " + tomb[legnagyobb_index]);
		
		//legnagyobb paros szamanak megkeresese
		int legnagyobb_paros_index = -1;
		for (int i = 0; i < tomb.length; i++) {
			if (tomb[i] % 2 == 0) {
				if (legnagyobb_paros_index == -1) {
					legnagyobb_paros_index = i;
				} else {
					if (tomb[legnagyobb_paros_index] < tomb[i]) {
						legnagyobb_paros_index = i;
					}
				}
			} 			
		}//for

		int ciklusvaltozo = 0;
		legnagyobb_paros_index = -1;
		
		//foreach
		for (int i : tomb) {
			if (i % 2 == 0) {
				if (legnagyobb_paros_index == -1) {
					legnagyobb_paros_index = ciklusvaltozo;
				} else {
					if (tomb[legnagyobb_paros_index] < i) {
						legnagyobb_paros_index = ciklusvaltozo;
					}
				}
			} 			
			ciklusvaltozo++;
		}
		
		System.out.println();
		
		if (legnagyobb_paros_index != -1) {
			System.out.println("A legnagyobb paros szam: " + tomb[legnagyobb_paros_index]);
		} else {
			System.out.println("Nem volt az elemk kozott paros szam.");
		}		
	}
}
