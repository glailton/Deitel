package cap24;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.jnlp.*;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LoadImageandScale extends JApplet{
	private ImageIcon imageIcon;
	private JPanel scalePanel;
	private JLabel percentLabel;
	private TextField scaleInputTextField;
	private JButton scaleChangeButton;
	private double scaleValue = 1.0;
	
	public void init(){
		scalePanel = new JPanel();
		percentLabel = new JLabel("Scale Percent");
		scaleInputTextField = new TextField("100");
		scaleChangeButton = new JButton("Set Scale");
		
		scalePanel.add(percentLabel);
		scalePanel.add(scaleInputTextField);
		scalePanel.add(scaleChangeButton);
		add(scalePanel, BorderLayout.NORTH);
		
		scaleChangeButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				scaleValue = Double.parseDouble(scaleInputTextField.getText())/100;
				repaint();
			}
		});
		
		try {
			FileOpenService fileOpenService = (FileOpenService) ServiceManager.lookup("javax.jnlp.FileOpenService");
			FileContents contents = fileOpenService.openFileDialog(null, null);
			
			byte[] imageData = new byte[(int) contents.getLength()];
			contents.getInputStream().read(imageData);
			imageIcon = new ImageIcon(imageData);
			
			add(new DrawJPanel(), BorderLayout.CENTER);
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	
	private class DrawJPanel extends JPanel{
		
		public void paintComponent (Graphics g){
			super.paintComponent(g);
			
			double spareWidth = getWidth() - scaleValue*imageIcon.getIconWidth();
			double spareHeight = getHeight() - scaleValue*imageIcon.getIconHeight();
			
			g.drawImage(imageIcon.getImage(), 
					(int) (spareWidth)/2, (int) (spareHeight)/2, 
					(int) (imageIcon.getIconWidth()*scaleValue),
					(int) (imageIcon.getIconHeight()*scaleValue), this);
		}
	}
}
