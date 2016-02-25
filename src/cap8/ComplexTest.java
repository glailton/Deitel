package cap8;

public class ComplexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c = new Complex();
		Complex c1 = new Complex(30, 20);
		
		c.imprimeComplexos();
		c1.imprimeComplexos();
		
		c.somarComplexos(2, 3, 4, 5);
		c.imprimeComplexos();
		
		c.subtrairComplexos(2, 3, 4, 5);
		c.imprimeComplexos();
	}

}
