/*
 * Class: CMSC203 
 * Instructor: Grinberg
 * Description: (Give a brief description for each Class)
 * Due: 07/03/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Shawn Bearam
*/

/** @author Shawn Bearam*/
import java.util.*;

public class PatientDriverApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		int skip = 0;
		
		Patient patient = new Patient();
		
		System.out.println("Please enter the patient's first name: ");
		patient.setfName(scan.nextLine());
		System.out.println("Please enter the patient's middle name: ");
		patient.setmName(scan.nextLine());
		System.out.println("Please enter the patient's last name: ");
		patient.setlName(scan.nextLine());
		System.out.println("Please enter the patient's address: ");
		patient.setAddress(scan.nextLine());
		System.out.println("Please enter the patient's state: ");
		patient.setState(scan.nextLine());
		System.out.println("Please enter the patient's city: ");
		patient.setCity(scan.nextLine());
		System.out.println("Please enter the patients zip code: ");
//		while(!s.hasNextInt())
//		{
//			System.out.println("Please enter only numbers: ");
////			if(skip == 0)
////			{
////				scan.nextLine();
////				skip++;
////			}
//			if(s.hasNextInt())
//			{
//				break;
//			}
//			//patient.setZip(scan.nextInt());
//		}
		patient.setZip(s.nextLine());
		System.out.println("Please enter the patient's emergency contact name: ");
		patient.setEname(scan.nextLine());
		System.out.println("Please enter the patient's emergency contact number");
		patient.setEnum(scan.nextLine());
		
		Procedure p1 = new Procedure("Physical Exam", "06/26/2023", "Dr. Irvine", 250);
		Procedure p2 = new Procedure("X-ray", "06/26/2023", "Dr. Jamison", 500);
		Procedure p3 = new Procedure("Blood Test", "06/26/2023", "Dr. Smith", 200);
		
		System.out.println("Patient name: " + patient.getfName() + " " + patient.getmName() + " " + patient.getlName());
		System.out.println("Address: " + patient.getAddress());
		System.out.println("City: " + patient.getCity());
		System.out.println("State: " + patient.getState());
		System.out.println("ZIP: " + patient.getZip());
		System.out.println("Emergency Contact: " + patient.getEname() + " " + patient.getEnum());
		System.out.println("Procedure: " + p1.getP());
		System.out.println("Procedure Date: " + p1.getDate());
		System.out.println("Practitioner: " + p1.getName());
		System.out.println("Procedure Charge: $" + p1.getCharge());
		System.out.print("\n");
		System.out.println("Procedure: " + p2.getP());
		System.out.println("Procedure Date: " + p2.getDate());
		System.out.println("Practitioner: " + p2.getName());
		System.out.println("Procedure Charge: $" + p2.getCharge());
		System.out.print("\n");
		System.out.println("Procedure: " + p3.getP());
		System.out.println("Procedure Date: " + p3.getDate());
		System.out.println("Practitioner: " + p3.getName());
		System.out.println("Procedure Charge: $" + p3.getCharge());
		System.out.print("\n");
		System.out.println("Student Name: Shawn Bearam Jr.");
		System.out.println("Student MC M#: M21113735");
		System.out.println("Due Date: 07/03/2023");
		
	}

}
