package cap18;

public class TowersOfHanoi {
	
	public static void solveTowers(int disks, int sourcePeg, 
			int destinetionPeg, int tempPeg){
		if(disks == 1){
			System.out.printf("\n%d --> %d", sourcePeg, destinetionPeg);
			return;
		}
		
		solveTowers(disks - 1, sourcePeg, tempPeg, destinetionPeg);
		
		System.out.printf("\n%d --> %d", sourcePeg, destinetionPeg);
		
		solveTowers(disks - 1, tempPeg, destinetionPeg, sourcePeg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startPeg = 1;
		int endPeg = 3;
		int tempPeg = 2;
		int totalDisks = 1000;
		
		solveTowers(totalDisks, startPeg, endPeg, tempPeg);
		
	}

}
