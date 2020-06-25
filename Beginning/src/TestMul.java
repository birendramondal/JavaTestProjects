class Apple
 {
	void appleColor(String a)
	  {
		String b;
		b=a;
		System.out.println("Color word " +b);
		
		
	  }
 }
class BitWise
{
	void show()
	{
	int a =25;
	int b =10;
	int c = a|b;
	int d,e,f;
	d=a&b;
	e=a^b;
	f=~b;
	System.out.println("AND Operation "+c);
	System.out.println("OR Operation "+d);
	System.out.println("XOR Operation "+e);
	System.out.println("One's Compliment "+f);
	}
}

class Pattern
  {
	/**
	 * 1 2 3 4 
	 * 2 3 4 1
	 * 3 4 1 2
	 * 4 1 2 3
	 * 
	 * 
	 * 1
	 * 0 1
	 * 1 0 1
	 * 0 1 0 1
	 * 1 0 1 0 1
	 */
	  void show1()
	     {
		  int b=0;
		  for (int y=1; y<=7; y++) //y axis
		    {
			  
			  for (int x=1; x<=y;x++) // x axis
			    {
				  
				  if (b == 1)
				     {
					  System.out.print("1 ");
					  b= 0;
				     }
				  else if (b==0)
				  {
					  System.out.print("0 ");
					  b= 1;
					  
				  }
				  
			    }
			  System.out.println("");
		    }
		  
	     }
	  
	  
	  
	  
	  
    void show2()
    {
	 
	  for (int y=1; y<=7; y++) //y axis
	    {
		  
		  for (int x=1; x<=y;x++) // x axis
		    {
			  
			  if ((x+y)%2 ==0)
			    {
				  System.out.print("1 ");
			    }
			  else 
				  System.out.print("0 ");
			  
		    }
		  System.out.println("");
	    }
	  
     }
	  
	  
	  
}


class TestExtend extends Apple
  {
	void Rewrite(String s)
	   {
		String j =s;
		System.out.print(j);
	   }
  }


class TestMul
{
	
	
	public static void main(String ar[])
	{
		/**
		BitWise b = new BitWise();
		b.show();
		Apple a = new Apple();
		a.appleColor("Red");
		*/
		Pattern p1 = new Pattern();
		p1.show1();
		System.out.println("\n");
		p1.show2();
		
		TestExtend te = new TestExtend();
		te.appleColor("Extend");
		te.Rewrite("Text extend");
		
	}

}
