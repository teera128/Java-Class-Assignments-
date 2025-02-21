import java.util.Scanner;
public class Lab29
{ public static void main(String[] args)
	{ Scanner input = new Scanner (System.in);
	double [][][] sell = new double[4][5][6];
	double [][] sellsum = new double[4][5];
	double [][] mReport = new double[5][6];
	int pd, emp, month,index=0;
	double sum =0 ;
	
	for (month=0; month<6; month++) 
		{for (emp=0; emp<4; emp++) 
			{for (pd=0; pd<5; pd++) 
				{System.out.print("ป้อนยอดขายคนที่ "+ (emp+1)+" สินค้าประเภทที่ "+(pd+1)+" เดือนที่ "+(month+1)+" ");
				  sell [emp][pd][month]  = input.nextInt();
				 System.out.println();
				}
			}
		}
	for (pd=0; pd<5; pd++)
		{System.out.print("คนที่มียอดขายรวม 6 เดือน ของสินค้าประเภทที่ "+(pd+1)+" คือคนที่ ");
		 double max=0;
		 for (emp=0; emp<4; emp++) 
			{for (month=0; month<6; month++)
			 	{sellsum[emp][pd]+= sell [emp][pd][month];
				}
			}
		for (emp=0; emp<4; emp++) 
			{ if (sellsum[emp][pd]>max)
				{max=sellsum[emp][pd];
				 index = emp;
				}
			}
		 System.out.print((index+1));
		 System.out.println();
		}
	 System.out.println();

	 for (pd=0; pd<5; pd++)
		{ for (month=0; month<6; month++)
			{ sum=0;
			  for (emp=0; emp<4; emp++) 
				{ sum+=sell[emp][pd][month];
			  	  mReport[pd][month]=sum;
				}
			  System.out.println("สินค้าประเภทที่ "+(pd+1)+" มียอดขายรวมในเดือนที่ "+(month+1)+" " +sum+" บาท");
			}
	 	  System.out.println();

		}
	}
}
		
