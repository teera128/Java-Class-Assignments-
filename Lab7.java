import java.util.Scanner;
public class Lab7
{ public static void main(String[] args)
	{ Scanner input = new Scanner (System.in);
	  System.out.println("ป้อนเลขเมนูที่ต้องการ");
	  System.out.println("Espresso (40 บาท)............กด 1");
	  System.out.println("Americano Hot (40 บาท).......กด 2");
	  System.out.println("Americano Iced (50 บาท)......กด 3");
	  System.out.println("Latte Hot (50 บาท)...........กด 4");
	  System.out.println("Matcha Latte (60 บาท)........กด 5");
	  int menu = input.nextInt();
	  int milkMenu = 0;
	  switch (menu)
		{ case 1 : 
		  System.out.print("ค่าเครื่องดื่ม Espresso ทั้งหมด 40 บาท");
		  break;

		  case 2 : 
		  System.out.print("ค่าเครื่องดื่ม Americano Hot ทั้งหมด 40 บาท");
		  break;

		  case 3 : 
		  System.out.print("ค่าเครื่องดื่ม Americano Iced ทั้งหมด 50 บาท");
		  break;

		  case 4 : 
		  System.out.println("ป้อนเลขประเภทนมที่ต้องการ");
	  	  System.out.println("Plain Milk......................กด 1");
	  	  System.out.println("Low Fat Milk (+5 บาท)...........กด 2");
		  System.out.println("Lactose Free Milk (+8 บาท)......กด 3");
		  System.out.println("Soy  Milk (+10 บาท).............กด 4");
		  System.out.println("Almond Milk (+15 บาท)...........กด 5");
	  	  milkMenu = input.nextInt();
		  int latte = 50;
	  	  switch (milkMenu)
			{ case 1 : 
			  System.out.print("ค่าเครื่องดื่ม Latte Hot เพิ่ม Plain Milk ทั้งหมด 50 บาท");
		 	  break;

		  	  case 2 : 
			  latte += 5;
		  	  System.out.print("ค่าเครื่องดื่ม Latte Hot เพิ่ม Low Fat Milk ทั้งหมด "+latte+" บาท");
		  	  break;

		  	  case 3 : 
			  latte += 8;
		  	  System.out.print("ค่าเครื่องดื่ม Latte Hot เพิ่ม Lactose Free Milk ทั้งหมด "+latte+" บาท");
		  	  break;

		  	  case 4 :
			  latte += 10;
		  	  System.out.print("ค่าเครื่องดื่ม Latte Hot เพิ่ม Soy  Milk ทั้งหมด "+latte+" บาท");
		  	  break;

		  	  case 5 :
			  latte += 15;
		  	  System.out.print("ค่าเครื่องดื่ม Latte Hot เพิ่ม Almond Milk ทั้งหมด "+latte+" บาท");
		  	  break;

			  default : 
			  System.out.println("ตัวเลขที่ป้อนไม่มีในเมนู");
			  break;
			}
		  break;

		  case 5 : 
		  System.out.println("ป้อนเลขประเภทนมที่ต้องการ");
	  	  System.out.println("Plain Milk......................กด 1");
	  	  System.out.println("Low Fat Milk (+5 บาท)...........กด 2");
		  System.out.println("Lactose Free Milk (+8 บาท)......กด 3");
		  System.out.println("Soy  Milk (+10 บาท).............กด 4");
		  System.out.println("Almond Milk (+15 บาท)...........กด 5");
	  	  milkMenu = input.nextInt();
		  int matcha = 60;
	  	  switch (milkMenu)
			{ case 1 : 
			  System.out.print("ค่าเครื่องดื่ม Matcha Latte เพิ่ม Plain Milk ทั้งหมด 60 บาท");
		 	  break;

		  	  case 2 : 
			  matcha += 5;
		  	  System.out.print("ค่าเครื่องดื่ม Matcha Latte เพิ่ม Low Fat Milk ทั้งหมด "+matcha+" บาท");
		  	  break;

		  	  case 3 : 
			  matcha += 8;
		  	  System.out.print("ค่าเครื่องดื่ม Matcha Latte เพิ่ม Lactose Free Milk ทั้งหมด "+matcha+" บาท");
		  	  break;

		  	  case 4 :
			  matcha += 10;
		  	  System.out.print("ค่าเครื่องดื่ม Matcha Latte เพิ่ม Soy  Milk ทั้งหมด "+matcha+" บาท");
		  	  break;

		  	  case 5 :
			  matcha += 15;
		  	  System.out.print("ค่าเครื่องดื่ม Matcha Latte เพิ่ม Almond Milk ทั้งหมด "+matcha+" บาท");
		  	  break;

			  default : 
			  System.out.println("ตัวเลขที่ป้อนไม่มีในเมนู");
			  break;
			}
		  break;

		  default : 
		  System.out.println("ตัวเลขที่ป้อนไม่มีในเมนู");
		  break;
		}
	}
}