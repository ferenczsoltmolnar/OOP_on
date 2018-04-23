
public class TeglalapotHasznalo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Teglalap a_object = new Teglalap(2);
		Teglalap b_object = new Teglalap(3, 4);
		
		Teglalap c_object;
		c_object = a_object;
	
		System.out.println(a_object);
		System.out.println(b_object);
		System.out.println(c_object);
		
		a_object.setOldalak(5);
		System.out.println(a_object);
		System.out.println(b_object);
		System.out.println(c_object);
		
		a_object.setOldalak(3, 4);

		System.out.println(a_object);
		System.out.println(b_object);
		System.out.println(c_object);
		
		System.out.println(a_object == b_object);
		System.out.println(a_object == c_object);
		System.out.println(a_object.egyezikE(b_object));
	}

}
