package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String Marvel[] = {
			"Iron Man", 
			"Pip the Troll",
			"Howard the Duck",
			"Adam Warlock",
			"Drax the Destroyer"
		};
		//2. print the third element in the array
		System.out.println(Marvel[2]);
		//3. set the third element to a different value
		Marvel[2] = "Dr. Strange";
		//4. print the third element again
		System.out.println(Marvel[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < Marvel.length; i++) {
			System.out.println(Marvel[i]);
		}
		
		//6. make an array of 50 integers
		int [] num = new int [50];
		//7. use a for loop to make every value of the integer array a random number
		Random ran = new Random();
		for (int i = 0; i < num.length; i++) {
			num[i] = ran.nextInt(101);
		//8. without printing the entire array, print only the smallest number in the array
		}
		int lowestNumber = num[0];
		int highestNumber = num[0];
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			if (num[i] < lowestNumber) {
				lowestNumber = num[i];
			}
			if (num[i] > highestNumber) {
				highestNumber = num[i];
			}
		}
		System.out.println("This is the lowest number: " + lowestNumber);
		System.out.println("This is the highest number: " + highestNumber);
		//9 print the entire array to see if step 8 was correct
		//10. print the largest number in the array.
	}
}
