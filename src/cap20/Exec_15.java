package cap20;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.event.ActionEvent;

public class Exec_15 {

	private JFrame frame;
	JComboBox comboBox;
	private DrawCanvas canvas;
	private static final String[] colors = {"black", "blue", "cyan", "darkGray", "gray",
			"green", "lightGray", "magenta", "orange", "pink", "red", "white", "yellow"};
	Shape circle = new Ellipse2D.Float(100, 100, 100, 100);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exec_15 window = new Exec_15();
					//window.paint(null);

					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Exec_15() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 61);
		frame.getContentPane().add(panel);
		panel.setLayout(null);


		comboBox = new JComboBox(colors);
		comboBox.setBounds(10, 11, 82, 20);
		panel.add(comboBox);

		JButton btnDrawCircle = new JButton("Draw Circle");
		btnDrawCircle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String colorName = comboBox.getSelectedItem().toString();
				HashColor color = new HashColor();
				Color c = color.returnColor(colorName);
				canvas = new DrawCanvas(c);

				JFrame application = new JFrame(); // creates a new JFrame

				application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
				application.add( canvas ); // add the panel to the frame
				application.setSize( 300, 300 ); // set the desired size
				application.setVisible( true );
			}
		});
		btnDrawCircle.setBounds(199, 10, 128, 23);
		panel.add(btnDrawCircle);
	}

	private class DrawCanvas extends JPanel {
		
		private Color color;
		
		public DrawCanvas(Color color) {
			this.color = color;
		}
		
		// Override paintComponent to perform your own painting
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);     // paint parent's background
			//setBackground(Color.BLACK);  // set background color for this JPanel

			// Your custom painting codes. For example,
			// Drawing primitive shapes
			g.setColor(color);       // change the drawing color
			g.fillOval(150, 150, 30, 50);
		}
	}
}
