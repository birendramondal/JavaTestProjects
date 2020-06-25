import java.util.Scanner;
public class ArrayInputUser
{
    int top=-1;
    int pos;
    int a[]= new int[5];
    void push()
    {
   	 Scanner sc= new Scanner(System.in);
   	 System.out.println("Enter your Elements");
   	 
   	 for(int i=0; i<5;i++)
   	 {
   		 top++;
   		 a[i]=sc.nextInt();
   	 }
   	 System.out.println("your printed array ");
   	 for(int i=0;i<5;i++)
   	 {
			top=i;
			System.out.print(" "+a[i]);
			//System.out.println("top "+top++);
   	 }
    }
    void pop(int pos)
    {
   	 this.pos=pos;
   	 System.out.println("Enter your position"+pos);
   	 for(int i=0;i<pos;i++)
   	 {
   		top= pos;
   		
   		System.out.print(" "+a[i]);
   		//System.out.println("top "+top);
   		 
   	 }
   	 
    }
    
}