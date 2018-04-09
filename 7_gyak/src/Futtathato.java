import java.io.ObjectInputStream.GetField;
import java.util.*;



public class Futtathato {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner beolvas = new Scanner(System.in);
		int meret;
		System.out.println("Kerem adja meg az alkalmazottak számát");
		System.out.println("meret=");
		meret = beolvas.nextInt();
		
		Alkalmazott alkalmazottak[] = new Alkalmazott[meret];
		Random veletlenSzam = new Random();
		
		int nyugdijkorhatar = Alkalmazott.getNyugdijkorhatar();
		
		for (int i = 0; i < alkalmazottak.length; i++) {
			alkalmazottak[i] = new Alkalmazott("XY" + (i + 1), veletlenSzam.nextInt(nyugdijkorhatar) ); 
			
			System.out.println(alkalmazottak[i]);
		}
		//alkalmazottak[0].setNyugdijkorhatar(70);
		Alkalmazott.setNyugdijkorhatar(70);
		for (Alkalmazott alkalmazott : alkalmazottak) {
			System.out.println(alkalmazott);
		}
		
		
		
		for (Alkalmazott alkalmazott : alkalmazottak) {
			if (alkalmazott.hanyEve() < 5) {
				System.out.println(alkalmazott);
			}
		}
		
		
		beolvas.close();
		

	}

}
