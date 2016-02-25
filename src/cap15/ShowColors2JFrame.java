package cap15;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ShowColors2JFrame extends JFrame {
	private JButton changeColorButton;
	private Color color = Color.LIGHT_GRAY;
	private JPanel colorJPanel;
	
	public ShowColors2JFrame() {
		super("Using JColorChooser");
		
		colorJPanel = new JPanel();
		colorJPanel.setBackground(color);
		
		changeColorButton = new JButton("Change Color");
		changeColorButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				color = JColorChooser.showDialog(ShowColors2JFrame.this, "Choose a color", color);
				
				if (color == null) {
					color = Color.LIGHT_GRAY;
				}
				
				colorJPanel.setBackground(color);
			}
		});
		
		add(colorJPanel, BorderLayout.CENTER);
		add(changeColorButton, BorderLayout.SOUTH);
		
		setSize(400,130);
		setVisible(true);
	}
	
	public static void main (String[] args){
		ShowColors2JFrame application = new ShowColors2JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
