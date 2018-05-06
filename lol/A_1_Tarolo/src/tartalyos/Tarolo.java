/*
Defini�ljon egy tartalyos.Tarolo nev� oszt�lyt!

Defini�ljon benne a t�rfogat (eg�sz) t�rol�s�hoz adattagot!
Legyen konstruktora, amely param�terk�nt kapott adattal inicializ�lja az adattagot!
Legyen egy absztrakt met�dusa, amelynek nincs param�tere �s visszaadja,
hogy a Tarolo vesz�lyes-e!
Legyen met�dusa, amely visszaadja a t�rfogatot!
 */
package tartalyos;

public abstract class Tarolo {

	private int terfogat;

	public Tarolo(int terfogat) {
		this.terfogat = terfogat;
	}
	
	public abstract boolean veszelyesE();

	public int getTerfogat() {
		return terfogat;
	}
	
}
