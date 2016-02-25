package cap14;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxFrame extends JFrame{

	private JComboBox imagesComboBox;
	private JLabel label;
	
	private static final String[] names = {"bug1.gif", "bug2.gif", "travelbug.gif", "buganim.gif"};
	private Icon[] icons = {new ImageIcon(getClass().getResource(names[0])),
			new ImageIcon(getClass().getResource(names[1])),
			new ImageIcon(getClass().getResource(names[2])),
			new ImageIcon(getClass().getResource(names[3]))}; 	
	
	public ComboBoxFrame() {
		// TODO Auto-generated constructor stub
		super("Testing JComboBox");
		setLayout(new FlowLayout());
		
		imagesComboBox = new JComboBox<>(names);
		imagesComboBox.setMaximumRowCount(3);
		
		imagesComboBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if (e.getStateChange() == ItemEvent.SELECTED) {
					label.setIcon(icons[imagesComboBox.getSelectedIndex()]);
				}
			}
		});
		
		add(imagesComboBox);
		label = new JLabel(icons[0]);
		add(label);
	}

}
