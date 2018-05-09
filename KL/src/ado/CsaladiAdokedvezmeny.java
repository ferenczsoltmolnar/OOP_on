package ado;

public class CsaladiAdokedvezmeny extends Adokedvezmeny{

	private int gyerekszam;
	private int kedvezmeny;

	static int[] honapra = {10000,17500,33000};

	public CsaladiAdokedvezmeny(int gyerekszam) {
		super("Csaladiadokedvezmeny");
		this.gyerekszam = gyerekszam;
		if(gyerekszam == 1){
			this.kedvezmeny = honapra[0];
		}else if(gyerekszam == 2){
			this.kedvezmeny = honapra[1];
		}else if(gyerekszam >= 3){
			this.kedvezmeny = honapra[2];
		}
	}

	@Override
	public int getAdoMertek() {
		return gyerekszam*kedvezmeny;
	}

	public int getGyerekszam() {
		return gyerekszam;
	}

	public int getKedvezmeny() {
		return kedvezmeny;
	}

	@Override
	public String toString() {
		return "CsaladiAdokedvezmeny{" +
				"gyerekszam=" + gyerekszam +
				", kedvezmeny=" + kedvezmeny + ", adokedvezmeny="+getAdoMertek();
	}

	public boolean osszehasonlito(CsaladiAdokedvezmeny masik){
		return this.getAdoMertek() > masik.getAdoMertek();
	}
}

