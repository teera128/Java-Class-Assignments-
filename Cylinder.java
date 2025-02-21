public class Cylinder extends Circle
{ protected double heightC;

  public Cylinder()
	{ super(4.0); 
	  heightC = 2.0; 
	}

  public Cylinder(double r, double c)
	{ super(r); 
	  heightC =c; 
	}
  
  public double computeVolume()
	{ return (super.computeArea()*heightC); }

  public void displayShape()
	{ super.displayShape();
	  System.out.println("This Object is Cylinder with radius = "+super.radius+" and height = "+heightC);
	  System.out.println("Cylinder Volume is "+computeVolume()); 
	}
}