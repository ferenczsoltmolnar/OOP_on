
import java.util.Scanner;

public class Kalkulator {

	public static void main(String[] args) {
/*
Tegye a Kalkul�tor programot folyamatos m�k�d�s�v�!
A sz�m�t�s elv�gz�se ut�n k�rdezze meg a felhaszn�l�t,
hogy akar-e �j m�veletet megadni. Olvassa be a v�laszt!
Am�g igennel v�laszol, addig fusson a program.
*/
		Scanner bemenet = new Scanner(System.in);
		String valasz;
		
		do {						
			System.out.println("Kerem adja meg a kiszamitando kifejezest szokozokkel elvalasztva!");
			System.out.println("a kifejezes:");
			String kifejezes = bemenet.nextLine();
			
			String eredmenytomb[] = kifejezes.split(" ");
			
			double elso_operandus = Double.parseDouble(eredmenytomb[0]);
			double masodik_operandus = Double.parseDouble(eredmenytomb[2]);
			String operator = eredmenytomb[1];		
			
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
			}//switch
			
			System.out.println("Szeretne meg uj muveletet megadni?");
			System.out.print("valasz (igen/nem): ");
			valasz = bemenet.nextLine();
			
		} while (valasz.equals("igen"));
		
		System.out.println("Szamolas vege");
		
		bemenet.close();
	}//public static void main
	
}//class
