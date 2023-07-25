/*
 * Class: CMSC203 
 * Instructor: Grinberg
 * Description: Uses methods from TwoDimRaggedArrayUtility to calculate each stores holiday bonus.
 * Due: 07/24/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Shawn Bearam
*/
/** @author Shawn Bearam */

public class HolidayBonus extends Object
{
	public static double[] calculateHolidayBonus(double[][] data)
	{
		double[] b = new double[data.length];
		double h = 0;
		double l = 0;
		int lI = 0;
		int hI = 0;
		int COLS = 0;
		for(int i = 0; i < data.length; i++)
		{
			if(data[i].length > COLS)
			{
				COLS = data[i].length;
			}
		}
		//System.out.println("Cols: " + COLS);
		for(int c = 0; c < COLS; c++)
		{
			h = TwoDimRaggedArrayUtility.getHighestInColumn(data, c);
			l = TwoDimRaggedArrayUtility.getLowestInColumn(data, c);
			lI = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, c);
			//System.out.println("Lowest: " + lI);
			hI = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, c);
			//System.out.println("Highest: " + hI);
			if(h > 0)
			{
				//System.out.println("Adding 5000 to: " + hI);
				b[hI] += 5000;
			}
			if(l > 0 && hI != lI)
			{
				//System.out.println("Adding 1000 to: " + lI);
				b[lI] += 1000;
			}
			for(int r = 0; r < data.length; r++)
			{
				if(c < data[r].length && r != lI && r != hI && data[r][c] > 0)
				{
					//System.out.println("Adding 2000 to: " + r);
					b[r] += 2000;
				}
			}
		}
		return b;
	}
	
	public static double calculateTotalHolidayBonus(double[][] data)
	{
		double t = 0;
		double[] a;
		a = calculateHolidayBonus(data);
		for(double d: a)
		{
			t += d;
		}
		return t;
		
	}
}
