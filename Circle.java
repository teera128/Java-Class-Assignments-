public class Circle extends Shape
{ protected double radius;

  public Circle()
	{ radius = 5.0; }

  public Circle(double r)
	{ radius = r; }
 
  public double computeArea()
	{ return (3.14159*radius*radius); }

  public void displayShape()
	{ super.displayShape();
	  System.out.print("Base shape is circle with radius = "+radius);
	  System.out.println("Circle area is "+computeArea());
	}
}