package cap23;

import java.applet.Applet;
import java.awt.Graphics;

import javax.swing.JOptionPane;

public class NumbersApplet extends Applet{
	
	double n1,n2;
	public void init(){
		String firstNumber = JOptionPane.showInputDialog("Enter first number");
		
		String secondNumber = JOptionPane.showInputDialog("Enter second number");
		
		n1 = Double.parseDouble(firstNumber);
		n2 = Double.parseDouble(secondNumber);
	}
	
	public void paint(Graphics g){
		g.drawRect(15, 10, 300, 20);
		
		g.drawString("The sum is: " + sum(n1,n2), 25, 25);
		g.drawString("The diference is: " + difference(n1, n2), 25, 50);
		g.drawString("The multiplication is: " + multiply(n1, n2), 25, 75);
		g.drawString("The division is: "+ divide(n1, n2), 25, 100);
	}


	private double divide(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1/n2;
	}

	private double multiply(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1*n2;
	}

	private double difference(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1-n2;
	}

	private double sum(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1+n2;
	}
}
