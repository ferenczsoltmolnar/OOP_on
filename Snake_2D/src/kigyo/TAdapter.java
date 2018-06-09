package kigyo;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TAdapter extends KeyAdapter implements KeyListener{
	 public static boolean inGame;
	 public static boolean leftDirection = false;
	 public static boolean rightDirection = true;
	 public static boolean upDirection = false;
	 public static boolean downDirection = false;

	public void keyPressed(KeyEvent e) {

		
         int key = e.getKeyCode();

         if ((key == KeyEvent.VK_LEFT) && (!rightDirection)) {
             leftDirection = true;
             upDirection = false;
             downDirection = false;
         }

         if ((key == KeyEvent.VK_RIGHT) && (!leftDirection)) {
             rightDirection = true;
             upDirection = false;
             downDirection = false;
         }

         if ((key == KeyEvent.VK_UP) && (!downDirection)) {
             upDirection = true;
             rightDirection = false;
             leftDirection = false;
         }

         if ((key == KeyEvent.VK_DOWN) && (!upDirection)) {
             downDirection = true;
             rightDirection = false;
             leftDirection = false;
         }
     }

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
