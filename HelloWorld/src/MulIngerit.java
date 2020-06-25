class Student
{
     	int m1,m2;
     	void getdata(int x, int y)
     	{
     		m1=x;
     		m2=y;
     	}
     	void show()
     	{
     		System.out.println("First"+m1+" Second"+m2+"");
     	}
}

interface Sports 
{
     int sp=6;
     void showspmarks();
}
class Result extends Student implements Sports
{
       public void showspmarks() 
       {
    	    System.out.println("Sport marks"+sp);
       }	
       void displayresult()
       {
    	   show();
    	   showspmarks();
    	   int total=m1+m2+sp;
    	   System.out.println("Total result"+total);
       }
}




public class MulIngerit 
{

	public static void main(String[] args) 
	{
		Result obj= new Result();
		obj.getdata(5,8);
		obj.show();
		obj.displayresult();
		
	}

}
