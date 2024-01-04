class Sample
{
    int a=10;
    static int b=20;
    void m1()
    {
    System.out.println("a="+a+" b="+b);
    }
    void m2()
    {
        Sample s=new Sample();
    System.out.println("a="+a+" b="+b);
    }
	public static void main(String[] args) 
	{
	 Sample s1=new Sample();
	 s1.m1();
	 s1.m2();
	}
}
