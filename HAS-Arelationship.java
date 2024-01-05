class Firstyear
{
  void branch()
  {
    System.out.println("ECE");
  }
  void subjects()
  {
    System.out.println("PHY FEC MATHS");
  }
  void backlogs()
  {
    System.out.println("PHY");
  }
}
 class Secondyear
 {
   void subjects()
   {
     Firstyear f1=new Firstyear();
     f1.branch();
     f1.backlogs();
     System.out.println("AC EE JAVA");
   }
 }
  class Test
  {
    public static void main(String[] args)
    {
      Secondyear s1=new Secondyear();
      s1.subjects();
    }
  }
  
