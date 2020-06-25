class Apple
{
  String color;
  int quantity;
   Apple(String x, int y )
   {
	   color=x;
	   quantity=y;
	   String p=x+y;
	   System.out.println("Color of apple and quantity"+p);
	   
   }
}
public class Constructor 
{
     public static void main(String args[])
     {
    	
		Apple obj= new Apple("green",10);
    	
     }
}
