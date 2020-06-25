class Test
{
	void cont()
	  {
		
		System.out.println("Inside the Test");
	  }
}


 class ObjectTest 
{
	public static void show(Test tobj)
	{
		tobj.cont();
	}
	public static void main(String ar[])
	{
		Test q = new Test();
		show(q);

	}
	

}
