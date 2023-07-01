/**
 * Movie Driver class, receives input of a movie and then displays it. It asks if the user wants to enter another movie. If yes, it repeats.
 * @author Shawn Bearam
 *
 */

import java.util.*;

public class MovieDriver 
{
	public static void main(String[] args)
	{
		//Create scanner and movie objects.
		Scanner scan = new Scanner(System.in);
		Movie m = new Movie();
		String cont = "";
		//repeats if user wants to enter another movie
		do
		{
			//Read input from the user about the movie
			System.out.println("Enter the title of the movie");
			m.setTitle(scan.nextLine());
			System.out.println("Enter the movie's rating");
			m.setRating(scan.nextLine());
			System.out.println("Enter the number of tickets sold for this movie");
			m.setSoldTickets(scan.nextInt());
			//Display users input uniformly
			System.out.println(m.toString());
			System.out.println("Do you want to enter another? (y or n)");
			scan.nextLine();
			cont = scan.nextLine();
		} while(cont.equals("y"));
	}
	
}
