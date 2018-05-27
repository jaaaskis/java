package JavaExam;

public class ComputerProgram {

	public static class Computer {
		
		int sum(int[] a1, int[] a2) {
			
			int array1sum = 0;
			int array2sum = 0;
			
			for (int i = 0; i < a1.length; i++) {
				array1sum += a1[i];
			}
			
			for (int i = 0; i < a2.length; i++) {
				array2sum += a2[i];
			}
			
			return array1sum + array2sum;
		}
		
		int max(int[] a, int[] b) {
			int maxA = 0;
			int maxB = 0;
			int max = 0;
			
			for (int i = 0; i < a.length; i++) {
				if (a[i] > maxA) {
					maxA = a[i];
				}
			}
			
			for (int i = 0; i < b.length; i++) {
				if (b[i] > maxB) {
					maxB = b[i];
				}
			}
			
			if (maxA > maxB) {
				max = maxA;
			} else if (maxB > maxA) {
				max = maxB;
			}
			
			return max;
		}

	}

	public static void main(String[] args) {
		Computer myComputer = new Computer();
		int[] a1 = {1, 5, 3, 4};
		int[] a2 = {1, 2, 3, 10, 5, 6};
		int[] a3 = {3, 4};
		
		System.out.println(myComputer.sum(a1, a2));
		System.out.println(myComputer.sum(a1, a3));
		
		System.out.println(myComputer.max(a1, a2));
		System.out.println(myComputer.max(a1, a3));
	}

}
