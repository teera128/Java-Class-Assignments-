import java.util.Scanner;
public class Lab5
{ public static void main(String[] args)
	{ Scanner input = new Scanner (System.in);
	  System.out.print("ระบุค่าเช่าห้องต่อ 1 เดือน ");
	  int room = input.nextInt();

	  System.out.print("ระบุจำนวนหน่วยไฟฟ้าที่ใช้ ");
	  int elecUnit = input.nextInt();
	  int calElec = 0;
	  int elecFee = 0;
	  if (elecUnit < 101)
		{ elecFee = elecUnit*8;}
	  else if (elecUnit < 501)
			{ calElec = elecUnit%100;
			  elecFee = (calElec*9)+800;
			}
		else
			{ calElec = elecUnit%500;
			  elecFee = (calElec*10)+4400;
			}

	  System.out.print("ระบุจำนวนหน่วยน้ำประปาที่ใช้ ");
	  int waterUnit = input.nextInt();
	  int calWat = 0;
	  int waterFee = 0;
	  if (waterUnit < 6)
		{ waterFee = waterUnit*15;}
	  	else if (waterUnit < 11)
			{ calWat = waterUnit%5;
			  waterFee = (calElec*20)+75;
			}
		else
			{ calWat = waterUnit%10;
			  waterFee = (calWat*25)+175;
			}

	  System.out.print("ระบุค่า WiFi ");
	  int wifi = input.nextInt();

	  int total = room+elecFee+waterFee+wifi;

	  System.out.println("ค่าไฟฟ้า = "+elecFee+" บาท");
	  System.out.println("ค่าน้ำ = "+waterFee+" บาท");
	  System.out.println("ค่าห้องพักรวม "+total+" บาท");
	}
}