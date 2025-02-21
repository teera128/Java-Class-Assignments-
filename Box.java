public class Box extends Rectangle32
{ protected double heightB;

  public Box()
	{ super(4.0,5.0); 
	  heightB = 2.0; 
	}

  public Box(double w, double l, double b)
	{ super(w,l); 
	  heightB =b; 
	}
  
  public double computeVolume()
	{ return (super.computeArea()*heightB); }

  public void displayShape()
	{ super.displayShape();
	  System.out.println("This Object is Box with width = "+super.width+" , length = "+super.length+" , height = "+heightB);
	  System.out.println("Box Volume is "+computeVolume()); 
	}
}