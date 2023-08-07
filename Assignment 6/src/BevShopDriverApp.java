/*
 * Class: CMSC203 
 * Instructor: Grinberg
 * Description: The driver class for the whole shop
 * Due: 08/07/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Shawn Bearam 
*/

import java.util.Scanner;

public class BevShopDriverApp 
{
	public static void main(String[] args) 
	{
		String name = "";
		int age, orderT;
		String aD, oD, aO;
		Day orderD;
		int order;
		BevShop b = new BevShop();
		Scanner kB = new Scanner(System.in);
		System.out.println("The current order in process can have at most 3 alcoholic beverages.\r\n"
				+ "The minimum age to order alcohol drink is 21\r\n"
				+ "Start please a new order:\r\n"
				+ "Your Total Order for now is 0.0\r\n"
				+ "");
		do 
		{
			System.out.println("Would you please enter your name: ");
			name = kB.nextLine();
			System.out.println("Would you please enter your age: ");
			age = kB.nextInt();
			System.out.println("Would you please enter the time: ");
			orderT = kB.nextInt();
			kB.nextLine();
			System.out.println("Would you please enter the day: ");
			oD = kB.nextLine();
			orderD = setOrderDay(oD);
			b.startNewOrder(orderT, orderD, name, age);
			do 
			{
				System.out.println("\nWhat would you like to order?(Enter 1, 2, or 3)\n 1. Alcohol\n 2. Smoothie \n 3. Coffee");
				order = kB.nextInt();
				switch(order)
				{
					case 1:
						if(b.isValidAge(age) && !b.isEligibleForMore())
						{
							System.out.println(orderAlc(b));
							kB.nextLine();
						}
						else if(b.isEligibleForMore())
						{
							System.out.println("You have reached the max amount of alcoholic drinks");
							kB.nextLine();
						}
						else
						{
							System.out.println("YOU MUST BE AT LEAST 21 TO ORDER ALCOHOL");
							kB.nextLine();
						}
						break;
					case 2:
						System.out.println(orderSm(b));
						kB.nextLine();
						break;
					case 3:
						System.out.println(orderC(b));
						kB.nextLine();
						break;
				}
				System.out.print("Would you like to add another drink to your order?(Y/N)");
				aD = kB.nextLine().toLowerCase();
			}while(aD.equals("y"));
				System.out.print("Would you like to start a new order?(Y/N)");
				aO = kB.nextLine().toLowerCase();
		}while(aO.equals("y"));
		kB.close();
		System.out.println(b.toString());
		
	}
	
	public static Day setOrderDay(String oD)
	{
		switch(oD.toLowerCase())
		{
			case "monday":
				return Day.MONDAY;
			case "tuesday":
				return Day.TUESDAY;
			case "wednesday":
				return Day.WEDNESDAY;
			case "thursday":
				return Day.THURSDAY;
			case "friday":
				return Day.FRIDAY;
			case "saturday":
				return Day.SATURDAY;
			default:
				return Day.SUNDAY;
		}
	}
	
	public static Size setBevSize(String size)
	{
		switch(size.toLowerCase())
		{
			case "small": 
				return Size.SMALL;
			case "medium":
				return Size.MEDIUM;
			default:
				return Size.LARGE;
		}
	}
	
	public static String orderAlc(BevShop bS)
	{
		Scanner scan = new Scanner(System.in);
		String bevN = "";
		String size = "";
		Size s;
		System.out.print("What is the name of the beverage?");
		bevN = scan.nextLine();
		System.out.print("\nWhat is the size of the beverage?");
		size = scan.nextLine();
		s = setBevSize(size);
		bS.processAlcoholOrder(bevN, s);
		//scan.close();
		return "Beverage added. Your total is now: " + bS.totalOrderPrice(bS.orders.get(bS.index).getOrderNo());
	}
	
	public static String orderSm(BevShop bS)
	{
		Scanner scan = new Scanner(System.in);
		String bevN = "";
		String size = "";
		int nF = 0;
		String p = "";
		boolean aP = false;
		Size s;
		System.out.print("What is the name of the beverage?");
		bevN = scan.nextLine();
		System.out.print("\nWhat is the size of the beverage?");
		size = scan.nextLine();
		System.out.print("\nHow many fruits would you like to add?");
		nF = scan.nextInt();
		scan.nextLine();
		System.out.print("\nWould you like to add protein?(Y/N)");
		p = scan.nextLine();
		if(p.toLowerCase().equals("y"))
			aP = true;
		else
			aP = false;
		s = setBevSize(size);
		bS.processSmoothieOrder(bevN, s, nF, aP);
		//scan.close();
		return "Beverage added. Your total is now: " + bS.totalOrderPrice(bS.orders.get(bS.index).getOrderNo());
	}
	
	public static String orderC(BevShop bS)
	{
		Scanner scan = new Scanner(System.in);
		String bevN = "";
		String size = "";
		String eS, eSh = "";
		boolean exS, exSh = false;
		Size s;
		System.out.print("What is the name of the beverage?");
		bevN = scan.nextLine();
		System.out.print("\nWhat is the size of the beverage?");
		size = scan.nextLine();
		System.out.print("\nWould you like extra syrup(Y/N)?");
		eS = scan.nextLine();
		if(eS.toLowerCase().equals("y"))
			exS = true;
		else
			exS = false;
		System.out.print("\nWould you like an extra shot(Y/N)?");
		eSh = scan.nextLine();
		if(eSh.toLowerCase().equals("y"))
			exSh = true;
		else
			exSh = false;
		s = setBevSize(size);
		bS.processCoffeeOrder(bevN, s, exSh, exS);
		//scan.close();
		return "Beverage added. Your total is now: " + bS.totalOrderPrice(bS.orders.get(bS.index).getOrderNo());
		
	}
}
