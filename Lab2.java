import java.util.Scanner;
public class Lab2
{ public static void main(String[] args)
	{ Scanner input = new Scanner(System.in);
	  System.out.println("ระบุยอดรวมค่าอาหาร (บาท)");
	  double cost = input.nextDouble();
	  System.out.println("ระบุ % ส่วนลด");
	  double discount = input.nextDouble();
	  discount = cost*(discount/100.0);
	  double decost = cost-discount;
	  double charge = decost*(0.1);
	  double vat = (decost+charge)*(0.07);
	  double total = decost+charge+vat;
	  System.out.println("ค่าอาหารหลังหักส่วนลด "+decost+" บาท");
	  System.out.println("Service Charge ของค่าอาหารหลังหักส่วนลด "+charge+" บาท");
	  System.out.println("VAT 7% "+vat+" บาท");
	  System.out.println("ค่าอาหารที่ต้องชำระ "+total+" บาท");
	}
}