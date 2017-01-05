package cap24;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class FlasherText extends JApplet {

	private Timer t;
	private JTextField textField;
	private JLabel lblSetTimer;
	private JLabel lblText;
	private boolean isStarted;
	private JSlider slider;
	private String sname;
	private JPanel panel;
	private JLabel lblImage;
	private JRadioButton rdbtnImagem;
	private JRadioButton rdbtnText;
	private ButtonGroup group;
	
	private JButton btnImage;
	
	private ImageIcon image;

	public FlasherText() {
		getContentPane().setLayout(null);

		panel = new JPanel();
		panel.setBounds(0, 0, 450, 300);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		rdbtnImagem = new JRadioButton("Image", false);
		rdbtnImagem.setBounds(10, 252, 85, 23);
		rdbtnImagem.setActionCommand("Image");
		panel.add(rdbtnImagem);
		
		rdbtnText = new JRadioButton("Text", true);
		rdbtnText.setBounds(97, 252, 55, 23);
		rdbtnText.setActionCommand("Text");
		panel.add(rdbtnText);
		
		group = new ButtonGroup();
		group.add(rdbtnImagem);
		group.add(rdbtnText);

		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t !=null)
					t.start();
			}
		});
		btnStart.setBounds(257, 252, 89, 23);
		panel.add(btnStart);

		JButton btnStop = new JButton("Stop");
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t !=null)
					t.stop();
			}
		});
		btnStop.setBounds(351, 252, 89, 23);
		panel.add(btnStop);

		lblSetTimer = new JLabel("Set Timer:");
		lblSetTimer.setBounds(10, 22, 103, 14);
		panel.add(lblSetTimer);

		textField = new JTextField("Glailton");
		textField.setBounds(10, 133, 200, 20);
		panel.add(textField);
		textField.setColumns(10);

		lblText = new JLabel(textField.getText());
		lblText.setHorizontalAlignment(SwingConstants.CENTER);
		lblText.setBounds(10, 198, 250, 43);
		panel.add(lblText);

		JButton btnSetText = new JButton("Set Text");
		btnSetText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblText.setText(textField.getText());
			}
		});
		btnSetText.setBounds(10, 164, 89, 23);
		panel.add(btnSetText);

		slider = new JSlider(0, 100, 0);
		slider.setBounds(10, 47, 275, 54);
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(1);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				
				System.out.println(slider.getValue());
				t = new Timer(slider.getValue()*10, new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(group.getSelection().getActionCommand().equals("Text")){
							btnImage.setEnabled(false);
							if (isStarted) {
								lblText.setText(textField.getText());
								isStarted = false;
							} else {
								lblText.setText("");
								ImageIcon icon = new ImageIcon("images/background.png");
								lblText.setIcon(icon);
								isStarted = true;
							}
						}else{
							btnImage.setEnabled(true);
							if (isStarted) {
								lblImage.setIcon(image);
								isStarted = false;
							} else {
								//lblImage.setIcon(null);
								ImageIcon icon = new ImageIcon("images/background_image.png");
								lblImage.setIcon(icon);
								isStarted = true;
							}
						}
						
					}
				});
				
			}
		});
		panel.add(slider);

		JLabel lblSetText = new JLabel("Set Text:");
		lblSetText.setBounds(10, 108, 103, 14);
		panel.add(lblSetText);
		
		
		
		btnImage = new JButton("Image");
		btnImage.addActionListener(new ActionListener() {

			

			public void actionPerformed(ActionEvent arg0) {
				if(t!=null)
					t.stop();
				
				JFileChooser fc = new JFileChooser();
		        int result = fc.showOpenDialog(null);
		        if (result == JFileChooser.APPROVE_OPTION) {
		            File file = fc.getSelectedFile();
		            sname = file.getAbsolutePath(); 
		            image = new ImageIcon(sname);
		    		
		 
		    		lblImage = new JLabel("", image, JLabel.RIGHT);
		    		lblImage.setBounds(319, 80, 121, 195);
		            panel.add(lblImage);
		            panel.revalidate(); 
		            panel.repaint(); 
		        }
				
			}
		});
		btnImage.setBounds(319, 18, 89, 23);
		panel.add(btnImage);
		
		

	}

	public void init() {
		isStarted = true;
		lblText.setText(textField.getText());	
	}
}
