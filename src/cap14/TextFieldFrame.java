package cap14;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFieldFrame extends JFrame{

	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JPasswordField passwordField;


	public TextFieldFrame() {
		super("Testing");
		setLayout(new FlowLayout());

		textField1 = new JTextField(10);
		add(textField1);

		textField2 = new JTextField("Enter text here");
		add(textField2);

		textField3 = new JTextField("Uneditable text field",21);
		textField3.setEditable(false);
		add(textField3);

		passwordField = new JPasswordField("Hidden Text");
		add(passwordField);

		TextFieldHandler handler = new TextFieldHandler();
		textField1.addActionListener(handler);
		textField2.addActionListener(handler);
		textField3.addActionListener(handler);
		passwordField.addActionListener(handler);
		add(textField1);
	}


	private class TextFieldHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String string = "";

			if(e.getSource() == textField1){
				string = string.format("textField1: %s", e.getActionCommand());
			}else if(e.getSource() == textField2){
				string = string.format("textField2: %s", e.getActionCommand());
			}else if(e.getSource() == textField3){
				string = string.format("textField3: %s", e.getActionCommand());
			}else if(e.getSource() == passwordField){
				string = string.format("passwordField: %s", e.getActionCommand());
			}
			
			JOptionPane.showMessageDialog(null, string);
		}

	}
}