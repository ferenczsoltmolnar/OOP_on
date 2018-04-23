package sajat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.print.attribute.standard.Finishings;

public class Proba4 {

	
	public static void main(String[] args) /*throws IOException*/ {
		int n = 5;
		int[] tomb = new int[n];
		//Scanner sc = new Scanner(System.in);
		//sc.close();
		for (int i = 0; i < tomb.length; i++) {
			tomb[i] = egeszetBeolvas(i + 1);
		
		}
		System.out.println("A tomb elemei:");
		for (int i : tomb) {
			System.out.println(i);
		}
	}
	
	public static int egeszetBeolvas(int i) {
		int egeszSzam = 0;
		
		try {
			//InputStreamReader bemenet = new InputStreamReader(System.in);
			//BufferedReader sc = new BufferedReader(bemenet);
			BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
			
			boolean rosszAdat = true;
			do {
				System.out.println("Kerem adja meg az " + i + " egesz szamot");
				System.out.println("szam:");
				try {
					egeszSzam = Integer.parseInt(sc.readLine());
					if (egeszSzam <= 0) {
						//throw new IllegalArgumentException();
						throw new NemPozitivSzamException("nem pozitiv szám");
					}
					rosszAdat = false;
				} catch (InputMismatchException e) {
					System.out.println("rossz input");
				}catch (NumberFormatException e) {
					System.out.println("rossz input");
				} catch (IllegalArgumentException e) {
				System.out.println("0 vagy nem negativ egesz szam");}
				catch (NemPozitivSzamException e) {
					System.out.println(e.getMessage());}
		
			} while (rosszAdat);
			
			}catch (IOException e) {
				e.printStackTrace();
			 }
			 
		
		return egeszSzam;
		
}
}	
