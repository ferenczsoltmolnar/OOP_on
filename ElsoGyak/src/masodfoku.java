import java.util.Scanner;


public class masodfoku {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Adja meg az egyenlet elso erteket:");
		Scanner sc1 = new Scanner(System.in);
		int a = sc1.nextInt();
		
		System.out.println("Most a masodik erteket:");
		Scanner sc2 = new Scanner(System.in);
		int b = sc2.nextInt();
		
		System.out.println("Vegul a harmadik erteket:");
		Scanner sc3 = new Scanner(System.in);
		int c = sc3.nextInt();
		

			double  fgv1 = Math.sqrt(b * b - 4 * a * c);
			
			if (fgv1 > 0){
				
			double gyok1 = (-b + fgv1) / 2 * a;
			double gyok2 = (-b - fgv1) / 2 * a;
				System.out.println( "A " +a+ "^2 + 2 *" +b+ " +" +c+ "= 0 egyenlet valos gyöke:" +gyok1+ "és" +gyok2);
			}
			else if (fgv1 == 0){
				double gyok1 = -b / 2 * a;
				System.out.println( "A " +a+ "^2 + 2 * " +b+ "+" +c+ "= 0 egyenlet valos gyöke:" +gyok1);
				
			}
			else {
				System.out.println("Nincs megoldas");
			}
			
			
			
			
	}

}
