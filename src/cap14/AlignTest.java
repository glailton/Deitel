package cap14;

import javax.swing.JFrame;

public class AlignTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Align");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Align align = new Align();

		frame.setContentPane(align);
		frame.setSize(275,110);
		frame.setVisible(true);
	}
}
