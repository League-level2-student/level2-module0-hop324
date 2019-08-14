package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] yeet = {"Yeet", "Yote", "Yagga", "Shaggy", "Thanos"};
		//2. print the third element in the array
		System.out.println(yeet[3]);
		//3. set the third element to a different value
		yeet[3] = "Stonks";
		//4. print the third element again
		System.out.println(yeet[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < yeet.length;i++) {
			System.out.println(yeet[i]);
		}
		
		//6. make an array of 50 integers
		int[] infinityStones = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random randy = new Random();
		for(int k = 0; k < infinityStones.length;k++) {
			k = randy.nextInt(100);
		}
		
		//8. without printing the entire array, print only the smallest number in the array
		int temp = 0;
		for(int j = 0; j < infinityStones.length; j++) {
			for(int l = 0; l < 100; l++) {
				if(l == infinityStones[j]) {
					if(l > 1) {
						if(temp > l) {
							temp = l;
						}
					}
					temp = l;
				}
			}
		}
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
		
		
		
		
	}
}
