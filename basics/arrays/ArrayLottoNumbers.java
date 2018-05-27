package arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayLottoNumbers {

	public static void main(String[] args) {
		
		int[] lottoNumbers = new int[7];
		
		for (int i = 0; i < lottoNumbers.length; i++) {
			
			lottoNumbers[i] = lottoNumberGenerator();
			
		}
		
		Arrays.sort(lottoNumbers);
		
		for (int i = 0; i < lottoNumbers.length; i++) {
			System.out.print(lottoNumbers[i] + " ");
		}
		
	}
	
	public static int lottoNumberGenerator() {
		
		Random randomGenerator = new Random();
		int x = randomGenerator.nextInt(40);
		
		return x;
		
	}

}
