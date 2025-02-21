import java.util.Scanner;
public class Lab9
{ public static void main(String[] args)
	{ Scanner input = new Scanner (System.in);
	  System.out.print("ระบุจำนวนเงินบาท (ไม่มีเศษสตางค์) ");
	  int thb = input.nextInt();
	  int aThousandBank = thb/1000;
	  int aThousand = thb%1000;

	  int fiveHunBank = aThousand/500;
	  aThousand %= 500;
	  int oneHunBank = aThousand/100;
	  aThousand %= 100;
	  int fiftyBank = aThousand/50;
	  aThousand %= 50;
   	  int twentyBank = aThousand/20;
	  aThousand %= 20;
	  int tenCoin = aThousand/10;
	  aThousand %= 10;
	  int fiveCoin = aThousand/5;
	  aThousand %= 5;
	  int twoCoin = aThousand/2;
	  aThousand %= 2;
	  int oneCoin = aThousand/1;
	  aThousand %= 1;

	  if (aThousandBank !=0)
	  System.out.println("ธนบัตร 1,000 บาท จำนวน "+aThousandBank+" ใบ");
	  if (fiveHunBank !=0)
	  System.out.println("ธนบัตร 500 บาท จำนวน "+fiveHunBank+" ใบ");
	  if (oneHunBank !=0)
	  System.out.println("ธนบัตร 100 บาท จำนวน "+oneHunBank+" ใบ");
	  if (fiftyBank !=0)
	  System.out.println("ธนบัตร 50 บาท จำนวน "+fiftyBank+" ใบ");
	  if (twentyBank !=0)
	  System.out.println("ธนบัตร 20 บาท จำนวน "+twentyBank+" ใบ");
	  if (tenCoin !=0)
	  System.out.println("เหรียญ 10 บาท จำนวน "+tenCoin+" เหรียญ");
	  if (fiveCoin !=0)
	  System.out.println("เหรียญ 5 บาท จำนวน "+fiveCoin+" เหรียญ");
	  if (twoCoin !=0)
	  System.out.println("เหรียญ 2 บาท จำนวน "+twoCoin+" เหรียญ");
	  if (oneCoin !=0)
	  System.out.println("เหรียญ 1 บาท จำนวน "+oneCoin+" เหรียญ");


	}
}