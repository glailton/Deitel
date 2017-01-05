package cap15;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;

import javax.swing.JFrame;
import javax.swing.JPanel;

/*import com.sun.javafx.geom.Arc2D;
import com.sun.javafx.geom.Ellipse2D;*/

public class GraphicsArcs2D extends JPanel{
	
	public void paintComponent (Graphics g){
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		for (int i = 0; i < 9; i++) {
			g2d.setPaint(Color.BLUE);
		//	g2d.setStroke(new BasicStroke(6.0f));
//			g2d.draw((Shape) new Ellipse2D(i+10, 35, 80, 80) );
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Drawing Arcs with Graphics2D");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GraphicsArcs2D graphicsArcs2D = new GraphicsArcs2D();
		frame.add(graphicsArcs2D);
		frame.setSize(300, 210);
		frame.setVisible(true);
	}

}
