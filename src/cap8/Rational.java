package cap8;

public class Rational {
	
	private int numerador, denominador;
	
	public Rational(){
		numerador = 0;
		denominador = 0;
	}
	
	public Rational(int num, int den){
	/*	this.numerador = num;
		this.denominador = den;*/
		reduzidaForma(num, den);
	}

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	
	public void sum(int num1, int den1, int num2, int den2){
		setNumerador(num1+num2);
		setDenominador(den1+den2);
		reduzidaForma(getNumerador(), getDenominador());
	}
	
	public void reduzidaForma(int num, int den){
		setNumerador(num);
		setDenominador(den);
		int resto;
		while (den != 0){
			resto = num % den;
			num = den;
			den = resto;
			System.out.println(num);
		}
		System.out.println(num);
		if (num>=2){
			if((getNumerador() % num == 0) && (getDenominador() % num == 0)){
				setNumerador(getNumerador()/num);
				setDenominador(getDenominador()/num);
			}
		}
		System.out.println(getNumerador() + "/" + getDenominador());
	}
}
