public class Triangle extends Shape
{ protected double base;
  protected double height;

  public Triangle()
	{ base = 4.0;
	  height = 3.0;
	}

  public Triangle(double b, double h)
	{ base = b;
	  height = h;
	}
  
  public void changeBase(double newB)
	{ base = newB; }

  public void changeHeight(double newH)
	{ height = newH; }

  public double computeArea()
	{ return (0.5*base*height); }

  public void displayShape()
	{ super.displayShape();
	  System.out.println("Base is Triangle with base-length = "+base+" height-length = "+height);
	  System.out.println("Triangle area is "+computeArea());
	}
}