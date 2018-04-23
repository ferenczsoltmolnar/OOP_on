

public class Futtathato {

	public static void main(String[] args) {
		Product aru_objektum = new Product("aru", 20, 27);
		Kenyer kenyer_objektum = new Kenyer("kenyer", 100, 15, 0.75);
		
		System.out.println("A termekek adatai:");
		System.out.println(aru_objektum);
		System.out.println(kenyer_objektum);
		System.out.println(); 

	int melyik_dragabb = aru_objektum.dragabb_e(kenyer_objektum);

	if (melyik_dragabb > 0) {
		System.out.println("aru a dragabb\n" + aru_objektum);
	}
	else if (melyik_dragabb < 0) {
		System.out.println("kenyer a dragabb\n" + kenyer_objektum);
	}
	else {
		System.out.println("egyforma a brutto aruk\n");
		}
	}
	
	Product aru2 = new Kenyer("kenyer2", 210, 15, 1);
	
} 