package cap23;

import java.applet.Applet;
import java.awt.Graphics;

import javax.swing.JOptionPane;

public class ComparisionNumbers extends Applet{
	private double n1,n2;
	
	public void init(){
		String firstNumber = JOptionPane.showInputDialog("Enter first number");
		
		String secondNumber = JOptionPane.showInputDialog("Enter second number");
		
		n1 = Double.parseDouble(firstNumber);
		n2 = Double.parseDouble(secondNumber);
	}
	
	public double comparision(double n1, double n2){
		if(n1>n2){
			return n1;
		}else if (n2>n1){
			return n2;
		}else{
			return 3215478;
		}
	}
	

	public void paint(Graphics g){
		g.drawRect(15, 10, 300, 20);
		
		if(comparision(n1, n2) != 3215478){
			g.drawString("The number "+comparision(n1, n2)+" is larger" , 25, 25);
		}else
			g.drawString("These numbers are equals" , 25, 25);
	}
}
