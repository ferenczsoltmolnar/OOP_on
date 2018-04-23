



public class FirstClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Szorzas eredmenye:");
		int a = 5;
		int b = 4;
		
		//System.out.println(Osszeadas(a , b));
		char c='*';
		
			switch (c){
				case '+' : System.out.println(Osszeadas(a, b)); break;
				
				case '-' : System.out.println(Kivonas(a, b)); break;
				
				case '*' : System.out.println(Szorzas(a, b)); break;
				
				case '/' : System.out.println(Osztas(a, b)); break;
				
				case '%' : System.out.println(Maradek(a, b)); break;
		}

	}



static int Osszeadas(int x, int y){
		
		return  x + y;
	}
static int Kivonas(int x, int y){
	
	return x - y;
	}

static int Szorzas(int x, int y){
	
	return x * y;
	}

static int Osztas(int x, int y){
	
	return x / y;
	}
static int Maradek(int x, int y){
	
	return x % y;
	}
}