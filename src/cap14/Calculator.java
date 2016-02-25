package cap14;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPanel panelButton1;
	private JPanel panelButton2;
	private JPanel panelButton3;
	private JPanel panelButton4;
	private JButton btnZero;
	private JButton btnOne;
	private JButton btnTwo;
	private JButton btnThree;
	private JButton btnFour;
	private JButton btnFive;
	private JButton btnSix;
	private JButton btnSeven;
	private JButton btnEight;
	private JButton btnNine;
	private JButton btnBarra;
	private JButton btnMult;
	private JButton btnSubt;
	private JButton btnAdd;
	private JButton btnDot;
	private JButton btnEqual;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		super("Calculator");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 230, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(16);

		panelButton1 = new JPanel();	
		//	panelButton1.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelButton1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		contentPane.add(panelButton1);

		btnSeven = new JButton("7");
		panelButton1.add(btnSeven);

		btnEight = new JButton("8");
		panelButton1.add(btnEight);

		btnNine = new JButton("9");
		panelButton1.add(btnNine);

		btnBarra = new JButton("/");
		panelButton1.add(btnBarra);

		panelButton2 = new JPanel();	
		//	panelButton2.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelButton2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		contentPane.add(panelButton2);

		btnFour = new JButton("4");
		panelButton2.add(btnFour);

		btnFive = new JButton("5");
		panelButton2.add(btnFive);

		btnSix = new JButton("6");
		panelButton2.add(btnSix);

		btnMult = new JButton("*");
		panelButton2.add(btnMult);

		panelButton3 = new JPanel();	
		panelButton3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		contentPane.add(panelButton3);

		btnOne = new JButton("1");
		panelButton3.add(btnOne);

		btnTwo = new JButton("2");
		panelButton3.add(btnTwo);

		btnThree = new JButton("3");
		panelButton3.add(btnThree);

		btnSubt = new JButton("-");
		panelButton3.add(btnSubt);
		
		panelButton4 = new JPanel();	
		panelButton4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		contentPane.add(panelButton4);

		btnZero = new JButton("0");
		panelButton4.add(btnZero);

		btnDot = new JButton(".");
		panelButton4.add(btnDot);

		btnEqual = new JButton("=");
		panelButton4.add(btnEqual);

		btnAdd = new JButton("+");
		panelButton4.add(btnAdd);
	}

}
