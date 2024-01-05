

class Data
{
  int a,b;
  void get(int a,int b)
  {
    this.a=a;
    this.b=b;
  }
  void show()
  {
    System.out.println("a="+a+" b="+b);
  }
}
  
 class Addition extends Data
 {
   void Total()
   {
    System.out.println("ADDITION="+(a+b));
   }          
 }
 class Multiply extends  Data
 {
     void product()
     {
         System.out.println("PRODUCT="+(a*b));
     }
 }
class Single
  {
    public static void main(String[] args)
    {
     Addition a1=new Addition();
     a1.get(402,563);
     a1.show();
     a1.Total();
     Multiply m1=new Multiply();
     m1.get(22,34);
     m1.show();
     m1.product();
    }
  }
  
