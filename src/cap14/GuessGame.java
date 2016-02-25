package cap14;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class GuessGame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String string1 = "I have a number between 1 - 1000. Can you guess my number?";
	private final String string2 = "Please Enter your first guess.";
	private JPanel contentPane;
	private JLabel explanationGame1;
	private JLabel explanationGame2;
	private JTextField textField;
	private JButton btnPlay;
	private JButton btnRestart;
	private JLabel lblTooLow;
	private JLabel lblTooHigh;
	private JLabel lblCorrect;
	private JLabel lblTips;
	
	private int randonNumber;
	private int userNumber;
	private String userNumberString;
	private String lastUserNumberFinal = "1000";
	private String lastUserNumberBegin = "0";
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuessGame frame = new GuessGame();
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
	public GuessGame() {
		super("Guess Game");
		setResizable(false);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPanel panelLabel1 = new JPanel();
		panelLabel1.setBounds(28, 10, 375, 26);
		panelLabel1.setLayout(new FlowLayout(FlowLayout.CENTER));
		JPanel panelLabel2 = new JPanel();
		panelLabel2.setBounds(112, 41, 177, 26);
		panelLabel2.setLayout(new FlowLayout(FlowLayout.CENTER));
		JPanel panelTextFiled = new JPanel();
		panelTextFiled.setBounds(134, 80, 149, 32);
		panelTextFiled.setLayout(new FlowLayout(FlowLayout.CENTER));
		JPanel panelAnswer = new JPanel();
		panelAnswer.setBounds(28, 156, 375, 38);
		contentPane.setLayout(null);
		contentPane.add(panelLabel1);
		contentPane.add(panelLabel2);
		contentPane.add(panelTextFiled);
		contentPane.add(panelAnswer);

		textField = new JTextField();
		textField.setToolTipText("");
		textField.setEditable(false);
		panelTextFiled.add(textField);
		textField.setColumns(10);

		explanationGame1 = new JLabel(string1);
		panelLabel1.add(explanationGame1);

		explanationGame2 = new JLabel(string2);
		panelLabel2.add(explanationGame2);
		panelAnswer.setLayout(null);


		lblTooHigh = new JLabel("Too High");
		lblTooHigh.setBounds(45, 5, 51, 16);
		panelAnswer.add(lblTooHigh);

		lblTooLow = new JLabel("Too Low");
		lblTooLow.setBounds(277, 5, 49, 16);
		panelAnswer.add(lblTooLow);

		lblCorrect = new JLabel("Correct!");
		lblCorrect.setBounds(158, 5, 56, 16);
		panelAnswer.add(lblCorrect);

		JPanel panelButton = new JPanel();
		panelButton.setBounds(28, 207, 375, 45);
		contentPane.add(panelButton);

		btnPlay = new JButton("Play");
		panelButton.add(btnPlay);

		btnRestart = new JButton("Restart");
		btnRestart.setEnabled(false);
		panelButton.add(btnRestart);
		
		lblTips = new JLabel(lastUserNumberBegin+"-"+lastUserNumberFinal);
		lblTips.setBounds(182, 125, 56, 16);
		contentPane.add(lblTips);

		ButtonHandler handler = new ButtonHandler();
		btnPlay.addActionListener(handler);
		btnRestart.addActionListener(handler);

		TextHandler textHandler = new TextHandler();
		textField.addActionListener(textHandler);
	}

	public int randomNumber(){
		Random random = new Random();
		int number = random.nextInt(1000)+1;
		return number;
	}
	
	public void restartGame(){
		randonNumber = 0;
		lastUserNumberBegin = "0";
		lastUserNumberFinal = "1000";
		lblTips.setText(lastUserNumberBegin+"-"+lastUserNumberFinal);
		textField.setEditable(false);
		textField.setEnabled(false);
		textField.setText("");
		btnPlay.setEnabled(true);
		btnRestart.setEnabled(false);
		textField.requestFocus();
		lblCorrect.setForeground(Color.BLACK);
		lblTooLow.setForeground(Color.BLACK);
		lblTooHigh.setForeground(Color.BLACK);
	}
	
	public void validateNumber(int realNumber, int userNumber){
		if(userNumber == realNumber){
			lblCorrect.setForeground(Color.GREEN);
			lblTooLow.setForeground(Color.BLACK);
			lblTooHigh.setForeground(Color.BLACK);
			textField.setEditable(false);
			textField.setEnabled(false);
			JOptionPane.showMessageDialog(null, "You Win! Click in Restart to Play again!", 
					"Congratulations", JOptionPane.INFORMATION_MESSAGE);
			
		}else{
			if(userNumber<realNumber){
				lastUserNumberBegin = userNumberString;
				lblTips.setText(lastUserNumberBegin+"-"+lastUserNumberFinal);
				if(realNumber-userNumber>50){
					lblTooLow.setForeground(Color.BLUE);
					lblTooHigh.setForeground(Color.BLACK);
					textField.setText("");
				}else{
					lblTooHigh.setForeground(Color.RED);
					lblTooLow.setForeground(Color.BLACK);
					textField.setText("");
				}
			}
			if(userNumber>realNumber){
				lastUserNumberFinal = userNumberString;
				lblTips.setText(lastUserNumberBegin+"-"+lastUserNumberFinal);
				if(userNumber-realNumber<=50){
					lblTooHigh.setForeground(Color.RED);
					lblTooLow.setForeground(Color.BLACK);
					textField.setText("");
				}else{
					lblTooLow.setForeground(Color.BLUE);
					lblTooHigh.setForeground(Color.BLACK);
					textField.setText("");
				}
			}
		}
	}
	 

	public class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()==btnPlay){
				randonNumber = randomNumber();
				btnPlay.setEnabled(false);
				btnRestart.setEnabled(true);
				textField.setEditable(true);
				textField.setEnabled(true);
				textField.requestFocus();
			}
			
			if(e.getSource()==btnRestart){
				restartGame();
			}
		}

	}
	
	public class TextHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==textField){
				userNumberString = e.getActionCommand();
				userNumber = Integer.parseInt(userNumberString);
				validateNumber(randonNumber, userNumber);
			}
		}

	}
}



