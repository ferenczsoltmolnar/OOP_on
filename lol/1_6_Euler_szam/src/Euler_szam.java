public class Euler_szam {
	public static void main(String[] args) {
		
		//Adjon k�zel�t�st az Euler-f�le e sz�mra
		//(e = 2,718 281 828)
		//az al�bbi sorozat els� 100 / 1000 tagj�nak kisz�m�t�s�val!
        double e = 0;

        int darab = 100;

        for (int i = 0; i < darab; i++) {
                e += 1 / faktorialis(i);
        }

        System.out.println("Euler-fele szam");
        System.out.println("e: " + e);		
	}
	
    static private double faktorialis(int n) {
    	double faktorialis = 1;

    	for (int i = 2; i <= n; i++) {
                faktorialis *= i;
        }

        return faktorialis;
    }
}
