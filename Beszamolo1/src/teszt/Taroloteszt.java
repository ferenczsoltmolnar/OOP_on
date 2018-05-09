package teszt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


import szgep.Merevlemez;

public class Taroloteszt {
static String lyon;

	/**
	 * @param args
	 */
	/*static Scanner tipus = new Scanner(System.in);
	static Scanner kapacitas = new Scanner(System.in);
	static Scanner foglalt = new Scanner(System.in);*/
	public static void main(String[] args) {
		
		int meret = 5;
		
		Merevlemez[] merevlemezek = new Merevlemez[meret];
		
		System.out.println("Adja meg a lemezek adatait ebben a sorrendben: Tipus, Kapcitas, Foglalt terulet!");
		BufferedReader beolvasas = new BufferedReader(new InputStreamReader(System.in));
		String tipus = null;
		double kapacitas = 0, foglalt = 0;
		/*for (int i = 0;i<merevlemezek.length; i++ ){
			
			merevlemezek[i] = new Merevlemez(tipus.nextLine(), kapacitas.nextInt(), foglalt.nextInt() );
			
	}*/
		for (int i = 0; i < merevlemezek.length; i++) {
			boolean rosszTipus, rosszKapacitas, rosszFoglalt;
			rosszTipus = rosszFoglalt = rosszKapacitas = true;
		
		do {
			try {
				System.out.println("Kerem adja meg a(z) " + (i + 1) + ". merevlemez tipusát!");
				System.out.print("Tipus:");
				tipus = new String(beolvasas.readLine());
				//tipus =Integer.parseInt(myString);
				rosszTipus = false;
			
			} catch (IOException e) {
				e.printStackTrace();
			}					
	} while (rosszTipus);

	do {
			try {
				System.out.println("Kerem adja meg a(z) " + (i + 1) + ". merevlemez kapacitását!");
				System.out.print("Kapacitás:");
				kapacitas = Double.parseDouble(beolvasas.readLine());
				rosszKapacitas= false;
			} catch (IOException e) {
				e.printStackTrace();
			}
	} while (rosszKapacitas);	
	
	do {
		try {
			System.out.println("Kerem adja meg a(z) " + (i + 1) + ". merevlemez tárhelyének a foglaltságát!");
			System.out.print("Telitetség");
			foglalt = Double.parseDouble(beolvasas.readLine());
			rosszFoglalt = false;
		} catch (IOException e) {
			e.printStackTrace();
		}
} while (rosszFoglalt);	
		
	merevlemezek[i] = new Merevlemez(tipus, kapacitas, foglalt);
		}
		
		for (int i = 0; i < merevlemezek.length; i++) {
		System.out.println(	merevlemezek[i]);
		}
		Merevlemez legnagyobbKapacitas = merevlemezek[0];
		
		for (int i = 0; i < merevlemezek.length; i++) {
			legnagyobbKapacitas = Merevlemez.nagyobbKapacitas(legnagyobbKapacitas, merevlemezek[i]);
		}
		
		System.out.println("legnagyobb kapacitású merevlemez:");
		System.out.println(legnagyobbKapacitas);
		
			int y = 0;
			for (Merevlemez merevlemez : merevlemezek) {
		
				if (merevlemez.szabadTerulet()>merevlemez.getFoglaltTerulet()) {
					y++;
			}
			
		}
			System.out.println(y);
			System.out.println();
			System.out.println();
			System.out.println();
			
	}
		
		
}
