
public class Piertek {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			double pi=1;
			int darab = 1000 / 2;
			for (int i = 1; i < darab; i++) {
				pi *= 2.0 *i/(2*i-1);
				pi *= 2.0 *i/(2*i+1);
				
				
			}
			System.out.println("Wallis: ");
			System.out.println("Pi erteke: " + pi);
			System.out.println("Pi erteke: " + pi*2);
			
	}
	






}