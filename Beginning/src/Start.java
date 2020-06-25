import java.util.Scanner;

abstract class Account
{
    long acnum=0;
    void getData(long a)
    {
    	acnum=a;
    }
    int display()
    {
    	System.out.println("Its from class Account");
    	return 0;
    }
 }
class Saving extends Account
     {
	int a=0;
	@Override
	   int display()
	   {
		   System.out.println("your Saving Acoount number is "+acnum);
		   return 0;
	   }
	
	  int ammount(int p)
	  {
		  a=p+(p/10);
		  System.out.println("your saving balance with 10% interest rate is ₹"+a);
		  
		  return 0;
      }
     }

class Current extends Account
     {
	int a=0;
    @Override
       int display()
       {
	        System.out.println("your Current Acoount number is "+acnum);
	        return 0;
       } 
	        int ammount(int p)
	  	  {
	  		  a=p+((9*p)/100);
	  		  System.out.println("your current balance with 9% interst rate is ₹"+a);
	  		  
	  		  return 0;
	        
  }
}

class Start 
{
	public static void main(String ar[])
	{
		long c,s;
		int ac,as;
		
		Scanner sc1= new Scanner(System.in);
		Scanner sc2= new Scanner(System.in);
		Scanner sc3= new Scanner(System.in);
		Scanner sc4= new Scanner(System.in);
		System.out.println("Enter your saving account number");
		s=sc1.nextLong();
		System.out.println("Enter your current account number");
		c=sc2.nextLong();
		System.out.println("Enter your Saving ammount");
		ac=sc3.nextInt();
		System.out.println("Enter your current account");
		as=sc4.nextInt();
	  Saving sv= new Saving();
	  sv.getData(s);
	  sv.display();
	  sv.ammount(ac);
	  Current ca= new Current();
	  ca.getData(c);
	  ca.display();
	  ca.ammount(as);
	  
	}
}
