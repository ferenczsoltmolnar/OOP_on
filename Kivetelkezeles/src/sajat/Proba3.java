package sajat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.print.attribute.standard.Finishings;

public class Proba3 {

	
	public static void main(String[] args) throws IOException {
		int n = 5;
		int[] tomb = new int[n];
		//Scanner sc = new Scanner(System.in);
		//sc.close();
		for (int i = 0; i < tomb.length; i++) {
			InputStreamReader bemenet = new InputStreamReader(System.in);
			BufferedReader sc = new BufferedReader(bemenet);
			
			
			
			boolean rosszAdat = true;
			do {
				System.out.println("Kerem adja meg az " + (i + 1) + " egesz szamot");
				System.out.println("szam:");
				try {
					tomb[i] = Integer.valueOf(sc.readLine()).intValue();
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
