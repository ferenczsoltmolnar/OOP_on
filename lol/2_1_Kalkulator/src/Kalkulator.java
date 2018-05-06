
import java.util.Scanner;

public class Kalkulator {

	public static void main(String[] args) {
/*
 �rja meg a 4 alapm�veletet megval�s�t� Kalkul�tor programot Java nyelven!
 Az elv�gzend� m�veletet �s az operandusokat a felhaszn�l� adja meg.
 A program a megadott m�velett�l f�gg�en v�gzi el a sz�m�t�si feladatot.
 A m�velet vizsg�lat�hoz haszn�lja a switch utas�t�st.
 Az oszt�s m�velet v�grehajt�sakor �gyeljen az operandusok t�pus�ra,
 �s ne engedje a 0-val val� oszt�st.

A felhaszn�l�i input megad�s�t pr�b�lja meg k�tf�lek�ppen:
1. K�l�n olvassa be a k�t operandust (sz�mok) �s k�l�n az oper�tort (char)!
Haszn�lja a Scanner oszt�ly nextXXX met�dusait!
*/
		Scanner bemenet = new Scanner(System.in);
		//vagy import vagy kiirjuk a csomagok neveit
		//java.util.Scanner bemenet2 =  new java.util.Scanner(System.in);		
		
		System.out.println("Kerem adja meg az 1. operandust!");
		System.out.println("1. operandus:");
		double elso_operandus = bemenet.nextDouble();

		System.out.println("Kerem adja meg a 2. operandust!");
		System.out.println("2. operandus:");
		double masodik_operandus = bemenet.nextDouble();

		System.out.println("Kerem adja meg a muveletet (az operatort)!");
		System.out.println("a muvelet:");
		//.next() space-ig olvas, .nextLine() space-t is olvas, es az ujsor karakter is 
		String operator = bemenet.nextLine();//a megmaradt ujsort olvassa be
		operator = bemenet.nextLine();//operator beolvasasa

/*		
		//1.7-tol a switch-ben lehet sztring is
		switch (operator) {////ez egy sztring
			case "+":
				System.out.println("az osszeadas eredmenye");
				System.out.println(elso_operandus + " + " + masodik_operandus + " = " +
						(elso_operandus + masodik_operandus));
				break;

			case "-":
				System.out.println("a kivonas eredmenye");
				System.out.println(elso_operandus + " - " + masodik_operandus + " = " +
						(elso_operandus - masodik_operandus));
				break;

			case "*":
				System.out.println("a szorzas eredmenye");
				System.out.println(elso_operandus + " * " + masodik_operandus + " = " +
						(elso_operandus * masodik_operandus));
				break;

			case "/":
				
				if (masodik_operandus == 0) {
					System.out.println("0-val nem lehet osztani! Vegtelent fog adni eredmenyul.");
				}

				System.out.println("az osztas eredmenye");
				System.out.println(elso_operandus + " / " + masodik_operandus + " = " +
						(elso_operandus / masodik_operandus));
				break;
				
			default:
				System.out.println("Nem a 4 alapmuvelet (+, -, *, /) egyiket adta meg!");
				break;
		}
*/
		
		//1.7 alatt a switch-ben csak egesz kifejezes lehet
		switch (operator.charAt(0)) {//ez egy karakter
			case '+':
				System.out.println("az osszeadas eredmenye");
				System.out.println(elso_operandus + " + " + masodik_operandus + " = " +
						(elso_operandus + masodik_operandus));
				break;

			case '-':
				System.out.println("a kivonas eredmenye");
				System.out.println(elso_operandus + " - " + masodik_operandus + " = " +
						(elso_operandus - masodik_operandus));
				break;

			case '*':
				System.out.println("a szorzas eredmenye");
				System.out.println(elso_operandus + " * " + masodik_operandus + " = " +
						(elso_operandus * masodik_operandus));
				break;

			case '/':
				
				if (masodik_operandus == 0) {
					System.out.println("0-val nem lehet osztani! Vegtelent fog adni eredmenyul.");
				}

				System.out.println("az osztas eredmenye");
				System.out.println(elso_operandus + " / " + masodik_operandus + " = " +
						(elso_operandus / masodik_operandus));
				break;
				
			default:
				System.out.println("Nem a 4 alapmuvelet (+, -, *, /) egyiket adta meg!");
				break;
		}

/*
2. Egyetlen sztringk�nt olvassa be az inputot space-el elv�lasztva a tagokat (pl.: 3 + 5)!
A beolvasott sztringet a space-ek ment�n sz�t kell bontani tagokra a split met�dussal,
melynek param�tere egy sztring (a tagol� karaktersorozat).
Az eredm�ny egy sztring t�mb, melynek egyes elemeit a megfelel� t�pusra konvert�lva
kapjuk meg az operandusokat (a csomagol� oszt�lyok parseXXX met�dusait haszn�lva) �s az oper�tort. 		
 */
		
		System.out.println("Kerem adja meg a kiszamitando kifejezest!");
		System.out.println("a kifejezes:");
		String kifejezes = bemenet.nextLine();//space-t is olvas
		
		//String[] eredmenytomb = kifejezes.split(" ");
		String eredmenytomb[] = kifejezes.split(" ");
		
		elso_operandus = Double.parseDouble(eredmenytomb[0]);
		masodik_operandus = Double.parseDouble(eredmenytomb[2]);
		operator = eredmenytomb[1];
		
		alapmuveletek(elso_operandus, masodik_operandus, operator);

		bemenet.close();
	}//public static void main
	
	public static void alapmuveletek(double elso_operandus, double masodik_operandus, String operator) {

		switch (operator.charAt(0)) {
			case '+':
				System.out.println("az osszeadas eredmenye");
				System.out.println(elso_operandus + " + " + masodik_operandus + " = " +
						(elso_operandus + masodik_operandus));
				break;
	
			case '-':
				System.out.println("a kivonas eredmenye");
				System.out.println(elso_operandus + " - " + masodik_operandus + " = " +
						(elso_operandus - masodik_operandus));
				break;
	
			case '*':
				System.out.println("a szorzas eredmenye");
				System.out.println(elso_operandus + " * " + masodik_operandus + " = " +
						(elso_operandus * masodik_operandus));
				break;
	
			case '/':
				
				if (masodik_operandus == 0) {
					System.out.println("0-val nem lehet osztani!");
				} else {
					System.out.println("az osztas eredmenye");
					System.out.println(elso_operandus + " / " + masodik_operandus + " = " +
							(elso_operandus / masodik_operandus));
				}				
				break;
				
			default:
				System.out.println("Nem a 4 alapmuvelet (+, -, *, /) egyiket adta meg!");
				break;
		}//switch
	}//public static void alapmuveletek

}//class
