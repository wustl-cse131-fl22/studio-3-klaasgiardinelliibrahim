package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("How many numbers? ");
		int num = scan.nextInt();

		int[] matt;
		matt = new int [num];

		for (int i = 2; i < matt.length + 2; i++) {
			matt[i - 2] = i;
		}

		boolean[] composite = new boolean [num];

		for (int i = 0; i < num; i++) { // going through loop num # of times
			if (composite[i] == false) // if number is prime
			{
				for (int j = 0; j < matt.length; j++) // for each index in the array matt, starting at the number we are considering
				{
					if (matt[j] %  matt[i]== 0 && matt[i] != matt[j]) { //see if element (matt[j]) is divisible by prime number (matt[i])
						composite[j] = true;
					}	
				}
			}
		}

		for (int i = 0; i < matt.length; i++) {
			if (composite[i] == false) {
				System.out.println(matt[i]);
			}

		}

	}

}
