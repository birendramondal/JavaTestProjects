import java.util.Scanner;
public class ArrayTest
{
	public static void main(String args[])
	{
		int r,c,i,j;
		System.out.println("Enter the no. of row");
		Scanner sc=new Scanner(System.in);
		    r=sc.nextInt();
		System.out.println("Enter the no. of Colum");
		    c=sc.nextInt();
		int a[][]= new int[r][c];
		{
			for (i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					System.out.println("Enter no for Row "+i+" and Column"+j+"");
					a[i][j]=sc.nextInt();
				}
			}
			for (i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					System.out.println("First matrix with "+i+"_"+j+"    "+a[i][j]);
					
				}
			}
		}
				
	}
}