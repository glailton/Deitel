package cap14;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

import cap14.CrapsGame.ButtonHandler;
import java.awt.GridLayout;

public class Ecofont extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnIncreaseFont;
	private JButton btnDecreaseFont;
	
	private int fontSize = 9;
	private String fontName = "Ecofont Vera Sans";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ecofont frame = new Ecofont();
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
	public Ecofont() {
		setTitle("EcoFont");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 422, 243);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(22, 8, 226, 222);
		panel.add(textField);
		textField.setColumns(10);
		textField.setFont(new Font(fontName, Font.PLAIN, fontSize));
		
		btnIncreaseFont = new JButton("Increase Font Size");
		btnIncreaseFont.setBounds(257, 160, 139, 25);
		panel.add(btnIncreaseFont);
		
		btnDecreaseFont = new JButton("Decrease Font Size");
		btnDecreaseFont.setBounds(257, 43, 143, 25);
		panel.add(btnDecreaseFont);
		
		ButtonHandler handler = new ButtonHandler();
		btnIncreaseFont.addActionListener(handler);
		btnDecreaseFont.addActionListener(handler);
	}
	
	public class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==btnIncreaseFont){
				fontSize++;
				textField.setFont(new Font(fontName, Font.PLAIN, fontSize));
			}
			if(e.getSource()==btnDecreaseFont){
				fontSize--;
				textField.setFont(new Font(fontName, Font.PLAIN, fontSize));
			}
		}
		
	}

}
