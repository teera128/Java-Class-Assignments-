import java.util.Scanner;
public class Lab3
{ public static void main(String[] args)
	{ Scanner input = new Scanner (System.in);
	  System.out.print("ระบุค่าเช่าห้องต่อ 1 เดือน ");
	  int room = input.nextInt();
	  System.out.print("ระบุจำนวนหน่วยไฟฟ้าที่ใช้ ");
	  int elec = input.nextInt();
	  int elecFee = elec*10;
	  System.out.print("ระบุจำนวนหน่วยน้ำประปาที่ใช้ ");
	  int water = input.nextInt();
	  int waterFee = water*15;
	  System.out.print("ระบุค่า WiFi ");
	  int wifi = input.nextInt();
	  int total = room+elecFee+waterFee+wifi;
	  System.out.println("ค่าไฟฟ้า = "+elecFee+" บาท");
	  System.out.println("ค่าน้ำ = "+waterFee+" บาท");
	  System.out.println("ค่าห้องพักรวม "+total+" บาท");
	}
}
