/*
Defini�ljon egy tartalyos.Tartaly oszt�lyt, amely egy valamilyen g�zt t�rol nagy nyom�son!
Legyen a tartalyos.Tarolo oszt�ly lesz�rmazottja!

Legyen adattagja a tart�ly nyom�s�nak (val�s) t�rol�s�ra;
valamint egy konstruktora, amely param�terben kapott adatokkal inicializ�lja az objektumot!

Defini�lja fel�l a vesz�lyess�get visszaad� met�dust �gy,
hogy akkor adjon igazat, ha a t�rfogat*nyom�s>100!

Legyen egy toString fel�ldefini�l�s, amely a tart�ly t�rfogat�t,
nyom�s�t �s hogy �vesz�lyes� vagy �nem vesz�lyes� adja vissza egy string-be �sszef�zve!

Legyen egy met�dusa, amely igazat ad, ha a tart�ly nagyobb nyom�s�,
mint egy param�terk�nt kapott tart�ly!

Legyen egy oszt�lyszint� met�dusa,
amely k�t param�terk�nt kapott tart�ly k�z�l a nagyobb t�rfogat�t adja vissza!
 */
package tartalyos;

public class Tartaly extends Tarolo {
	private double nyomas;

	public Tartaly(int terfogat, double nyomas) {
		super(terfogat);
		this.nyomas = nyomas;
	}

	@Override
	public boolean veszelyesE() {
		if (getTerfogat() * nyomas > 100) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Tartaly terfogata=" + getTerfogat() 
			+ ", nyomasa=" + String.format("%.2f", nyomas)
			+ ", " + (veszelyesE() ? "veszelyes" : "nem veszelyes");
	}
	
	public boolean nagyobbNyomasuMint(Tartaly masikTartaly) {
		return nyomas > masikTartaly.nyomas;
	}
	
	public static Tartaly nagyobbTerfogatuTartaly(Tartaly elsoTartaly, Tartaly masodikTartaly) {
		if (elsoTartaly.getTerfogat() > masodikTartaly.getTerfogat()) {
			return elsoTartaly;
		} else {
			return masodikTartaly;
		}
	}
}
