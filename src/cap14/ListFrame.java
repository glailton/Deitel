package cap14;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;



public class ListFrame extends JFrame{

	private JList colorJList;
	private JComboBox comboBox;
	
	private static final String[] colorNames = {"Black", "Blue", "Cyan", "Dark Cyan", 
		"Gray", "Green", "Light Grey", "Magenta", "Orange", "Pink", "Red", "White", "Yellow"};
	private static final Color[] colors = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY,
		Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, 
		Color.RED, Color.WHITE, Color.YELLOW};
	
	public ListFrame() {
		// TODO Auto-generated constructor stub
		super("JList Testing");
		setLayout(new FlowLayout());
		
		colorJList = new JList<>(colorNames);
		colorJList.setVisibleRowCount(5);
		
		colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		add(new JScrollPane(colorJList));
//		add(new JComboBox(colorJList));
		
		
		
		colorJList.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				getContentPane().setBackground(colors[colorJList.getSelectedIndex()]);
			}
		});
		
		
	}

}
