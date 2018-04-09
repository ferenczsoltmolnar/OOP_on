
public class Alkalmazott {
	private static int nyugdijkorhatar = 65; 
	
	
	
	private String nev;
	private int kor;
	private long fizetes;

	public Alkalmazott(String nev, int kor) {
		super();
		this.nev = nev;
		this.kor = kor;
		fizetes = kor * 10000;
	}
	public Alkalmazott(String nev, int kor, long fizetes) {
		super();
		this.nev = nev;
		this.kor = kor;
		this.fizetes = fizetes;
	}
	public int hanyEve(){
		
		return nyugdijkorhatar - kor; 
	
	}
	public String toString(){
		return "Alkalmazot neve:"+nev+", Alkalmazott kora:"+kor+",fizetese:"+fizetes+", Hatrelevo eveinek a szama:"+hanyEve();
		
		
	}
	public static int getNyugdijkorhatar() {
		return nyugdijkorhatar;
	}
	public static void setNyugdijkorhatar(int nyugdijkorhatar) {
		Alkalmazott.nyugdijkorhatar = nyugdijkorhatar;
	}
	
	public static Alkalmazott tobbEv (Alkalmazott elsoAlkalmazott, Alkalmazott masodikAlkalmazott){
		if (elsoAlkalmazott.hanyEve() < masodikAlkalmazott.hanyEve()){ 
			return masodikAlkalmazott;
			}else return elsoAlkalmazott;
		
	}
	
}
