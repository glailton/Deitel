package cap16;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

public class RandonStrings {

	private JFrame frame;
	private JLabel lblSentence;
	
	private final String[] article = {"the", "a", "one", "some", "day"};
	private final String[] noum = {"boy", "Girl", "dog", "town", "car"};
	private final String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
	private final String[] preposition = {"to", "from", "over", "under", "on"};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RandonStrings window = new RandonStrings();
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
	public RandonStrings() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setTitle("Randon Strings");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnGeneratePhrase = new JButton("Generate Phrase");
		btnGeneratePhrase.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				randonSenteces();
			}
		});
		btnGeneratePhrase.setBounds(124, 80, 149, 25);
		frame.getContentPane().add(btnGeneratePhrase);
		
		lblSentence = new JLabel("");
		lblSentence.setBounds(12, 141, 408, 16);
		frame.getContentPane().add(lblSentence);
	}
	
	public void randonSenteces(){
		Random random = new Random();
		Random randomMidleArt = new Random();
		Random randomFinalNoun = new Random();
		
		
		int randomSetence = random.nextInt(5);
		int randomSetenceNoum = random.nextInt(5);
		int randomSetenceArt = random.nextInt(5);
		
		String artSentence = article[randomSetence].substring(0, 1).toUpperCase()
				+article[randomSetence].substring(1);
		String noumSentece = noum[randomSetence];
		String verbSentence = verb[randomSetence];
		String prepSentece = preposition[randomSetence];
		String artMidleSentece = article[randomSetenceArt];
		String nounFinalSentece = noum[randomSetenceNoum];
		
		lblSentence.setText(artSentence+" "+noumSentece+" "+verbSentence
				+" "+prepSentece+" "+artMidleSentece+" "+nounFinalSentece+".");
		
		
	}

}
