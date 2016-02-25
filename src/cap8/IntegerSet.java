package cap8;

public class IntegerSet {

	private boolean intArray[];

	public IntegerSet() {
		// TODO Auto-generated constructor stub
		intArray = new boolean[100];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = false;
		}
	}

	public boolean getElement (int i){
		if (i>0 && i<intArray.length){
			return intArray[i];
		}else return false;
	}

	public void insertElement (int k){
		if (k>0 && k<intArray.length){
			intArray[k] = true;
		}
	}
	
	public void deleteElement (int k){
		if (k>0 && k<intArray.length){
			intArray[k] = false;
		}
	}
	
	public IntegerSet union (IntegerSet integerSet){
		IntegerSet intSet = new IntegerSet();
		
		for (int i = 0; i < intArray.length; i++) {
			if(this.getElement(i) || integerSet.getElement(i))
				intSet.insertElement(i);
		}
		return intSet;
	}
	
	public IntegerSet intersection (IntegerSet integerSet){
		IntegerSet intSet = new IntegerSet();
		
		for (int i = 0; i < intArray.length; i++) {
			if(this.getElement(i) && integerSet.getElement(i)){
				intSet.insertElement(i);
			}else
				intSet.deleteElement(i);
		}
		return intSet;
	}
}
