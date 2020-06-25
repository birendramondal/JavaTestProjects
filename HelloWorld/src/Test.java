import java.util.*;
public class Test {

	public static void main(String[] args)
	{
	int n,i;
	int a[];
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the range of your array");
	n= sc.nextInt();
	a= new int[n];
	for (i=0;i<n;i++)
	{
	    System.out.println("enter the elements in your array");
		a[i]=sc.nextInt();
	}
	// print array
	for (i=0;i<n;i++)
	{
	    System.out.println("your array"+a[i]);
	}
	// operation
	for(i=0;i<n;i++)
	{
		a[i]=a[i]*i;
	}
	for (i=0;i<n;i++)
	{
	    System.out.println("your array"+a[i]);
	}
	
	
	
	
	}

}
