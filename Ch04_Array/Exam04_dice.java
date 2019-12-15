package Ch04_Array;

public class Exam04_dice {

	public static void main(String[] args) {
		int one, two;
		int sum = 0;
		
		for(int i =1; i<=6; i++) {
			for(int j= 1 ; j<=6 ; j++) {
				if(i+j==6) {
					System.out.println(i + "+" + j + "=" + (i+j));
				}
				
			}
			
		}

	}

}
