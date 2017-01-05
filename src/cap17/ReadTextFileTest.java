package cap17;

public class ReadTextFileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadTextFile readTextFile = new ReadTextFile();
		
		readTextFile.openFile();
		readTextFile.readRecords();
		readTextFile.closeFile();
	}

}
