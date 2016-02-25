package cap14;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MultipleSelectionFrame extends JFrame {
	
	private JList colorJList, copyJList;
	private JComboBox comboBox;
	private JButton copyJButton;
	
	private static final String[] colorNames = {"Black", "Blue", "Cyan", "Dark Cyan", 
		"Gray", "Green", "Light Grey", "Magenta", "Orange", "Pink", "Red", "White", "Yellow"};
	private static final Color[] colors = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY,
		Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, 
		Color.RED, Color.WHITE, Color.YELLOW};

	public MultipleSelectionFrame() {
		// TODO Auto-generated constructor stub
		
		super("MultipleSelection Testing");
		setLayout(new FlowLayout());
		
		colorJList = new JList<>(colorNames);
		colorJList.setVisibleRowCount(5);
		
		colorJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		add(new JScrollPane(colorJList));
		
		copyJButton = new JButton("Copy >>>");
		copyJButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				copyJList.setListData(colorJList.getSelectedValues());
			}
		});
		
		add(copyJButton);
		
		copyJList = new JList<>();
		copyJList.setVisibleRowCount(5);
		copyJList.setFixedCellHeight(15);
		copyJList.setFixedCellWidth(100);
		copyJList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		add(new JScrollPane(copyJList));
	}

}
