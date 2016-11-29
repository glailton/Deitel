package cap23;

import java.applet.Applet;
import java.awt.Graphics;

import javax.swing.JOptionPane;

public class NumbersApplet extends Applet{
	
	double n1,n2,n3;
	int numberChoosed = 0;
	public void init(){
		
		if(twoOrThree() == 2){
			String firstNumber = JOptionPane.showInputDialog("Enter first number");
			String secondNumber = JOptionPane.showInputDialog("Enter second number");
			
			n1 = Double.parseDouble(firstNumber);
			n2 = Double.parseDouble(secondNumber);
			choosed(2);
		}else{
			String firstNumber = JOptionPane.showInputDialog("Enter first number");
			String secondNumber = JOptionPane.showInputDialog("Enter second number");
			String thirdNumber = JOptionPane.showInputDialog("Enter third number");
			
			n1 = Double.parseDouble(firstNumber);
			n2 = Double.parseDouble(secondNumber);
			n3 = Double.parseDouble(thirdNumber);
			choosed(3);
		}
		
	}
	
	public void paint(Graphics g){
		g.drawRect(15, 10, 300, 20);
		
		if(numberChoosed == 2){
			g.drawString("The sum is: " + sum(n1,n2), 25, 25);
			g.drawString("The diference is: " + difference(n1, n2), 25, 50);
			g.drawString("The multiplication is: " + multiply(n1, n2), 25, 75);
			g.drawString("The division is: "+ divide(n1, n2), 25, 100);
		}else{
			g.drawString("The sum is: " + sum(n1,n2,n3), 25, 25);
			g.drawString("The average is: " + average(n1, n2, n3), 25, 50);
			g.drawString("The multiplication is: " + multiply(n1, n2,n3), 25, 75);
			g.drawString("The Bigger is: "+ bigger(n1, n2, n3), 25, 100);
			g.drawString("The Smaller is: "+ smaller(n1, n2, n3), 25, 125);
		}
		
		
	}
	
	private int twoOrThree(){
		String number = JOptionPane.showInputDialog("You will comparing Two or three numbers?");
		int n = Integer.parseInt(number);
		while ((n != 2) && (n != 3)){
			number = JOptionPane.showInputDialog("You will comparing Two or three numbers?");
			n = Integer.parseInt(number);
		}
		
		return n;
	}


	private void choosed(int n){
		numberChoosed = n;
	}
	
	private double divide(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1/n2;
	}

	private double multiply(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1*n2;
	}
	
	private double multiply(double n1, double n2, double n3) {
		// TODO Auto-generated method stub
		return n1*n2*n3;
	}

	private double difference(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1-n2;
	}

	private double sum(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1+n2;
	}
	
	private double sum(double n1, double n2, double n3) {
		// TODO Auto-generated method stub
		return n1+n2+n3;
	}
	
	private double average(double n1, double n2, double n3){
		double av = sum(n1, n2, n3)/3;
		
		return av;
	}
	
	private double bigger(double n1, double n2, double n3){
		if((n1 > n2) && (n1 > n3)){
			return n1;
		}else if((n2 > n1) && (n2 > n3)){
			return n2;
		}else{
			return n3;
		}
	}
	
	private double smaller(double n1, double n2, double n3){
		if((n1 < n2) && (n1 < n3)){
			return n1;
		}else if((n2 < n1) && (n2 < n3)){
			return n2;
		}else{
			return n3;
		}
	}
}
