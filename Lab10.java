import java.util.Scanner;
public class Lab10
{ public static void main(String[] args)
	{ Scanner input = new Scanner (System.in);
	  System.out.print("ระบุเงินเดือน 1 เดือน ");
	  double sal = input.nextDouble();

	  System.out.print("ระบุรายได้พิเศษ ");
	  double exSal = input.nextDouble();

	  System.out.print("ระบุค่าประกันชีวิต ");
	  double insur = input.nextDouble();
	  if (insur>100000.00)
	  insur = 100000.00;

	  System.out.print("ระบุเงินบริจาค ");
	  double donate = input.nextDouble();
	  double ifDonate = ((sal*12)+exSal)*0.05;
	  if (donate > ifDonate)
	  donate = ifDonate;

	  System.out.print("ระบุจำนวนบุตร ");
	  double child = input.nextDouble();

	  double income = (sal*12)+exSal-60000-insur-donate-(17000*child);

	  double ndStep = 0;
	  double rdStep = 0;
	  double forStep = 0;
	  double fifStep = 0;
	  double tax = 0;
	  if (income < 100001)
		{ tax = 0;}
	  	else if (income < 300001)
			{ ndStep = income-100000;
			  tax = ndStep*0.05;
			}
		else if (income < 500001)
			{ rdStep = income%300000;
			  tax = (rdStep*0.1)+10000;
			}
		else if (income < 1000001)
			{ forStep = income%500000;
			  tax = (forStep*0.15)+30000;
			}
		else 
			{ fifStep = income%1000000;
			  tax = (fifStep*0.2)+100500;
			}

	  System.out.println("รายได้สุทธิ = "+income+" บาท");
	  System.out.println("ภาษีที่คำนวนได้จากรายได้สุทธิ = "+tax+" บาท");

	}
}