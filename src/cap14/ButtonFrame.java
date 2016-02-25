package cap14;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame {

	private JButton plainButton;
	private JButton fancyButton;
		
	public ButtonFrame() {
		// TODO Auto-generated constructor stub
		super ("Testing Buttons");
		setLayout(new FlowLayout());
		
		Icon bug1 = new ImageIcon(getClass().getResource("bug1.gif"));
		Icon bug2 = new ImageIcon(getClass().getResource("bug2.gif"));
		
		plainButton = new JButton("Plain Button", bug1);
		plainButton.setRolloverIcon(bug2);
		add(plainButton);
		
		
		fancyButton = new JButton("Fancy Button", bug1);
		fancyButton.setRolloverIcon(bug2);
		add(fancyButton);
		
		ButtonHandler handler = new ButtonHandler();
		fancyButton.addActionListener(handler);
		plainButton.addActionListener(handler);
	}
	
	public class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(ButtonFrame.this, String.format(
					"You pressed: %s", e.getActionCommand()));
		}
		
	}

}
