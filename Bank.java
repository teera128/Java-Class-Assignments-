import java.util.Scanner;
public class Bank
{ public static void main(String[] args)
	{ Scanner input = new Scanner (System.in);
	  double balance, withdraw , deposit, rate, openAcc;
	  String sname, fname,id;
	  System.out.println("เปิดบัญชีที่ 1");
	  System.out.print("ป้อนชื่อจริง ");
	  fname = input.next();	
	  System.out.println();
	  System.out.print("ป้อนนามสกุล ");
	  sname = input.next();	
	  System.out.println();
	  System.out.print("ป้อนหมายเลขประจำตัวประชาชน ");
	  id = input.next();
	  do
		{ System.out.print("ป้อนจำนวนเงินที่ต้องการฝากเพื่อเปิดบัญชี ");
	  	  openAcc = input.nextDouble();
	  	  if (openAcc<1000)	
			{ System.out.println("ต้องฝากเงินเพื่อเปิดบัญชี ไม่ต่ำกว่า 1,000 บาท");}
		}
	  while(openAcc<1000);

	  System.out.print("ป้อนอัตราดอกเบี้ย(%) ");
	  rate = input.nextDouble();

	  Customer cus1 = new Customer (fname,sname,"0");
	  cus1.addId(id);

	  Account acc1 = new Account("001", openAcc , rate);

	  System.out.println("ฝากเงิน ");
	  System.out.print("ป้อนจำนวนเงินที่ต้องการฝาก ");
	  deposit = input.nextDouble();
	  balance = acc1.deposit(deposit);

	  System.out.println("ถอนเงิน ");
	  System.out.print("ป้อนจำนวนเงินที่ต้องการถอน ");
	  withdraw = input.nextDouble();		
	  balance = acc1.withdraw(withdraw);

	  System.out.print("แก้ไขชื่อ ");
	  fname = input.next();	
	  cus1.editFname(fname);

	  System.out.print("แก้ไขนามสกุล ");
	  sname = input.next();	
	  cus1.editSname(sname);

	  acc1.calin(rate);
	  acc1.showDetail(fname,sname,id);
	  System.out.println();

	  /*System.out.println("เปิดบัญชีที่ 2");
	  System.out.print("ป้อนชื่อจริง ");
	  fname = input.next();	
	  System.out.println();
	  System.out.print("ป้อนนามสกุล ");
	  sname = input.next();	
	  System.out.println();
	  System.out.print("ป้อนหมายเลขประจำตัวประชาชน ");
	  id = input.next();
	  do
		{ System.out.print("ป้อนจำนวนเงินที่ต้องการฝากเพื่อเปิดบัญชี ");
	  	  openAcc = input.nextDouble();
	  	  if (openAcc<1000)	
			{ System.out.println("ต้องฝากเงินเพื่อเปิดบัญชี ไม่ต่ำกว่า 1,000 บาท");}
		}
	  while(openAcc<1000);

	  System.out.print("ป้อนอัตราดอกเบี้ย(%) ");
	  rate = input.nextDouble();

	  Customer cus2 = new Customer (fname,sname,"0");
	  cus2.addId(id);

	  Account acc2 = new Account("002", openAcc , rate);

	  System.out.println("ฝากเงิน ");
	  System.out.print("ป้อนจำนวนเงินที่ต้องการฝาก ");
	  deposit = input.nextDouble();
	  balance = acc2.deposit(deposit);

	  System.out.println("ถอนเงิน ");
	  System.out.print("ป้อนจำนวนเงินที่ต้องการถอน ");
	  withdraw = input.nextDouble();		
	  balance = acc2.withdraw(withdraw);

	  System.out.print("แก้ไขชื่อ ");
	  fname = input.next();	
	  cus2.editFname(fname);

	  System.out.print("แก้ไขนามสกุล ");
	  sname = input.next();	
	  cus2.editSname(sname);

	  acc2.calin(rate);
	  acc2.showDetail(fname,sname,id);
	  System.out.println();*/
	}
}