/*
 * Class: CMSC203 
 * Instructor: Grinberg
 * Description: A program that allows the user to attempt to guess the randomly generated color.
 * Due: 06/19/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Shawn Bearam
*/


import java.util.*;
public class Assignment1 
{
	public static void main(String[] args)
	{
		//Declare all necessary variables
		Random r = new Random();
		Scanner scan = new Scanner(System.in);
		String name = "";
		String m = "";
		String info = "";
		int round = 1;
		int guess = 0;
		int random = 0;
		String color = "";
		int correct = 0;
		//Retrieve user info
		System.out.print("Enter your name: ");
		name = scan.nextLine();
		System.out.print("Enter your MC M#: ");
		m = scan.nextLine();
		System.out.print("Describe yourself: ");
		info = scan.nextLine();
		System.out.println("\nDue Date: 06/19/23 \nCMSC203 Assignment1: Test your ESP skiils!");
		//While loop that runs 10 times to allow user to guess
		while(round < 11)
		{
			random = r.nextInt(5);
			//Convert integer to corresponding color
			switch(random)
			{
			case 0: 
				color = "Red";
				break;
			case 1: 
				color = "Green";
				break;
			case 2: 
				color = "Blue";
				break;
			case 3:
				color = "Orange";
				break;
			case 4:
				color = "Yellow";
				break;
			}
			System.out.println("Round " + round + "\n");
			System.out.println("I am thinking of a color. \nIs it Red, Green, Blue, Orange, or Yellow?");
			System.out.print("Enter your guess here: ");
			guess = scan.nextInt();
			if(guess == random)
			{
				correct++;
			}
			System.out.println("\nI was thinking of " + color);
			round++;
		}
		scan.close();
		//Display user info
		System.out.println("Game Over \n\nYou guessed " + correct +"/10 colors correctly");
		System.out.println("User Name: " + name);
		System.out.println("Student MC M#: " + m);
		System.out.println("User Description: " + info);
		System.out.println("Date: 06/19/23");
		//Display programmer name
		System.out.print("Programmer: Shawn Bearam");
		
	}
	
	
	
}
