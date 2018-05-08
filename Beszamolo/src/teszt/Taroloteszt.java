package teszt;

import java.util.Scanner;

import szgep.Merevlemez;

public class Taroloteszt {
static String lyon;
	/**
	 * @param args
	 */
	Scanner tipus = new Scanner(System.in);
	Scanner kapacitas = new Scanner(System.in);
	public static void main(String[] args) {
		
		int meret = 5;
		
		Merevlemez merevlemezek[] = new Merevlemez[meret];
		
		
		for (int i = 0;i<merevlemezek.lenght; i++ ){
			
			merevlemezek[i] = new Merevlemez("XY" + (i + 1), i * 1000 );
		
	}
		

}
}