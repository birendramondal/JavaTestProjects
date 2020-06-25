import java.util.Scanner;
class ArrayForQueue
     {
	     int a[]= new int[5];
	     int front=-1,rear=-1;
	  void enQueue()
	     {
		  System.out.println("Enter your 5 elements in the array");
	    	 Scanner scane = new Scanner(System.in);
	    	 for (int i=0;i<5;i++)
	    	     {
	    		    rear++;
	    		    a[i]=scane.nextInt();
	    		    		
	    	     }
	    	 System.out.println("your entered array");
	    	 for (int i=0;i<5;i++)
    	     {
	    		 rear=i;
    		    System.out.print(" "+a[i]);
    		   // System.out.println("rear "+rear);
    		    		
    	     }
	    	 
	     }
	     void deQueue(int pos)
	           {
	    	 front=pos;
	    	       for(int i=pos;i<5;i++)
	    	       {
	    	    	   System.out.print(" "+a[i]);
	    	    	   //System.out.println("front "+front++);
	    	       }
	           }  
	     
     }



public class MyQueueTest 
{

	public static void main(String[] args) 
	{
		int n;
		Scanner obj = new Scanner(System.in);
		 ArrayForQueue arr = new  ArrayForQueue();
		 arr.enQueue();
		 System.out.println("    Enter your position for dequeue");
		 n= obj.nextInt();
		 arr.deQueue(n);

	}

}
