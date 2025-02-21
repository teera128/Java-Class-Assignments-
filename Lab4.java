import java.util.Scanner;
public class Lab4
{ public static void main(String[] args)
	{ Scanner input = new Scanner (System.in);
	  System.out.print("ระบุจำนวนเงินบาท (ไม่มีเศษสตางค์) ");
	  int thb = input.nextInt();
	  int aThousandBank = thb/1000;
	  int aThousand = thb%1000;
	  System.out.println("ธนบัตร 1,000 บาท จำนวน "+aThousandBank+" ใบ");

	  int fiveHunBank = aThousand/500;
	  aThousand %= 500;
	  System.out.println("ธนบัตร 500 บาท จำนวน "+fiveHunBank+" ใบ");

	  int oneHunBank = aThousand/100;
	  aThousand %= 100;
	  System.out.println("ธนบัตร 100 บาท จำนวน "+oneHunBank+" ใบ");

	  int fiftyBank = aThousand/50;
	  aThousand %= 50;
	  System.out.println("ธนบัตร 50 บาท จำนวน "+fiftyBank+" ใบ");

   	  int twentyBank = aThousand/20;
	  aThousand %= 20;
	  System.out.println("ธนบัตร 20 บาท จำนวน "+twentyBank+" ใบ");

	  int tenCoin = aThousand/10;
	  aThousand %= 10;
	  System.out.println("เหรียญ 10 บาท จำนวน "+tenCoin+" เหรียญ");

	  int fiveCoin = aThousand/5;
	  aThousand %= 5;
	  System.out.println("เหรียญ 5 บาท จำนวน "+fiveCoin+" เหรียญ");

	  int twoCoin = aThousand/2;
	  aThousand %= 2;
	  System.out.println("เหรียญ 2 บาท จำนวน "+twoCoin+" เหรียญ");

	  int oneCoin = aThousand/1;
	  aThousand %= 1;
	  System.out.println("เหรียญ 1 บาท จำนวน "+oneCoin+" เหรียญ");
	}
}