package cap14;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Painter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame application = new JFrame("Painting");
		
		PaintPanel paintPanel = new PaintPanel();
		application.add(paintPanel, BorderLayout.CENTER);
		
		application.add( new JLabel("Drag the mouse to Draw"), 
				BorderLayout.SOUTH);
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setSize(400, 200);
		application.setVisible(true);
	}

}
