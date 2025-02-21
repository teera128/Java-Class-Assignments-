import java.util.Scanner;

public class Account
{ public String accId;
  public double balance, interest;
  public Customer owner; 
  public Account(String accNo, double b, double i)
	{ accId = accNo;
	  balance = b;
	  interest = i;
	}

public double deposit(double depo)
	{ balance += depo;
	  System.out.println();
  	  return balance;
	}

public double withdraw(double withd)
	{ if (balance-withd <1000)
		{ System.out.println("ไม่สามารถถอนเงินได้ เนื่องจากยอดเงินคงเหลือในบัญชี ต้องไม่ต่ำกว่า 1,000 บาท"); }	
	  else 
		{ balance -= withd; }
	  System.out.println();
	  return balance;
	}

public void calin(double rate)
	{ interest = rate/100;
	  double allin = balance*interest;
	  System.out.println("ดอกเบี้ย "+rate+" ต่อปี = "+allin+" บาท");
	  System.out.println();
	}

public void showBalance()
	{ System.out.print("ยอดคงเหลือ = "+balance);
	  System.out.println();
	}

public void showDetail(String f, String s, String i)
	{ owner = new Customer(f,s,i);
	  owner.showCustomer();
	  System.out.println("เลขที่บัญชี = "+accId);
	  System.out.println("ยอดคงเหลือ = "+balance+" บาท");
	}
}
