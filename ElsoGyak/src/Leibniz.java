
public class Leibniz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int elojel=1;
		double pi = 0;
		int darab = 4000;
	
		for (int i = 1; i <= darab; i+=2) {
			 pi += elojel * 1.0 / i;
			 elojel *= -1;
		}
System.out.println("Leibniz :");
System.out.println("pi / 4: "+ pi);
System.out.println("pi: "+ pi * 4);
	}

}
