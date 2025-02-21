public class Shape 
{
	protected int positionx ; //ตํา แหน่งบนแกน x
	protected int positiony ; // ตํา แหน่งบนแกน y
	protected char color = 'B' ; // สี โดย B คือดำ R คือแดง Y คือเหลือง

	public Shape( ) 
		{ positionx = positiony = 0 ; }
	public void changeColor (char newcolor)
		{ switch (newcolor)
			{ case 'R' :
			  case 'B' :
			  case 'Y' : color = newcolor ; break ;
			  default : System.out.println("wrong color") ; break ; 
			}
		}
	public void changePosition(int newx , int newy)
		{ positionx = newx ;
		  positiony = newy ;
		}
	public void displayShape( )
		{ System.out.println("This shape is at " + positionx + " on x-axis.") ;
		  System.out.println("This shape is at " + positiony + " on y-axis.") ;
		  switch (color)
			{ case 'R' : System.out.println("This shape is red" ) ; break ;
			  case 'B' : System.out.println("This shape is black" ) ; break ;
			  case 'Y' : System.out.println("This shape is yellow" ) ; break ;
			  default : System.out.println("wrong color") ; break ; 
			}
		}
}