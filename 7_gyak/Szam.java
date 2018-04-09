package sajat_elso;

public class Szam {

	private final static double tures = 0.001;
	private double valos;
	
	public Szam(double tures, int valos) {
		super();
		this.valos = valos;
	}
	
	public boolean valoSzamTuresenBelulVanE(double valos) {	
		return Math.abs(this.valos - valos) < tures;
		
	} 

	public int getValos() {
		return valos;
	}

	public void setValos(int valos) {
		this.valos = valos;
	}
	
	
}
