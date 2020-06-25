import java.util.Scanner;

class Home 
   {
	
	     int a,b,v;
	    	void area(int x, int y)
		  {
			
			a =x;
			b =y;
			
			System.out.println("Area " +(a*b));
		  }
		
		
		
		   void volume(int x, int y, int z)
		     {
			   
			  
			  v =x*y*z;
			  System.out.println("Volume "+v);
		     }
	  
   }

abstract class Room
  {
	public abstract void dimension() ;
  }

class Bedroom extends Room
    { 
	
	   
	   private Scanner sc;

	public void dimension()
	      {
		   
		   int x,y,z;
			sc = new Scanner(System.in);
			System.out.println("Enter the Leanth, Beadth and height");
			x=sc.nextInt();
			y=sc.nextInt();
			z=sc.nextInt();
			Home h = new Home();
			h.volume(x, y, z);
			h.area(x, y);
			System.out.println("Dimention for Bedroom");
		   
	      }
	
    }


class Kitchenroom extends Room
{ 

   private Scanner sc;

public void dimension()
      {
	   int x,y,z;
		sc = new Scanner(System.in);
		System.out.println("Enter the Leanth, Beadth and height");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		Home h = new Home();
		h.volume(x, y, z);
		h.area(x, y);
	   System.out.println("Dimention for Kitchen Room");
      }

}




public class TestFile {

	public static void main(String[] args) 
	{
		Bedroom bed = new Bedroom();
		Kitchenroom kit = new Kitchenroom();
		
		show(kit);
		
		
		
	}
	
	public static void show(Room objr)
	   {
		
	    objr.dimension();
	   }

}
