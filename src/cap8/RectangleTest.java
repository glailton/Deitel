package cap8;

import java.util.Scanner;

public class RectangleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec = new Rectangle();
		Scanner out = new Scanner(System.in);
		
		System.out.println("Digite o valor da largura");
		double width = out.nextDouble();
		rec.setWidth(width);
		
		System.out.println("Digite o valor do comprimento");
		double length = out.nextDouble();
		rec.setLength(length);
		
		double area = rec.calcArea(length, width);
		double peri = rec.calcPeri(length, width);
		
		System.out.println("Area = " + area);
		System.out.println("Perimetro = " + peri);
	}

}
