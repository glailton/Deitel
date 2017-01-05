package cap14;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PaintPanel extends JPanel{
	
	private int pointCount = 0; //numero de contagem de pontos

	//array com 10000 referencias de Pontos
	private Point[] points = new Point[10000];
	
	private JLabel statusBar;
	private String details;
	
	public PaintPanel() {
		// TODO Auto-generated constructor stub
		
		addMouseMotionListener( new MouseMotionAdapter() {
			public void mouseDragged(java.awt.event.MouseEvent event){
				if(pointCount < points.length){
					points[pointCount] = event.getPoint();
					++pointCount;
					repaint();
					details = "Count Points" + pointCount;
				}
				
				details = "Count Points" + pointCount;
			}
		});
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for (int i = 0; i < pointCount; i++) {
			g.fillOval(points[i].x, points[i].y, 4, 4);
			
		}
	}

	public int getPointCount() {
		return pointCount;
	}

	public void setPointCount(int pointCount) {
		this.pointCount = pointCount;
	}
	
}
