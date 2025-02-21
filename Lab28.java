import java.util.Scanner;
public class Lab28
{ public static void main(String[] args)
	{ Scanner input = new Scanner (System.in);
	double [][] score = new double[5][5];
	int stu, i;
	double [] tot = new double[5];
	double [] avg = new double[5];
	int [] grade = new int[5];
	for (stu=0; stu<5; stu++) 
		{double total=0;
		 System.out.println("กรอกคะแนนนักเรียนคนที่ "+ (stu+1));
	  	 score [stu][0]  = getHomework(input);
		 tot[0]+=score [stu][0];
	  	 score [stu][1] = getReport(input);
	  	 tot[1]+=score[stu][1];
	  	 score [stu][2] = getQuiz(input);
	  	 tot[2]+=score [stu][2];
	  	 score [stu][3] = getExam(input);
	  	 tot[3]+=score [stu][3];
	  	 for (i=0; i<4; i++)
			{ total += score[stu][i];}
		 score [stu][4] = total;
		 tot[4]+=total;
		}
	for (stu=0; stu<5; stu++) 
		 {avg[stu] = tot[stu]/5;}
   
	System.out.println("                        HW          RE           QU           FI           TOT         GRADE");
	for (stu=0; stu<5; stu++)
		{System.out.print("Student No. "+ (stu+1));
		for (i=0; i<5; i++)
			{ System.out.print("          "+score[stu][i]);}
		System.out.print("          ");
			  if (score[stu][4] < 50.0)
				{System.out.print("F"); grade[4]++;}
			  else if (score[stu][4] < 60.0)	
					{System.out.print("D"); grade[3]++;}	
				else if (score[stu][4] < 80.0)	
						{System.out.print("C"); grade[2]++;}
					else if (score[stu][4] < 90.0)	
							{System.out.print("B"); grade[1]++;}
			  			else
							{System.out.print("A"); grade[0]++;}
		System.out.println();
		}
	System.out.print("Average      ");
	for (stu=0; stu<5; stu++)
		{System.out.print("          "+avg[stu]);}
	System.out.println();
	for (stu=0; stu<4; stu++)
		{ System.out.print("Number of "+(char)('A'+stu)+" Student = ");
		  System.out.println(grade[stu]);
		}
	System.out.print("Number of F Student = ");
	System.out.println(grade[4]);

	System.out.println("จบการทำงาน");
	}
	
	public static double getHomework(Scanner input)
	{ 
	  double hWork;
	  do { System.out.print("ป้อนคะแนนการบ้าน ");
		  hWork = input.nextDouble();
		  if (hWork < 0.0 || hWork >20.0)
			{ System.out.println("ป้อนคะแนนไม่ถูกต้อง กรุณาป้อนใหม่ โดยคะแนนต้องอยู่ในช่วง 0-20");}
		}
	  while (hWork < 0.0 || hWork >20.0);
	  return hWork;
	}

	public static double getReport(Scanner input)
	{ 
	  double report;
	  do { System.out.print("ป้อนคะแนนรายงาน ");	
	 	  report = input.nextDouble();		
		  if (report < 0.0 || report >10.0)
			{ System.out.println("ป้อนคะแนนไม่ถูกต้อง กรุณาป้อนใหม่ โดยคะแนนต้องอยู่ในช่วง 0-10");}
		}
	  while (report < 0.0 || report >10.0);
	  return report;
	}

	public static double getQuiz(Scanner input)
	{ 
	  double quiz;
	  do { System.out.print("ป้อนคะแนนสอบย่อย ");
		  quiz = input.nextDouble();	
		  if (quiz < 0.0 || quiz >30.0)	  
			{ System.out.println("ป้อนคะแนนไม่ถูกต้อง กรุณาป้อนใหม่ โดยคะแนนต้องอยู่ในช่วง 0-30");}
		}
	  while (quiz < 0.0 || quiz >30.0);
	  return quiz;
	}

	public static double getExam(Scanner input)
	{ 
	  double exam;
	  do { System.out.print("ป้อนคะแนนสอบไล่ ");
		  exam = input.nextDouble();		  
		  if (exam < 0.0 || exam >40.0)
			{ System.out.println("ป้อนคะแนนไม่ถูกต้อง กรุณาป้อนใหม่ โดยคะแนนต้องอยู่ในช่วง 0-40");}
		}
	  while (exam < 0.0 || exam >40.0);
	  return exam;
	}
}	