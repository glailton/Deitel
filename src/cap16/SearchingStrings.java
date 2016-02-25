package cap16;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SearchingStrings {

	private JFrame frame;
	private JTextField txtTypeASentence;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchingStrings window = new SearchingStrings();
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
	public SearchingStrings() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setTitle("Searching Strings");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtTypeASentence = new JTextField();
		txtTypeASentence.setBounds(12, 42, 408, 22);
		frame.getContentPane().add(txtTypeASentence);
		txtTypeASentence.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(12, 121, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblWhichLetterWould = new JLabel("Which Letter would you like to search?");
		lblWhichLetterWould.setBounds(12, 92, 286, 16);
		frame.getContentPane().add(lblWhichLetterWould);
		
		JLabel lblTypeYourSentence = new JLabel("Type your sentence:");
		lblTypeYourSentence.setBounds(12, 13, 175, 16);
		frame.getContentPane().add(lblTypeYourSentence);
		
		final JLabel lblResult = new JLabel("");
		lblResult.setBounds(12, 213, 408, 22);
		frame.getContentPane().add(lblResult);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int count = 0;
				String sentence = txtTypeASentence.getText().toString();
				String letterToSearch = textField.getText().toString();
				//int index = sentence.indexOf(letterToSearch);
				int position = -1;
				for (int i = 0; i < sentence.length(); i++) {
					
					position = sentence.indexOf(letterToSearch, i);
					System.out.println(i);
					if(position<0)
						return;
					count++;
					position++;
				}
				
				
				System.out.println(sentence);
				lblResult.setText("The letter "+letterToSearch+" appear "+count+" times");
			}
		});
		btnSearch.setBounds(93, 163, 97, 25);
		frame.getContentPane().add(btnSearch);
		
		JButton btnClean = new JButton("Clear");
		btnClean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtTypeASentence.setText("");
				textField.setText("");
				lblResult.setText("");
			}
		});
		btnClean.setBounds(222, 163, 97, 25);
		frame.getContentPane().add(btnClean);
		
	}
}
