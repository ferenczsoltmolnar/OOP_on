package sajat;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.print.attribute.standard.Finishings;

public class Proba1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 5;
		int[] tomb = new int[n];
		Scanner sc = new Scanner(System.in);
		//sc.close();
		for (int i = 0; i < tomb.length; i++) {
			boolean rosszAdat = true;
			do {
				System.out.println("Kerem adja meg az " + (i + 1) + " egesz szamot");
				System.out.println("szam:");
				try {
					tomb[i] = sc.nextInt();
					rosszAdat = false;
				} catch (InputMismatchException e) {
					System.out.println("rossz input");
				} 
				finally{
					sc.nextLine();
					
				}
			} while (rosszAdat);
		
		}
		System.out.println("A tomb elemei:");
		for (int i : tomb) {
			System.out.println(i);
		}
	}

}
