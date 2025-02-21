import java.util.Scanner;
public class Lab11
{ public static void main(String[] args)
	{ Scanner input = new Scanner (System.in);
	int roomNo, room, elecUnit, calElec, elecFee, waterUnit, calWat, waterFee, wifi, total, nxRoom;
	do {
	  	System.out.print("ระบุหมายเลขห้อง ");
	  	roomNo = input.nextInt();

	  	System.out.print("ระบุค่าเช่าห้องต่อ 1 เดือน ");
	  	room = input.nextInt();

	  	System.out.print("ระบุจำนวนหน่วยไฟฟ้าที่ใช้ ");
	  	elecUnit = input.nextInt();
	  	calElec = 0;
	 	elecFee = 0;
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
	  	waterUnit = input.nextInt();
	  	calWat = 0;
	  	waterFee = 0;
	  	if (waterUnit < 6)
			{ waterFee = waterUnit*15;}
	  		else if (waterUnit < 11)
				{ calWat = waterUnit%5;
			  	  waterFee = (calWat*20)+75;
				}
			else
				{ calWat = waterUnit%10;
				  waterFee = (calWat*25)+175;
				}

	  	System.out.print("ระบุค่า WiFi ");
	  	wifi = input.nextInt();

	  	total = room+elecFee+waterFee+wifi;

	  	System.out.println("ค่าไฟฟ้า = "+elecFee+" บาท");
	  	System.out.println("ค่าน้ำ = "+waterFee+" บาท");
	  	System.out.println("ค่าห้องพักรวม "+total+" บาท");

		System.out.print("ต้องการคำนวนค่าห้องอื่นหรือไม่ ต้องการ กด 9 หากไม่ต้องการกดเลขอื่น ");
		nxRoom = input.nextInt();
	}
	while (nxRoom == 9);
	System.out.println("จบโปรแกรม");
	}
}