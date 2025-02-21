import java.util.Scanner;
public class Lab30
{ public static void main(String[] args)
	{ Scanner input = new Scanner (System.in);
	  int [] num = new int[10];
	  int atMax, atMin;
	  double avg;
	  System.out.println("ป้อนเลขจำนวนเต็ม 10 เลข ");
	  for (int i = 0; i < 10; i++)
		{ System.out.print("ป้อนเลขจำนวนเต็มเลขที่ "+(i+1)+" ");
		  num[i] = input.nextInt();
		}
	  System.out.println();

	  System.out.println("จำนวนเต็มทั้งหมดใน Array มีดังนี้");
	  for (int i = 0; i < 10; i++)
		{ System.out.print(num[i]+" ");}
	  System.out.println();

	  atMax = findMax(num);
	  System.out.println("ตำแหน่งที่เก็บของจำนวนเต็มที่มากที่สุด คือ ตำแหน่งที่ "+(atMax+1));
	  System.out.println();

	  atMin = findMin(num);
	  System.out.println("ตำแหน่งที่เก็บของจำนวนเต็มที่น้อยที่สุด คือ ตำแหน่งที่ "+(atMin+1));
	  System.out.println();

	  avg = findAverage(num);
	  System.out.println("ค่าเฉลี่ยของจำนวนเต็ม 10 จำนวน = "+avg);
	}

	public static int findMax(int[ ] anArray)
	{ int max = anArray[0];
	  int atMax=0;
	  for(int x = 0; x < 10; x++)
		{ if (max < anArray[x])
			{ max = anArray[x];
			  atMax = x;
			}
		}
	  System.out.println("จำนวนเต็มที่มากที่สุด = "+max);
	  return atMax;
	}

	public static int findMin(int[ ] anArray)
	{ int min = anArray[0];
	  int atMin=0;
	  for(int x = 0; x < 10; x++)
		{ if (min > anArray[x])
			{ min = anArray[x];
			  atMin = x;
			}
		}
	  System.out.println("จำนวนเต็มที่น้อยที่สุด = "+min);
	  return atMin;
	}

	public static double findAverage(int[ ] anArray)
	{ double avg;
	  int sum = 0;
	  for(int x = 0; x < 10; x++)
		{ sum+=anArray[x];}
	  avg = sum/10;
	  return avg;
	}
}



