class First
{
  void m1()
  {
    System.out.println("m1 Method in First class");
  }
  void m2()
  {
    System.out.println("m2 Method in First class");
  }
}
  
 class Second extends First
 {
   void m3()
   {
     
     System.out.println("m3 Method in Second class");
   }
 }
  class Test
  {
    public static void main(String[] args)
    {
      Second s1=new Second();
      s1.m1();
      s1.m2();
      s1.m3();
    }
  }
  
