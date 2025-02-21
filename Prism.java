public class Prism extends Triangle
{ protected double heightP;

  public Prism()
	{ super(2.0,3.0); 
	  heightP = 4.0; 
	}

  public Prism(double b, double h, double p)
	{ super(b,h); 
	  heightP =p; 
	}
  
  public double computeVolume()
	{ return (super.computeArea()*heightP); }

  public void displayShape()
	{ super.displayShape();
	  System.out.println("This Object is Prism with base area = "+super.computeArea()+" and length = "+heightP);
	  System.out.println("Prism Volume is "+computeVolume()); 
	}
}