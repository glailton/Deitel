package cap14;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Printer extends JFrame{
	
	private JLabel printerLabel;
	private JLabel qualityLabel;
	private JTextField printerText1;
	private JTextField printerText2;
	private JTextField printerText3;
	private JCheckBox cbImage;
	private JCheckBox cbText;
	private JCheckBox cbCode;
	private JRadioButton rbSelection;
	private JRadioButton rbAll;
	private JRadioButton rbApplet;
	private ButtonGroup buttonGroup;

	public Printer() {
		// TODO Auto-generated constructor stub
		super("Printer");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,350,250);
	//	setVisible(true);
		
		printerLabel = new JLabel("Printer: My Printer");
		printerText1 = new JTextField();
		printerText2 = new JTextField();
		printerText3 = new JTextField();
		cbImage = new JCheckBox("Image");
		cbText = new JCheckBox("Text");
		cbCode = new JCheckBox("Code");
		rbSelection = new JRadioButton("Selection");
		rbAll = new JRadioButton("All");
		rbApplet = new JRadioButton("Applet");
		buttonGroup = new ButtonGroup();
		
		Panel contentPanel = new Panel();
		setContentPane(contentPanel);
		contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel1 = new JPanel(new GridLayout(0, 1));
		contentPanel.add(panel1);
	
		panel1.add(printerLabel);
			
		JPanel panel2 = new JPanel(new GridLayout(0, 2));
		printerText1.setBounds(10, 10, 20, 10);
		panel1.add(panel2);
		panel2.add(printerText1);
		panel2.add(cbImage);
		panel2.add(cbText);
		panel2.add(cbCode);
		
		JPanel panel3 = new JPanel(new GridLayout(0, 2));
		contentPanel.add(panel3);
		panel3.add(printerText2);
		panel3.add(rbSelection);
		panel3.add(rbAll);
		panel3.add(rbApplet);
		buttonGroup.add(rbSelection);
		buttonGroup.add(rbAll);
		buttonGroup.add(rbApplet);
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Printer frame = new Printer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
