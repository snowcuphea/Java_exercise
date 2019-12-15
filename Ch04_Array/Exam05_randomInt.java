package Ch04_Array;

import java.util.Random;

public class Exam05_randomInt {

	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(6)+1;
		System.out.println(num);
		

	}

}
