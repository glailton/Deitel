package cap23;

import java.applet.Applet;
import java.awt.Graphics;

import javax.swing.JOptionPane;

public class AdditionApplet extends Applet{
	
	private double sum;
	
	public void init(){
		String firstNumber = JOptionPane.showInputDialog("Enter first number");
		
		String secondNumber = JOptionPane.showInputDialog("Enter second number");
		
		double n1 = Double.parseDouble(firstNumber);
		double n2 = Double.parseDouble(secondNumber);
		
		sum = n1+n2;
	}
	
	public void paint(Graphics g){
		g.drawRect(15, 10, 270, 20);
		
		g.drawString("The sum is: " + sum, 25, 25);
	}

}
