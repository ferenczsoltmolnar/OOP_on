package sajat;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.print.attribute.standard.Finishings;

public class proba2 {

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
					tomb[i] = Integer.parseInt(sc.nextLine());
					rosszAdat = false;
				} catch (InputMismatchException e) {
					System.out.println("rossz input");
				}catch (NumberFormatException e) {
					System.out.println("rossz input");
				}  
			} while (rosszAdat);
		
		}
		System.out.println("A tomb elemei:");
		for (int i : tomb) {
			System.out.println(i);
		}
	}

}
