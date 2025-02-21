import java.util.Scanner;
public class Lab32
{ public static void main(String[] args)
	{ Scanner input = new Scanner (System.in);
 	  System.out.println("--Prism--"); 
	  double basePri, heightPri, heightP;
	  int xP, yP;
	  char colorP;
 	  System.out.print("Position of X is "); 
	  xP = input.nextInt();
	  System.out.println(); 

 	  System.out.print("Position of Y is "); 
	  yP = input.nextInt();
	  System.out.println(); 

 	  System.out.print("Select Color: Press B for Black / Press R for Red / Press Y for Yellow ::  "); 
	  colorP = input.next().charAt(0);
	  System.out.println(); 

 	  System.out.print("Base is "); 
	  basePri = input.nextDouble();
	  System.out.println(); 

 	  System.out.print("Height is "); 
	  heightPri = input.nextDouble();
	  System.out.println(); 

 	  System.out.print("Length is "); 
	  heightP = input.nextDouble();
	  System.out.println(); 

	  Prism a1 = new Prism(basePri, heightPri, heightP);
 	  System.out.print("Change X to "); 
	  xP = input.nextInt();

 	  System.out.print("Change Y to "); 
	  yP = input.nextInt();
	  a1.changePosition(xP,yP);

 	  System.out.print("Change Color to "); 
	  colorP = input.next().charAt(0);
	  a1.changeColor(colorP);

 	  System.out.print("Change Base to "); 
	  basePri = input.nextDouble();
	  a1.changeBase(basePri);

 	  System.out.print("Change Height to "); 
	  heightPri = input.nextDouble();
	  a1.changeHeight(heightPri);

	  double areaP;
	  areaP = a1.computeVolume();
	  a1.displayShape();
 	  System.out.println("----------------------------------------------------"); 

 	  System.out.println("--Box--"); 
	  double width, length, heightB;
	  int xB, yB;
	  char colorB;
 	  System.out.print("Position of X is "); 
	  xB = input.nextInt();
	  System.out.println(); 

 	  System.out.print("Position of Y is "); 
	  yB = input.nextInt();
	  System.out.println(); 

 	  System.out.print("Select Color: Press B for Black / Press R for Red / Press Y for Yellow ::  "); 
	  colorB = input.next().charAt(0);
	  System.out.println(); 

 	  System.out.print("Width is "); 
	  width = input.nextDouble();
	  System.out.println(); 

 	  System.out.print("Length is "); 
	  length = input.nextDouble();
	  System.out.println(); 

 	  System.out.print("Height is "); 
	  heightB = input.nextDouble();
	  System.out.println(); 

	  Box b1 = new Box(width, length, heightB);
 	  System.out.print("Change X to "); 
	  xB = input.nextInt();

 	  System.out.print("Change Y to "); 
	  yB = input.nextInt();
	  b1.changePosition(xB,yB);

 	  System.out.print("Change Color to "); 
	  colorB = input.next().charAt(0);
	  b1.changeColor(colorB);

	  double areaB;
	  areaB  = b1.computeVolume();
	  b1.displayShape();
 	  System.out.println("----------------------------------------------------"); 

 	  System.out.println("--Cylinder--"); 
	  double radius, heightC;
	  int xC, yC;
	  char colorC;
 	  System.out.print("Position of X is "); 
	  xC = input.nextInt();
	  System.out.println(); 

 	  System.out.print("Position of Y is "); 
	  yC = input.nextInt();
	  System.out.println(); 

 	  System.out.print("Select Color: Press B for Black / Press R for Red / Press Y for Yellow ::  "); 
	  colorC = input.next().charAt(0);
	  System.out.println(); 

 	  System.out.print("Radius is "); 
	  radius = input.nextDouble();
	  System.out.println(); 

 	  System.out.print("Height is "); 
	  heightC = input.nextDouble();
	  System.out.println(); 

	  Cylinder c1 = new Cylinder(radius, heightC);
 	  System.out.print("Change X to "); 
	  xC = input.nextInt();

 	  System.out.print("Change Y to "); 
	  xC = input.nextInt();
	  c1.changePosition(xC,yC);

 	  System.out.print("Change Color to "); 
	  colorC = input.next().charAt(0);
	  c1.changeColor(colorC);

	  double areaC;
	  areaC  = c1.computeVolume();
	  c1.displayShape();
 	  System.out.println("----------------------------------------------------");
	}
}



