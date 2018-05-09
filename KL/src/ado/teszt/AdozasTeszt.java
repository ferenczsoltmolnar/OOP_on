package ado.teszt;

import ado.CsaladiAdokedvezmeny;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdozasTeszt {
	public static void main(String args[]) throws IOException {
		CsaladiAdokedvezmeny[] csKedvezmenyTomb = new CsaladiAdokedvezmeny[5];

		BufferedReader beolvaso = new BufferedReader(new InputStreamReader(System.in));

		for(int i=0; i<csKedvezmenyTomb.length; i++){
			System.out.println("Kerem a gyerekek szamat: ");
			int gyerekszam = Integer.parseInt(beolvaso.readLine());

			csKedvezmenyTomb[i] = new CsaladiAdokedvezmeny(gyerekszam);
		}

		for(int i=0; i<csKedvezmenyTomb.length; i++){
			System.out.println(csKedvezmenyTomb[i].toString());
		}

		CsaladiAdokedvezmeny legnagyobbCsKedvezmeny = csKedvezmenyTomb[0];
		for(int i=1; i<csKedvezmenyTomb.length; i++){
			if(!legnagyobbCsKedvezmeny.osszehasonlito(csKedvezmenyTomb[i])){
				legnagyobbCsKedvezmeny = csKedvezmenyTomb[i];
			}
		}
		System.out.println(legnagyobbCsKedvezmeny.toString());

		int haromGyerekesek = 0;
		for(int i=0; i<csKedvezmenyTomb.length; i++){
			if(csKedvezmenyTomb[i].getGyerekszam() >= 3){
				haromGyerekesek++;
			}
		}
		System.out.println("A 3 gyerekesek szama: "+haromGyerekesek);
	}
}
