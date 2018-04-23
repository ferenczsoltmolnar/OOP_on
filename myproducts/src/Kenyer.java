public class Kenyer extends Product {
	private double mennyiseg;

	public Kenyer(String nev, int netto_ar, int afakulcs, double mennyiseg) {
		super(nev, netto_ar, afakulcs);
		this.mennyiseg = mennyiseg;
	}

	@Override
	public String toString() {
		return "Kenyer [" + super.toString() 
				+ ", egysegar: "
				+ brutto_ar() / mennyiseg
				+ "]";
	}
	
	public double getMennyiseg() {
		return mennyiseg;
	}
	
	public static boolean elso_kenyer_nagyobb_egysegaru(
			Kenyer elso_kenyer, Kenyer masodik_kenyer) {
		return elso_kenyer.brutto_ar() / elso_kenyer.mennyiseg >
				masodik_kenyer.brutto_ar() / masodik_kenyer.brutto_ar();
	}
}