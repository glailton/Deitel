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
import javax.swing.JTextField;
import javax.swing.Timer;

public class ScreensaverRandom extends JPanel implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Timer timer;
	private JTextField textField;
	private int numberLines;
	
	public ScreensaverRandom() {
		super();
		timer = new Timer(1000, this);
		timer.start();
		textField = new JTextField(10);
		add(textField);
		
		textField.addActionListener(this);
	}

	public void paintComponent (Graphics g){
		super.paintComponent(g);

			for (int i = 0; i < numberLines; i++) {
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

		ScreensaverRandom screenSaver = new ScreensaverRandom();
		frame.add(screenSaver);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println(screenSize);
		frame.setSize(screenSize.width, screenSize.height);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==textField){
			numberLines = Integer.parseInt(textField.getText());
			textField.setText("");
		}
		repaint();
	}
}
