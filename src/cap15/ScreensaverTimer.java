package cap15;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class ScreensaverTimer extends JPanel implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Timer timer;
	
	public ScreensaverTimer() {
		super();
		timer = new Timer(1000, this);
		timer.start();
	}

	public void paintComponent (Graphics g){
		super.paintComponent(g);

			for (int i = 0; i < 100; i++) {
				Random randomX = new Random();

				g.setColor(new Color(randomX.nextInt(256),randomX.nextInt(256),randomX.nextInt(256)));
				g.drawLine(randomX.nextInt(1366), randomX.nextInt(768), 
						randomX.nextInt(1366), randomX.nextInt(768));		
			}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Drawing multiply arcs");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ScreensaverTimer screenSaver = new ScreensaverTimer();
		frame.add(screenSaver);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println(screenSize);
		frame.setSize(screenSize.width, screenSize.height);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}
}
