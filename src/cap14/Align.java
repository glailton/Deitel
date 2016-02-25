package cap14;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Align extends JPanel{

	private JCheckBox snapGrid;
	private JCheckBox showGrid;
	private JLabel textLabelX;
	private JLabel textLabelY;
	private JTextField textFiledX;
	private JTextField textFiledY;
	private JButton buttonOK;
	private JButton buttonCancel;
	private JButton buttonHelp;
		
	public Align() {
		super(new BorderLayout());
		//setLayout(new BorderLayout());
		
		snapGrid = new JCheckBox("Snap to Grid");
		showGrid = new JCheckBox("Show Grid");
		textLabelX = new JLabel("X:");
		textLabelY = new JLabel("Y:");
		textFiledX = new JTextField();
		textFiledY = new JTextField();
		buttonOK = new JButton("OK");
		buttonCancel = new JButton("Cancel");
		buttonHelp = new JButton("Help");
		
		JPanel panelCheckBox = new JPanel(new GridLayout(0, 1));
		panelCheckBox.add(snapGrid);
		panelCheckBox.add(showGrid);
		
		add(panelCheckBox, BorderLayout.LINE_START);
		
		JPanel panelText = new JPanel(new GridLayout(0, 1));
		panelText.add(textLabelX);
		panelText.add(textLabelY);
		
		add(panelText, BorderLayout.CENTER);
		
		JPanel panelTextField = new JPanel(new GridLayout(0, 1));
		panelTextField.add(textFiledX);
		panelTextField.add(textFiledY);
		
		add(panelTextField, BorderLayout.CENTER);
		
		JPanel panelButton = new JPanel(new GridLayout(0, 1));
		panelButton.add(buttonOK);
		panelButton.add(buttonCancel);
		panelButton.add(buttonHelp);
		
		add(panelButton, BorderLayout.EAST);
		
		
	}
}


