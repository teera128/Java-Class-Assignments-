import java.util.Scanner;
public class Lab1
{ public static void main(String[] args)
	{ Scanner input = new Scanner(System.in);
	  System.out.print("กรุณาป้อนอัตราแลกเปลี่ยนเงินบาทไทย ");
	  double thb = input.nextDouble();
	  System.out.print("กรุณาป้อนจำนวนเงินสกุลต่างชาติ ");
	  double rate = input.nextDouble();
	  System.out.print("กรุณาใส่จำนวนเงินไทยบาทที่ต้องการเปลี่ยน ");
	  double moneyth = input.nextDouble();
	  double changedMoney = moneyth/(thb/rate);
	  System.out.print("จำนวนเงิน " + moneyth +" บาท แปลงเป็นเงินสกุลต่างชาติได้ " + changedMoney);
	}
}
		