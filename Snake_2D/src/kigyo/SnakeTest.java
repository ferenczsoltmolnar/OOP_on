package kigyo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class SnakeTest extends JPanel implements ActionListener{
	
	 /**
	 * 
	 */
	 private static final long serialVersionUID = 1L;
	 private final int border_with = 300;
	 private final int border_height = 300;
	 private final int dot_size = 10;
	 private final int all_dots = 900; //300*300/10*10
	 private final int rand_position = 24;
	 private final int delay = 140; 
	 
	 
	 private final int x[] = new int[all_dots];
	 private final int y[] = new int[all_dots];
	 
	 private int dots;
	 private Image body;
	 private Image head;
	 private Image apple;
	 private Timer timer;
	 
	 private int apple_x;
	 private int apple_y;
	 
		

		/*public int getBorder_with() {
			return border_with;
		}
		
		public int getBorder_height() {
			return border_height;
		}
		
		public int getDot_size() {
			return dot_size;
		}
		
		public int getAll_dots() {
			return all_dots;
		}
		
		public int getRand_position() {
			return rand_position;
		}
		
		public int getDealy() {
			return delay;
		}
		*/
		public SnakeTest(){
			initBoard();
		}
		
		private void initBoard(){
			
			addKeyListener(new kigyo.TAdapter());
			setBackground(Color.BLACK);
			setFocusable(true);
			setDoubleBuffered(true);
			setPreferredSize(new Dimension(border_with, border_height));
			loadImages();
			initGame();
		}
		 
		private void loadImages(){
			ImageIcon iib = new ImageIcon("resources/body.png");
			body = iib.getImage();
			ImageIcon iih = new ImageIcon("resources/head.png");
			head = iib.getImage();
			ImageIcon iia = new ImageIcon("resources/apple.png");
			apple = iib.getImage();
		}
		
		private void initGame(){
			
			dots = 3;
			
			for (int i = 0; i < dots; i++) {
				x[i] = 50 - i * 10;
				y[i] = 50;
			}
			
			locateApple();
			
			timer = new Timer(delay, this);
			timer.start();
			
		}

		private void locateApple() {
			int r = (int) (Math.random() * rand_position);
	        apple_x = (r * dot_size);

	        r = (int) (Math.random() * rand_position);
	        apple_y = (r *dot_size);
			
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if (TAdapter.inGame) {

	            checkApple();
	            checkCollision();
	            move();
	        }

	        repaint();
	    
			
		}

		private void move() {
			
			for (int i = dots; i > 0; i--) {
	            x[i] = x[(i - 1)];
	            y[i] = y[(i - 1)];
	        }

	        if (TAdapter.leftDirection) {
	            x[0] -= dot_size;
	        }

	        if (TAdapter.rightDirection) {
	            x[0] += dot_size;
	        }

	        if (TAdapter.upDirection) {
	            y[0] -= dot_size;
	        }

	        if (TAdapter.downDirection) {
	            y[0] += dot_size;
	        }
			
		}

		private void checkCollision() {

			for (int i = dots; i > 0; i--) {
				TAdapter.inGame = false;
				
				if ((i > 4) && (x[0] == x[i]) && (y[0] == y[i])) {
	                TAdapter.inGame = false;
	            }
				
				if (y[0] >= getHeight()) {
					 TAdapter.inGame = false;
		        }

		        if (y[0] < 0) {
		        	 TAdapter.inGame = false;
		        }

		        if (x[0] >= getWidth()) {
		        	 TAdapter.inGame = false;
		        }

		        if (x[0] < 0) {
		        	 TAdapter.inGame = false;
		        }
		        
		        if (! TAdapter.inGame) {
		            timer.stop();
		        }
			}
			
		}

		private void checkApple() {
			if ((x[0] == apple_x) && (y[0] == apple_y)) {

	            dots++;
	            locateApple();
	        }
			
		}
		
		public void paintComponent(Graphics g) {
		        super.paintComponent(g);

		        doDrawing(g);
		    }
		
		private void doDrawing(Graphics g) {
	        
	        if (TAdapter.inGame) {

	            g.drawImage(apple, apple_x, apple_y, this);

	            for (int z = 0; z < dots; z++) {
	                if (z == 0) {
	                    g.drawImage(head, x[z], y[z], this);
	                } else {
	                    g.drawImage(body, x[z], y[z], this);
	                }
	            }

	            Toolkit.getDefaultToolkit().sync();

	        } else {

	            gameOver(g);
	        }        
	    }
		
		private void gameOver(Graphics g) {
	        
	        String msg = "Game Over";
	        Font small = new Font("Helvetica", Font.BOLD, 14);
	        FontMetrics metr = getFontMetrics(small);

	        g.setColor(Color.white);
	        g.setFont(small);
	        g.drawString(msg, (getWidth() - metr.stringWidth(msg)) / 2, getHeight() / 2);
	    }

		
		
}
