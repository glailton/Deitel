package cap24;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EraseImage extends JApplet {
	public EraseImage() {
	}

	/**
	 * Create the applet.
	 */
	
	private JPanel panel;
	private JLabel imageIcon;
	
	private String sname;
	protected ImageIcon image;
	
	public void init() {
		getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(10, 11, 440, 197);
		getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnLoadImage = new JButton("Load Image");
		panel.add(btnLoadImage);
		
		btnLoadImage.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFileChooser fc = new JFileChooser();
		        int result = fc.showOpenDialog(null);
		        if (result == JFileChooser.APPROVE_OPTION) {
		            File file = fc.getSelectedFile();
		            sname = file.getAbsolutePath(); //THIS WAS THE PROBLEM
		            image = new ImageIcon(sname);
		            imageIcon = new JLabel("", image, JLabel.CENTER);
		            panel.add(imageIcon, BorderLayout.CENTER);
		            panel.revalidate(); //ADD THIS AS WELL
		            panel.repaint();  //ADD THIS AS WELL
		        }
			}
		});
		
		JButton btnEraseImage = new JButton("Erase Image");
		panel.add(btnEraseImage);
		
		btnEraseImage.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				/*Image image = null;
				try {
					image = ImageIO.read(new File(sname));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				BufferedImage bufferedImage = convertToBufferedImage(image);
				bufferedImage.setRGB(10, 10, Color.BLACK.getRGB());
				ImageIcon imageIconBuffered = new ImageIcon(bufferedImage);
				imageIcon.setIcon(imageIconBuffered);*/
				imageIcon.setIcon(null);
			}
		});

	}
	
	public static BufferedImage convertToBufferedImage(Image image)
	{
	    BufferedImage newImage = new BufferedImage(
	        image.getWidth(null), image.getHeight(null),
	        BufferedImage.TYPE_INT_ARGB);
	    Graphics2D g = newImage.createGraphics();
	    g.drawImage(image, 0, 0, null);
	    g.dispose();
	    return newImage;
	}
}
