package cap15;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsArcs extends JPanel{
	
	public void paintComponent (Graphics g){
		super.paintComponent(g);
		
		for (int i = 0; i < 9; i++) {
			g.setColor(Color.RED);
		//	g.drawRect(15, 35, 80, 80);
		//	g.setColor(Color.BLACK);
			g.drawArc(i+10, 35, 80, 80, 0, 270);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Drawing multiply arcs");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GraphicsArcs graphicsArcs = new GraphicsArcs();
		frame.add(graphicsArcs);
		frame.setSize(300, 210);
		frame.setVisible(true);
	}

}
