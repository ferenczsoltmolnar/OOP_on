package Java1;

import java.util.Random;

public class FUttato {
		
	public static void main(String args[]) {
		boolean megvan = false;
	int i = 0;
	shit:
		while(megvan != true){
			
			i = random();
			
			if (i>=10){
				System.out.println(i);
				megvan = true;
			}else {
				System.out.println(i);
				continue shit;
			}
				
		}

	}

	
	public static int random() {
		
		Random veletlen = new Random();
		return veletlen.nextInt(20+1);
		
	}
}
