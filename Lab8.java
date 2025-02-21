import java.util.Scanner;
public class Lab8
{ public static void main(String[] args)
	{ Scanner input = new Scanner (System.in);
	  System.out.print("ป้อนเวลาเข้า (ชม.) ");
	  int comeHour = input.nextInt();
	  System.out.print("ป้อนเวลาเข้า (นาที) ");
	  int comeMin = input.nextInt();
	  System.out.println("เวลาเข้าจอด "+comeHour+" นาฬิกา "+comeMin+" นาที");
	  System.out.print("ป้อนเวลาออก (ชม.) ");
	  int outHour = input.nextInt();
	  System.out.print("ป้อนเวลาออก (นาที) ");
	  int outMin = input.nextInt();
	  System.out.println("เวลาออก "+outHour+" นาฬิกา "+outMin+" นาที");
	  comeMin += comeHour*60;
	  outMin += outHour*60;
	  double parkMin = outMin-comeMin;
	  System.out.println("จำนวนนาทีที่จอด "+parkMin+" นาที");
	  double parkFee;

	  double ndRound = 0;
	  double rdRound = 0;
	  double forRound = 0;	  
	  if (parkMin < 31)
		{parkFee = 0;}
	  else if (parkMin < 121)
			{ ndRound = parkMin-30;
			  parkFee = ndRound*1.00;
			}
		else if (parkMin < 241)
				{ rdRound = parkMin%120;
				  parkFee = (rdRound*1.50)+90;
				}
			else 
				{ forRound = parkMin%240;
				  parkFee = (forRound*2.00)+270;
				}

	  System.out.println("ค่าจอดรถ = "+parkFee+" บาท");
	}
}
