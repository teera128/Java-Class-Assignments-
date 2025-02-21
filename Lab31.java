import java.util.Scanner;
public class Lab31
{ public static void main(String[] args)
	{ Scanner input = new Scanner (System.in);
	  int i, guess;
	  int rnd = 0;
	  String newGm;
	  boolean chk = true;
	  int [] num = new int[10];

	  do
		{ for (i = 0; i < 10; i++)
			{ num[i] = 1 + (int)( Math.random( ) * 100 );
			}
		  System.out.println("GUESS NUMBER");
		  chk = true; rnd = 0;

		  do 
			{ System.out.print("PRESS NUMBER   ");
			  guess = input.nextInt(); 
			  for (i = 0; i < 10; i++) 
				{ if ( guess == num[i] )
                  			{ chk = false;
                      			  System.out.print("CONGRATULATION");
                    			  System.out.println(); 
					  for (i = 0; i < 10; i++)
						{ System.out.print(num[i]+" / "); }
					  System.out.println(); 
					}
				}
			  if ( chk==true) 
				{ System.out.println("MISSING"); 
				  System.out.println(); 
				}
			  rnd++;
			}
		  while (chk && rnd < 5);

		  if ( chk==true ) 
			{ System.out.println("GAME OVER");
		  	  System.out.print("Ten numbers that you missed are following ");
			  for (i = 0; i < 10; i++)
				{ System.out.print(num[i]+" / "); }
			  System.out.println();
			}
          	  System.out.print("If you wanna play again, please press 1. Unless, please press others for end. ");
		  newGm = input.next();
		}
	while (newGm.equals("1"));
	}
}



