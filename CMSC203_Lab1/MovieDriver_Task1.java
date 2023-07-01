/**
 * Movie Driver class, receives input of a movie and then displays it.
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
	
		System.out.println("Enter the title of the movie");
		m.setTitle(scan.nextLine());
		System.out.println("Enter the movie's rating");
		m.setRating(scan.nextLine());
		System.out.println("Enter the number of tickets sold for this movie");
		m.setSoldTickets(scan.nextInt());
		
		System.out.print(m.toString());
	}
	
}
