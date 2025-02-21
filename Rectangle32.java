public class Rectangle32 extends Shape
{ protected double width;
  protected double length;

  public Rectangle32()
	{ width = 3.0;
	  length = 5.0;
	}

  public Rectangle32(double w)
	{ width = w;
	  length = 7.0;
	}

  public Rectangle32(double w, double l)
	{ width = w;
	  length = l;
	}

  public double computeArea()
	{ return (width*length); }

 public void displayShape()
	{ super.displayShape();
	  System.out.println("Base is Rectangle with width = "+width+" length = "+length);
	  System.out.println("Rectangle area is "+computeArea());
	}
}