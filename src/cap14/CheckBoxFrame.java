package cap14;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CheckBoxFrame extends JFrame{
	
	private JCheckBox boldCheckBox;
	private JCheckBox italicCheckBox;
	private JTextField textField;
	
	public CheckBoxFrame() {
		// TODO Auto-generated constructor stub
		super("JCheckBox Frame");
		
		setLayout(new FlowLayout());
		
		textField = new JTextField("Change text style", 20);
		textField.setFont(new Font("Serif", Font.PLAIN, 14));
		add(textField);
		
		boldCheckBox = new JCheckBox("Bold");
		italicCheckBox = new JCheckBox("Italic");
		add(boldCheckBox);
		add(italicCheckBox);
		
		CheckBoxHandler handler = new CheckBoxHandler();
		boldCheckBox.addItemListener(handler);
		italicCheckBox.addItemListener(handler);
				
		
	}
	
	private class CheckBoxHandler implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent event) {
			// TODO Auto-generated method stub
			Font font = null;
			
			if (boldCheckBox.isSelected() && italicCheckBox.isSelected()){
				font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
			} else if (boldCheckBox.isSelected()){
				font = new Font("Serif", Font.BOLD, 14);
			} else if (italicCheckBox.isSelected()){
				font = new Font("Serif", Font.ITALIC, 14);
			} else
				font = new Font("Serif", Font.PLAIN, 14);
			
			textField.setFont(font);
		}
		
	}

}
