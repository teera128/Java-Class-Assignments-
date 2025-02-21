import java.util.Scanner;

public class Lab26 extends Calculator
{ public static void main(String[] args)
	{ Scanner input = new Scanner (System.in);
	  Calculator cal = new Calculator ();
	int menu;
	double result;
	do {
		System.out.println("ป้อนเลขเมนูที่ต้องการ");
	  	System.out.println("Enter 1 เพื่อคำนวนหาผลรวมของเลข 2 จำนวน");
	  	System.out.println("Enter 2 เพื่อคำนวนหาผลต่างของเลข 2 จำนวน");
	  	System.out.println("Enter 3 เพื่อคำนวนหาผลคูณของเลข 2 จำนวน");
	  	System.out.println("Enter 4 เพื่อคำนวนหาผลหารของเลข 2 จำนวน");
	  	menu = input.nextInt();
		if ( (menu < 1) || (menu > 4))
			{ System.out.println("ตัวเลขที่ป้อนไม่มีในเมนู กรุณาป้อนเลขใหม่"); }
		}
	  while ((menu < 1) || (menu > 4));
	  System.out.println("ป้อนเลขที่ต้องการ ตัวที่ 1");
	  double n1 = input.nextDouble();
	  System.out.println("ป้อนเลขที่ต้องการ ตัวที่ 2");
	  double n2 = input.nextDouble();
	  switch (menu)
		{ case 1 :
		  result = cal.sum(n1,n2);
		  System.out.println("ผลรวม = "+result);
		  break;

		  case 2 :
		  result = cal.minus(n1,n2);
		  System.out.println("ผลต่าง = "+result);
		  break;	

		  case 3 :
		  result = cal.product(n1,n2);
		  System.out.println("ผลคูณ = "+result);
		  break;	

		  case 4 :
		  result = cal.divide(n1,n2);
		  System.out.println("ผลหาร = "+result);
		  break;	
		}
	}
}