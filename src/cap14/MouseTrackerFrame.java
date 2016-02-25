package cap14;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

import org.w3c.dom.events.MouseEvent;

public class MouseTrackerFrame extends JFrame{
	
	private JPanel mousePanel;
	private JLabel statusBar;

	public MouseTrackerFrame() {
		// TODO Auto-generated constructor stub
		super("Mouse Events");
		
		mousePanel = new JPanel();
		mousePanel.setBackground(Color.WHITE);
		add(mousePanel, BorderLayout.CENTER);
		
		statusBar = new JLabel("Mouse Outside Panel");
		add(statusBar, BorderLayout.SOUTH);
		
		MouseHandler handler = new MouseHandler();
		mousePanel.addMouseListener(handler);
		mousePanel.addMouseMotionListener(handler);
	}
	
	private class MouseHandler implements MouseInputListener, MouseMotionListener{

		@Override
		public void mouseClicked(java.awt.event.MouseEvent e) {
			// TODO Auto-generated method stub
			statusBar.setText(String.format("Clicked at [%d, %d]", e.getX(), e.getY()));
			mousePanel.setBackground(Color.PINK);
		}

		@Override
		public void mouseEntered(java.awt.event.MouseEvent e) {
			// TODO Auto-generated method stub
			statusBar.setText(String.format("Mouse Enterred at [%d, %d]", e.getX(), e.getY()));
			mousePanel.setBackground(Color.GREEN);
		}

		@Override
		public void mouseExited(java.awt.event.MouseEvent e) {
			// TODO Auto-generated method stub
			statusBar.setText("Mouse outside Panel");
			mousePanel.setBackground(Color.WHITE);
		}

		@Override
		public void mousePressed(java.awt.event.MouseEvent e) {
			// TODO Auto-generated method stub
			
			statusBar.setText(String.format("Pressed at [%d, %d]", e.getX(), e.getY()));
		}

		@Override
		public void mouseReleased(java.awt.event.MouseEvent e) {
			// TODO Auto-generated method stub
			statusBar.setText(String.format("Releaded at [%d, %d]", e.getX(), e.getY()));
		}

		@Override
		public void mouseDragged(java.awt.event.MouseEvent e) {
			// TODO Auto-generated method stub
			statusBar.setText(String.format("Dragged at [%d, %d]", e.getX(), e.getY()));
		}

		@Override
		public void mouseMoved(java.awt.event.MouseEvent e) {
			// TODO Auto-generated method stub
			statusBar.setText(String.format("Moved at [%d, %d]", e.getX(), e.getY()));
		}
		
	}

}
