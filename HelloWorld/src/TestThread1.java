class A extends Thread
{
	public void run()
	{
		for (int i=1; i<=5;i++)
		{
			System.out.println("First threads"+i);
		}
		System.out.println("Exit from thread A");
	}
}
class B extends Thread
{
	public void run()
	{
		for (int i=1; i<=5;i++)
		{
			System.out.println("second treads"+i);
		}
		System.out.println("Exit from thread B");
	}
}
public class TestThread1 
{
public static void main(String args[])

{
	A objA= new A();
	B objB= new B();
	objA.start();
	objB.start();
}

}
