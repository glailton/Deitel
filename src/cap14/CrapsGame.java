package cap14;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class CrapsGame extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldDie1;
	private JTextField textFieldDie2;
	private JTextField textFieldSum;
	private JTextField textFieldPoints;
	private JLabel lblDie1;
	private JLabel lblDie2;
	private JLabel lblSum;
	private JLabel lblPoints;
	private JLabel lblStatus;

	private enum Status { CONTINUE, WON, LOST };

	private Status gameStatus;

	private final static int SNAKE_EYES = 2;
	private final static int TREY = 3;
	private final static int SEVEN = 7;
	private final static int YO_LEVEN = 11;
	private final static int BOX_CARS = 12;

	private int myPoint = 0;
	private int sumDices = 0;
	private int die1;
	private int die2;

	private boolean firstRoll = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrapsGame frame = new CrapsGame();
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
	public CrapsGame() {
		setResizable(false);
		setTitle("Craps Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		firstRoll = true;

		JButton btnRollDices = new JButton("Roll Dices");
		btnRollDices.setBounds(245, 198, 97, 25);
		contentPane.add(btnRollDices);

		textFieldDie1 = new JTextField();
		//	textFieldDie1.setEnabled(false);
		textFieldDie1.setEditable(false);
		textFieldDie1.setBounds(12, 34, 61, 22);
		contentPane.add(textFieldDie1);
		textFieldDie1.setColumns(5);

		textFieldDie2 = new JTextField();
		//	textFieldDie2.setEnabled(false);
		textFieldDie2.setEditable(false);
		textFieldDie2.setBounds(12, 89, 61, 22);
		contentPane.add(textFieldDie2);
		textFieldDie2.setColumns(5);

		textFieldSum = new JTextField();
		//	textFieldSum.setEnabled(false);
		textFieldSum.setEditable(false);
		textFieldSum.setBounds(12, 142, 61, 22);
		contentPane.add(textFieldSum);
		textFieldSum.setColumns(5);

		textFieldPoints = new JTextField();
		//	textFieldPoints.setEnabled(false);
		textFieldPoints.setEditable(false);
		textFieldPoints.setBounds(12, 199, 61, 22);
		contentPane.add(textFieldPoints);
		textFieldPoints.setColumns(5);

		lblDie1 = new JLabel("Dado 1");
		lblDie1.setBounds(97, 40, 40, 16);
		contentPane.add(lblDie1);

		lblDie2 = new JLabel("Dado 2");
		lblDie2.setBounds(97, 95, 40, 16);
		contentPane.add(lblDie2);

		lblSum = new JLabel("Soma");
		lblSum.setBounds(97, 148, 33, 16);
		contentPane.add(lblSum);

		lblPoints = new JLabel("Pontua\u00E7\u00E3o\r\n");
		lblPoints.setBounds(97, 199, 79, 16);
		contentPane.add(lblPoints);

		lblStatus = new JLabel("");
		lblStatus.setBounds(245, 40, 97, 16);
		contentPane.add(lblStatus);

		ButtonHandler handler = new ButtonHandler();
		btnRollDices.addActionListener(handler);
	}

	public void play() throws InterruptedException{
		if(firstRoll){
			sumDices = rollDices();
			myPoint = sumDices;
			setTextField();

			switch (sumDices) {
			case SEVEN:
			case YO_LEVEN:
				gameStatus = Status.WON;
				break;

			case SNAKE_EYES:
			case TREY:
			case BOX_CARS:
				gameStatus = Status.LOST;
				break;

			default:
				gameStatus = Status.CONTINUE;
				
				lblStatus.setText("Playing Again!");
				firstRoll = false;
				break;
			}
		} else{
			
			
			sumDices = rollDices();
			setTextField();

			if (sumDices==myPoint) {
				gameStatus = Status.WON;
				lblStatus.setText("");
				
			}else{
				if(sumDices==SEVEN){
					gameStatus = Status.LOST;
					lblStatus.setText("");
					
				}
			}
		}

		

		if(gameStatus == Status.WON){
			JOptionPane.showMessageDialog(null, "Congratulations! You Win!");
			firstRoll = true;
			eraseTextField();
		} else if (gameStatus == Status.LOST){
			JOptionPane.showMessageDialog(null, "Sorry! You Lose!");
			firstRoll = true;
			eraseTextField();
		}


	}

	public void setTextField(){
		textFieldDie1.setText(String.valueOf(die1));
		textFieldDie2.setText(String.valueOf(die2));
		textFieldSum.setText(String.valueOf(sumDices));
		textFieldPoints.setText(String.valueOf(myPoint));
	}
	
	public void eraseTextField(){
		textFieldDie1.setText(String.valueOf(""));
		textFieldDie2.setText(String.valueOf(""));
		textFieldSum.setText(String.valueOf(""));
		textFieldPoints.setText(String.valueOf(""));
	}

	public int rollDices(){
		Random random = new Random();

		die1 = 1+random.nextInt(6);

		die2 = 1+random.nextInt(6);


		int sum = die1+die2;


		return sum;

	}

	public class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			try {
				play();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		}

	}
}
