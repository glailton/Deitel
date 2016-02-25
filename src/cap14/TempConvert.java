package cap14;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class TempConvert extends JFrame {

	private JPanel contentPane;
	private JTextField tempFahrenheit;
	private JTextField tempKelvin;
	private JLabel labelResult;
	private JLabel labelResult2;
	private JButton btConvert;
	private JButton btConvert2;
	private String temp;
	private int tempFahr;
	private int tempCelsius;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TempConvert frame = new TempConvert();
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
	public TempConvert() {
		super("Temperature Convert");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		contentPane.setBorder(BorderFactory.createTitledBorder("Converter Temperaturas"));
		setContentPane(contentPane);
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(BorderFactory.createTitledBorder("Celsius"));
		contentPane.add(panel1);
		
		JPanel panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createTitledBorder("Kelvin"));
		contentPane.add(panel2);

		tempFahrenheit = new JTextField();
		tempFahrenheit.setColumns(10);

		btConvert = new JButton("Convert");
		btConvert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				temp = tempFahrenheit.getText();
				tempFahr = Integer.parseInt(temp);
				
				float result = convertFahrenheittoCelsius(tempFahr);
			//	JOptionPane.showMessageDialog(null, ""+result);
				labelResult.setText(String.valueOf(result));
			}
		});

		labelResult = new JLabel("");

		panel1.add(tempFahrenheit);
		panel1.add(btConvert);
		panel1.add(labelResult);
		
		tempKelvin = new JTextField();
		tempKelvin.setColumns(10);

		btConvert2 = new JButton("Convert");
		btConvert2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				temp = tempKelvin.getText();
				tempCelsius = Integer.parseInt(temp);
				
				double result = convertCelsiustoKelvin(tempCelsius);
			//	JOptionPane.showMessageDialog(null, ""+result);
				labelResult2.setText(String.valueOf(result));
			}

			
		});
		
		labelResult2 = new JLabel("");

		panel2.add(tempKelvin);
		panel2.add(btConvert2);
		panel2.add(labelResult2);

	}
	
	public float convertFahrenheittoCelsius(int tempFahr) {
		float tempCelsius = 5*(tempFahr-32)/9;
	//	double tempCelsius = 5/9;
		return tempCelsius;
		
	}
	
	private double convertCelsiustoKelvin(int tempCelsius) {
		// TODO Auto-generated method stub
		double tempKelvin = tempCelsius +273.15;
		return tempKelvin;
	}
	
/*	private	class Handler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == tempFahrenheit)
					temp = tempFahrenheit.getText();
			tempFahr = Integer.parseInt(temp);
			//	temp = e.getActionCommand();
		//	JOptionPane.showMessageDialog(null, temp);
		}

	}*/
}

