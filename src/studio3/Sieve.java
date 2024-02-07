package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.print("Give a number");
		int num = in.nextInt();
		int[] numbers = new int[num];
		
		int count = 2;

		for(int i=0; i<numbers.length; i++){
			numbers[i]= count;
			count++;
		}
		
		for(int j=0; j<Math.sqrt(numbers.length); j++){
			int n = numbers[j];
			
			for(int k = n; k<= num; k+=n) {
				for(int m = 0; m<numbers.length; m++) {
					if(numbers[m] == (k+=n)) {
						numbers[m] = 0;
					}
				}
			}
		}
		for(int i = 0; i<numbers.length-1; i++) {
			System.out.println(numbers[i]);
		}
			
	}

}
