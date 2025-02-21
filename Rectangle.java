public class Rectangle
{ public double width, length;
  public Rectangle()
	{ width = 3.0;
	  length = 5.0;
	}

  public Rectangle(double w)
	{ width = w;
	  length = 7.0;
	}

  public Rectangle(double w, double l)
	{ width = w;
	  length = l;
	}

  public double calArea()
	{ return (width*length); }

  public double calPerimeter()
	{ return ((width*2)+(length*2)); }

  public void showRectangle( )
	{ System.out.println("Width = "+width);
	  System.out.println("Length = "+length);
	  System.out.println("Area = "+calArea());
	  System.out.println("Perimeter = "+calPerimeter());
	}

  public void changeSize()
	{ width *=2 ;
	  length *= 2;
	}

  public void changeSize(double amount)
	{ width +=amount ;
	}

  public void changeSize(double amount1, double amount2)
	{ width += amount1 ;
	  length += amount2;
	}

  public void showNewRectangle( )
	{ System.out.println("New Width = "+width);
	  System.out.println("New Length = "+length);
	  System.out.println("New Area = "+calArea());
	  System.out.println("New Perimeter = "+calPerimeter());
	}
}
