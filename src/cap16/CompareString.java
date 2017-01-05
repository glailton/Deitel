package cap16;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CompareString {

	private JFrame frame;
	private JTextField tfString1;
	private JTextField tfString2;
	private JLabel label;
	
	private String string1;
	private String string2;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompareString window = new CompareString();
					window.frame.setTitle("Compare Strings");
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
	public CompareString() {
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
		
		tfString1 = new JTextField();
		tfString1.setBounds(80, 36, 250, 22);
		frame.getContentPane().add(tfString1);
		tfString1.setColumns(10);
		
		tfString2 = new JTextField();
		tfString2.setBounds(80, 71, 250, 22);
		frame.getContentPane().add(tfString2);
		tfString2.setColumns(10);
		
		JLabel lblString = new JLabel("String 1:");
		lblString.setBounds(12, 39, 56, 16);
		frame.getContentPane().add(lblString);
		
		JLabel lblString2 = new JLabel("String 2:");
		lblString2.setBounds(12, 74, 56, 16);
		frame.getContentPane().add(lblString2);
		
		JLabel lblResultCompare = new JLabel("Result Compare:");
		lblResultCompare.setBounds(12, 178, 108, 16);
		frame.getContentPane().add(lblResultCompare);
		
		label = new JLabel("");
		label.setBounds(137, 178, 283, 16);
		frame.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("Compare Strings");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (returnResult() == 0){
					label.setText("The first Strings are equal the second String");
				} else if (returnResult() < 0){
					label.setText("The first Strings are less the second String");
				} else {
					label.setText("The first Strings are bigger the second String");
				}
			}
		});
		btnNewButton.setBounds(12, 124, 145, 25);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Compare Parts");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (compareMatches()){
					label.setText("The first Strings are equal the second String");
				} else {
					label.setText("The first Strings are not equal the second String");
				}
			}
		});
		btnNewButton_1.setBounds(169, 124, 161, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Clear");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cleanStrings();
			}
		});
		btnNewButton_2.setBounds(342, 35, 78, 25);
		frame.getContentPane().add(btnNewButton_2);
	}
	
	public int returnResult (){
		int result = 0;
		string1 = tfString1.getText().toString();
		string2 = tfString2.getText().toString();
		
		result = string1.compareTo(string2);
		
		return result;
	}
	
	public boolean compareMatches(){

		boolean result = false;
		string1 = tfString1.getText().toString();
		string2 = tfString2.getText().toString();
		
		int stringLenght = string1.length();
		
		result = string1.regionMatches(true, 0, string2, 0, stringLenght/2);
		
		System.out.println(string1);
		System.out.println(string2);
		System.out.println(stringLenght);
		System.out.println(stringLenght/2);
		
		return result;
	}
	
	public void cleanStrings(){
		tfString1.setText("");
		tfString2.setText("");
	}
}
