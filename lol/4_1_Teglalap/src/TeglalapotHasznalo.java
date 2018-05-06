/*
K�sz�tsen egy futtathat� oszt�lyt, amely a T�glalap oszt�lyt haszn�lja!
- Hozzon l�tre k�t t�glalap objektumot ("a" �s "b"),
�s deklar�ljon egy harmadik referencia v�ltoz�t ("c"), amely �rt�k�l "a"-t veszi fel!
- �rja ki mindh�rom referencia v�ltoz� eset�n a String-be �sszef�z�tt adatokat!
- V�ltoztassa meg "a" oldalait �s �rja ki �jra mindh�rom referencia adatait!
- V�ltoztassa meg "a" oldalait �gy, hogy az megegyezzen "b" oldalaival!
�rja ki az (a == b) �s az (a == c) kifejez�sek �rt�k�t!
Ezut�n "a" �s "b" �sszehasonl�t�s�ra haszn�lja az utolj�ra
defini�lt met�dust - amely igazat ad, ha a t�glalap oldalai megegyeznek a param�terk�nt
kapott t�glalap oldalaival, hamisat ha nem! 
 */
public class TeglalapotHasznalo {
	public static void main(String[] args) {
		//Teglalap egysegnyi_oldalhasszusagu_teglalapobjektum = new Teglalap();
		Teglalap a_objektum = new Teglalap(2);
		Teglalap b_objektum = new Teglalap(3, 4);
		//Teglalap c_objektum = a_objektum;
		Teglalap c_objektum;
		c_objektum = a_objektum;
		
		System.out.println("Referencia valtozok adatai:");
		System.out.println(a_objektum);
		System.out.println(b_objektum);
		System.out.println(c_objektum);
		
		a_objektum.setOldal(5);

		System.out.println("Referencia valtozok adatai: (a_obj. modositasa utan)");
		System.out.println(a_objektum);
		System.out.println(b_objektum);
		System.out.println(c_objektum);
		
		a_objektum.setOldal(3, 4);
		
		System.out.println("Referencia valtozok adatai: (a_obj. adatai megegyeznek b_obj. adataival)");
		System.out.println(a_objektum);
		System.out.println(b_objektum);
		System.out.println(c_objektum);

		System.out.println("a_objektum == b_objektum");
		System.out.println(a_objektum == b_objektum);
		
		System.out.println("a_objektum == c_objektum");
		System.out.println(a_objektum == c_objektum);
		
		System.out.println("a_objektum.egyenloE(b_objektum)");
		System.out.println(a_objektum.egyenloE(b_objektum));
	}
}
