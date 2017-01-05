package cap8;

public class Complex {
	
	private double parteReal;
	private double parteImag;

	public Complex() {
		// TODO Auto-generated constructor stub
		this.parteReal = 0;
		this.parteImag = 0;
	}
	
	public Complex(double real, double imag){
		this.parteReal = real;
		this.parteImag = imag;	
	}
	
	public void somarComplexos(double real1, double imag1, double real2, double imag2){
		parteReal = real1 + real2;
		parteReal = imag1 + imag2;
	}
	
	public void subtrairComplexos(double real1, double imag1, double real2, double imag2){
		parteReal = real1 - real2;
		parteImag = imag1 - imag2;
	}
	
	public void imprimeComplexos(){
		System.out.println(parteReal + ", " + parteImag);
	}

}
