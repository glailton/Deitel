package cap15;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Screensaver extends JPanel{

	private boolean mouseMoved = false;
	
	private void animar(){  
        for (int i = 0; i < 10; i++){  
              
              
          
        }  
    }  

	public void paintComponent (Graphics g){
		super.paintComponent(g);
		
/*		Random randomX = new Random();
		g.setColor(Color.BLACK);
		g.drawLine(randomX.nextInt(1366), randomX.nextInt(768), 
				randomX.nextInt(1366), randomX.nextInt(768));
		try {     
            Thread.sleep(20);     
        } catch (InterruptedException ex) {     
            Thread.currentThread().interrupt();  
              
        }
		repaint();*/

	//	while(!mouseMoved){

			for (int i = 0; i < 100; i++) {
				Random randomX = new Random();

				g.setColor(new Color(randomX.nextInt(256),randomX.nextInt(256),randomX.nextInt(256)));
				g.drawLine(randomX.nextInt(1366), randomX.nextInt(768), 
						randomX.nextInt(1366), randomX.nextInt(768));	
					
			}
			repaint();
	//	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Drawing multiply arcs");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Screensaver screenSaver = new Screensaver();
		frame.add(screenSaver);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println(screenSize);
		frame.setSize(screenSize.width, screenSize.height);
		frame.setVisible(true);
		screenSaver.animar();
	}
}
