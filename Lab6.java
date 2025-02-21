import java.util.Scanner;
public class Lab6
{ public static void main(String[] args)
	{ Scanner input = new Scanner (System.in);
	  System.out.println("ป้อนเลขเมนูที่ต้องการ");
	  System.out.println("Enter 1 เพื่อคำนวนหาพื้นที่สี่เหลี่ยมผืนผ้า");
	  System.out.println("Enter 2 เพื่อคำนวนหาพื้นที่สามเหลี่ยม");
	  System.out.println("Enter 3 เพื่อคำนวนหาพื้นที่วงกลม");
	  System.out.println("Enter 4 เพื่อคำนวนหาพื้นที่สี่เหลี่ยมจตุรัส");
	  int menu = input.nextInt();
	  switch (menu)
		{ case 1 : 
		  System.out.print("ป้อนความกว้าง  ");
		  double width = input.nextDouble();
		    System.out.print("ป้อนความยาว  ");
		  double length = input.nextDouble();
		  double recArea = width*length;
		  System.out.println("พื้นที่สีเหลี่ยมผืนผ้า คือ "+recArea);
		  break;

		  case 2 : 
		  System.out.print("ป้อนความสูง  ");
		  double height = input.nextDouble();
		    System.out.print("ป้อนฐาน  ");
		  double base = input.nextDouble();
		  double triArea = height*base*0.5;
		  System.out.println("พื้นที่สามเหลี่ยม คือ "+triArea);
		  break;

		  case 3 : 
		  System.out.print("ป้อนรัศมี  ");
		  double radius = input.nextDouble();
		  double cirArea = 3.14159*(radius*radius);
		  System.out.println("พื้นที่วง คือ "+cirArea);
		  break;

		  case 4 : 
		  System.out.print("ป้อนความยาวด้าน  ");
		  double side = input.nextDouble();
		  double sqrArea = side*side;
		  System.out.println("พื้นที่สี่เหลี่ยมจตุรัส คือ "+sqrArea);
		  break;

		  default : 
		  System.out.println("ตัวเลขที่ป้อนไม่มีในเมนู");
		  break;
		}
	}
}

		  