package cap14;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;

public class ColorSelect extends JFrame{
	
	private JList colorJList;
	private JComboBox comboBox;
	private JCheckBox cbBackground;
	private JCheckBox cbForeground;
	private JButton btOk;
	private JButton btCancel;
	
	private static final String[] colorNames = {"Black", "Blue", "Cyan", "Dark Cyan", 
		"Gray", "Green", "Light Grey", "Magenta", "Orange", "Pink", "Red", "White", "Yellow"};
	private static final Color[] colors = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY,
		Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, 
		Color.RED, Color.WHITE, Color.YELLOW};

	public ColorSelect() {
		// TODO Auto-generated constructor stub
		super("Color Select");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,320,180);
		
		Panel contentPanel = new Panel();
		setContentPane(contentPanel);
		contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
	/*	colorJList = new JList<>(colorNames);
		colorJList.setVisibleRowCount(5);
		
		colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);*/
		
		comboBox = new JComboBox(colorNames);
		comboBox.setMaximumRowCount(3);
		comboBox.setPreferredSize(new Dimension(250,20));
		
		contentPanel.add(comboBox);
		
		Panel cbPanel = new Panel();
		cbPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		contentPanel.add(cbPanel);
		
		cbBackground = new JCheckBox("Background");
		cbPanel.add(cbBackground);
		cbForeground = new JCheckBox("Foreground");
		cbPanel.add(cbForeground);
		
		Panel btPanel = new Panel();
		btPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		contentPanel.add(btPanel);
		
		btOk = new JButton("OK");
		btPanel.add(btOk);
		btCancel = new JButton("Cancel");
		btPanel.add(btCancel);
		
		

	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ColorSelect frame = new ColorSelect();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
