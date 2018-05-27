package arrays;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ArrayBloodTypes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");

		String[] bloodTypeArray = {"A+","O-","AB+","O+","AB+","AB+","O-","AB+","O+","AB+"};
		
		System.out.print("Enter blood type: ");
		String userBloodType = input.nextLine().toUpperCase();
		
		double arrayLength = bloodTypeArray.length;
		
		double count = 0;
		
		for (int i = 0; i < arrayLength; i++) {
			
			if (bloodTypeArray[i].equals(userBloodType)) {

				count++;
				
			}
			
		}
		
		double percentage = (count/arrayLength) * 100;

		System.out.print(df.format(percentage).replace(".",",") + " %");
		
		input.close();
		
	}
	

}
