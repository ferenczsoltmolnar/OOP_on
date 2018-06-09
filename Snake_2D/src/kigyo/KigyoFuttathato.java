package kigyo;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class KigyoFuttathato extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1;



	public KigyoFuttathato(){
		initUI();
	}
	
	
	
private void initUI() {
	add(new SnakeTest());
    
    setResizable(false);
    pack();
    
    setTitle("Snake");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}



public static void main(String args[]) {
	EventQueue.invokeLater(() -> {
        JFrame ex = new KigyoFuttathato();
        ex.setVisible(true);
    });
}
	
}

