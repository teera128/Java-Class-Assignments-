public class Customer
{ public String fname, sname, id;
  public Customer(String f, String s, String i)
	{ 
	  fname = f;
	  sname = s;
	  id= i;
	}

public void addId(String numi)
	{ id = numi;
	  System.out.println();
	}

public void editFname(String eFn)
	{ fname = eFn;	
	  System.out.println();
	}
public void editSname(String eSn)
	{ sname = eSn;	
	  System.out.println();
	}
 
public String callFname()
	{ return fname;}

public String callSname()
	{ return sname;}

public void showCustomer()
	{ System.out.print("ชื่อ "+fname);
	  System.out.print(" นามสกุล "+sname);
	  System.out.println();
	  System.out.println("เลขบัตรประจำตัวประชาชน "+id);
	}
}


	