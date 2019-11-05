package EnumMap;

import java.util.EnumSet;
import java.util.*;
public class EnumSetExample {
	public static void main(final String[] args)
	{
	    // this will draw line in yellow color

	        final EnumSet<Color> yellow = EnumSet.of(Color.RED, Color.GREEN);
	        drawLine(yellow);

	        // RED + GREEN + BLUE = WHITE
	        final EnumSet<Color> white = EnumSet.of(Color.RED, Color.GREEN, Color.BLUE);
	        drawLine(white);
	  
	        // RED + BLUE = PINK
	        final EnumSet<Color> pink = EnumSet.of(Color.RED, Color.BLUE);
	        drawLine(pink);

	    }

	  public static void drawLine(final Set<Color> colors) 
	  {
	      System.out.println("Requested Colors to draw lines : " + colors);
	      for (final Color c : colors) {
	          System.out.println("drawing line in color : " + c);
	      }
	  }

	 private enum Color
	 {
	     RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255);
	     private int r;
	     private int g;
	     private int b;

	     private Color(final int r, final int g, final int b) 
	     {
	         this.r = r;
	         this.g = g;
	         this.b = b;
	    }

	    public int getR() 
	    {
	        return r;
	    }

	    public int getG() 
	    {
	        return g;
	    }

	    public int getB()
	    {
	        return b;
	    }
	  }
}
