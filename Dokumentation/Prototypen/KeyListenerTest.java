import java.awt.*;
import java.awt.event.*;

public class KeyListenerTest implements KeyListener {
    private Frame f;
    private TextField tf;
    public int key;
    
    public KeyListenerTest() {
        f = new Frame("JumpAndRunGame1");
        tf = new TextField("Bewegung");
    }
    
    public void launchFrame() {
        Label label = new Label("Wohin m�chten sie sich bewegen");
        
        // Hinzuf�gen der Komponenten zum Frame
        f.add(label, BorderLayout.NORTH);
        f.add(tf, BorderLayout.SOUTH);							// Hier wird nur ein Frame erstellt-
        														// auf den sich der KeyListener beziehen kann
        // Hinzuf�gen des Listeners
        tf.addKeyListener(this);
        tf.requestFocus();
        
        f.setSize(300, 200);
        f.setVisible(true);
    }
    
    // Implementieren der Methoden des Interfaces KeyListener

    // 1 )Wen eine Taste Gedr�ckt wird
    public void keyPressed(KeyEvent e) {
    	key = e.getKeyCode();
    	
		if (key == KeyEvent.VK_LEFT) {				
	        String s = "LINKS";
	        tf.setText(s);			
		}
		if (key == KeyEvent.VK_RIGHT) {			
	        String s = "RECHTS";
	        tf.setText(s);
		}
    }
    //2)  Wen eine Taste Losgelasen wird
    public void keyReleased(KeyEvent e) {
		if (key == KeyEvent.VK_RIGHT) {			
	        String s = "RECHTS LOSGELASEN";
	        tf.setText(s);
		}
		if (key == KeyEvent.VK_LEFT) {			
	        String s = "LINKS LOSGELASEN";
	        tf.setText(s);
		}
    }
    public void keyTyped(KeyEvent e) {}  //3) um herauszufinden welche Taste gedr�ck wird

    public static void main(String args[]) {
        KeyListenerTest keyTest = new KeyListenerTest();
        keyTest.launchFrame();
    }
}