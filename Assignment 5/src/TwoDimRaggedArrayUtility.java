/*
 * Class: CMSC203 
 * Instructor: Grinberg
 * Description: Houses methods to read data from files and calculate row and column totals.
 * Due: 07/24/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Shawn Bearam
*/
/** @author Shawn Bearam */

import java.io.*;
import java.util.*;

public class TwoDimRaggedArrayUtility extends Object
{
	final int MAX_ROW = 10;
	final int MAX_COL = 10;
	
	public static double[][] readFile(File file) throws FileNotFoundException
	{
		Scanner f = new Scanner(file);
		Scanner nL;
		int rows = 0;
		while(f.hasNextLine())
		{
			rows++;
			f.nextLine();
		}
		f.close();
		double[][] a = new double[rows][];
		String[] cols;
		String l = "";
		nL = new Scanner(file);
		for(int i = 0; i < rows; i++)
		{
			cols = nL.nextLine().split(" ");
			a[i] = new double[cols.length];
			for(int j = 0; j < cols.length; j++)
			{
				a[i][j] = Double.parseDouble(cols[j]);
			}
		}
		nL.close();
		return a;
	}
	
	public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException
	{
		PrintWriter p = new PrintWriter(outputFile);
		for(int r = 0; r < data.length; r++)
		{
			for(double c: data[r])
			{
				p.print(c + " ");
			}
			p.println();
		}
		p.close();
	}
	
	public static double getTotal(double[][] data)
	{
		double t = 0;
		for(int r = 0; r < data.length; r++)
		{
			for(double c: data[r])
			{
				t += c;
			}
		}
		return t;
	}
	
	public static double getAverage(double[][] data)
	{
		int size = 0;
		for(int r = 0; r < data.length; r++)
		{
			for(double c: data[r])
			{
				size++;
			}
		}
		return getTotal(data)/size;
	}
	
	public static double getRowTotal(double[][] data, int row)
	{
		double t = 0;
		for(double c: data[row])
		{
			t += c;
		}
		return t;
	}
	
	public static double getColumnTotal(double[][] data, int col)
	{
		double t = 0;
		for(int r = 0; r < data.length; r++)
		{
			if(col >= data[r].length)
			{
				continue;
			}
			t += data[r][col];
		}
		return t;
	}
	
	public static double getHighestInRow(double[][] data, int row)
	{
		double h = 0;
		for(double c: data[row])
		{
			if(c > h)
			{
				h = c;
			}
		}
		return h;
	}
	
	public static int getHighestInRowIndex(double[][] data, int row)
	{
		int i = 0;
		double h = 0;
		for(int j = 0; j < data[row].length; j++)
		{
			if(data[row][j] > h)
			{
				h = data[row][j];
				i = j;
			}
		}
		return i;
	}
	
	public static double getLowestInRow(double[][] data, int row)
	{
		double l = 999999999;
		for(double c: data[row])
		{
			if(c < l)
			{
				l = c;
			}
		}
		return l;
	}
	
	public static int getLowestInRowIndex(double[][] data, int row)
	{
		double l = 999999999;
		int i = 0;
		for(int j = 0; j < data[row].length; j++)
		{
			if(data[row][j] < l)
			{
				l = data[row][j];
				i = j;
			}
		}
		return i;
	}
	
	public static double getHighestInColumn(double[][] data, int col)
	{
		double h = 0;
		for(int r = 0; r < data.length; r++)
		{
			if(col >= data[r].length)
			{
				continue;
			}
			if(data[r][col] > h)
			{
				h = data[r][col];
			}
		}
		return h;
	}
	
	public static int getHighestInColumnIndex(double[][] data, int col)
	{
		double h = 0;
		int i = 0;
		for(int r = 0; r < data.length; r++)
		{
			if(col >= data[r].length)
			{
				continue;
			}
			if(data[r][col] > h)
			{
				h = data[r][col];
				i = r;
			}
		}
		return i;
	}
	
	public static double getLowestInColumn(double[][] data, int col)
	{
		double l = 999999999;
		for(int r = 0; r < data.length; r++)
		{
			if(col >= data[r].length)
			{
				continue;
			}
			if(data[r][col] < l)
			{
				l = data[r][col];
			}
		}
		return l;
	}
	
	public static int getLowestInColumnIndex(double[][] data, int col)
	{
		double l = 999999999;
		int i = 0;
		for(int r = 0; r < data.length; r++)
		{
			if(col >= data[r].length)
			{
				continue;
			}
			if(data[r][col] < l)
			{
				l = data[r][col];
				i = r;
			}
		}
		return i;
	}
	
	public static double getHighestInArray(double[][] data)
	{
		double h = 0;
		for(int r = 0; r < data.length; r++)
		{
			for(double c: data[r])
			{
				if(c > h)
				{
					h = c;
				}
			}
		}
		return h;
	}
	
	public static double getLowestInArray(double[][] data)
	{
		double l = 999999999;
		for(int r = 0; r < data.length; r++)
		{
			for(double c: data[r])
			{
				if(c < l)
				{
					l = c;
				}
			}
		}
		return l;
	}
}
