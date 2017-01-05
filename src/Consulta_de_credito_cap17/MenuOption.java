package Consulta_de_credito_cap17;

public enum MenuOption {
	ZERO_BALANCE(1),
	CREDIT_BALANCE(2),
	DEBIT_BALANCE(3),
	END(4);
	
	private final int value = 0;
	
	MenuOption(int valueOption){
		valueOption = valueOption;
	}

	public int getValue() {
		return value;
	}
	
	
}
