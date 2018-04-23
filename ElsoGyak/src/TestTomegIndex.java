
public class TestTomegIndex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Szemely szemely = new Szemely();
		szemely.Magassag = 1.3;
		szemely.Suly = 211;
		szemely.Nev = "Kiss Jozsi";
		TTIcal(Szemely.testTomegindex());
		System.out.println(szemely.toString());
		
	}
	static void TTIcal(double tti){
		if (Szemely.tti<18.5){
			System.out.println("Sovany");
		}else if ( Szemely.tti > 25){
			System.out.println("Kover");
		}else {
			System.out.println("Normal");
		}

		
	}
	public String toString(){
		return "Nev: " +Szemely.Nev+ "Suly: " +Szemely.Suly+ " Magassag: "+Szemely.Magassag+ "tti(alkat):" +Szemely.tti;
		
	}

}
