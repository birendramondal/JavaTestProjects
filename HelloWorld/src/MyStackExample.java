import java.util.Scanner;

public class MyStackExample 
{
    
	public static void main(String[] args) 
	{
		int n;
		
		
		ArrayInputUser arr = new ArrayInputUser();
		System.out.println("Enter 5 data in the array");
		arr.push();
		Scanner posi= new Scanner(System.in);
		System.out.println("    Enter the position that you want to pop in'count from 0'");
		n=posi.nextInt();
		arr.pop(n);

	}

}
