import java.util.Scanner;
 class Cammel 
   {
	void getdata(int a, int b)
	{
	    int c,d,e;
	    c=a;
	    d=b;
	    e=c+d;
	    System.out.println("addition  "  +e);
	    
	}
   }
public class LongTest {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
        int a, b,c;
        System.out.println("Enter your first number");
        a=sc.nextInt();
        System.out.println("Enter your second number");
        b=sc.nextInt();
        Cammel obj = new Cammel();
        obj.getdata(a, b); 

	}

}
