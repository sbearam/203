/*
 * Class: CMSC203 
 * Instructor:Grinberg
 * Description: A program that manages a Management Company's properties and plots.
 * Due: 07/17/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Shawn Bearam
*/
public class Plot extends Object
{
	private int x, y, width, depth;
	
	public Plot()
	{
		width = depth = 1;
		x = y = 0;
	}
	
	public Plot(int x, int y, int width, int depth)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	public Plot(Plot otherPlot)
	{
		this.x = otherPlot.getX();
		this.y = otherPlot.getY();
		this.width = otherPlot.getWidth();
		this.depth = otherPlot.getDepth();
	}
	
	public boolean overlaps(Plot plot)
	{
		int pX = plot.getX();
		int pY = plot.getY();
		int pW = plot.getWidth();
		int pD = plot.getDepth();
		
		 if (x >= (pX + pW)) 
			 return false;
		 else if (y >= (pY + pD))
			 return false;
	     else if ((width + x) <= pX)
	    	 return false;
	     else if ((depth + y) <= pY)
	    	 return false;
	     else
	    	 return true;
	}
	
	public boolean encompasses(Plot plot)
	{
		return ((plot.getX() >= x) && (plot.getY() >= y) && (plot.getX() + plot.getWidth() <= x + width) && (plot.getY() + plot.getDepth() <= y + depth));
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	public void setDepth(int depth)
	{
		this.depth = depth;
	}
	
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	public int getX()
	{
		return this.x;
	}
	
	public int getY()
	{
		return this.y;
	}
	
	public int getWidth()
	{
		return this.width;
	}
	
	public int getDepth()
	{
		return this.depth;
	}
	
	public String toString()
	{
		return this.x + "," + this.y + "," + this.width + "," + this.depth;
	}
}
