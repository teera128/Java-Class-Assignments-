public class Lab25 extends Rectangle
{ public static void main(String[] args)
	{ double pls1 = 2, pls2 = 4;

	  Rectangle rec1 = new Rectangle();
	  double rec1Area = rec1.calArea();
	  double rec1Per = rec1.calPerimeter();
	  rec1.showRectangle( );
	  System.out.println();
	  rec1.changeSize();
	  rec1.showRectangle( );
	  System.out.println();
	  rec1.changeSize(pls1);
	  rec1.showRectangle( );
	  System.out.println();
	  rec1.changeSize(pls1,pls2);
	  rec1.showRectangle( );
	  System.out.println();
	  /*rec1.showNewRectangle( );
	  System.out.println();

	  Rectangle rec2 = new Rectangle(4.0);
	  double rec2Area = rec2.calArea();
	  double rec2Per = rec2.calPerimeter();
	  rec2.showRectangle( );
	  System.out.println();
	  rec2.changeSize();
	  rec2.changeSize(pls1);
	  rec2.changeSize(pls1,pls2);
	  rec2.showNewRectangle( );
	  System.out.println();

	  Rectangle rec3 = new Rectangle(3.0 , 8.0);
	  double rec3Area = rec3.calArea();
	  double rec3Per = rec3.calPerimeter();
	  rec3.showRectangle( );
	  System.out.println();
	  rec3.changeSize();
	  rec3.changeSize(pls1);
	  rec3.changeSize(pls1,pls2);
	  rec3.showNewRectangle( );*/
	}
}

	  