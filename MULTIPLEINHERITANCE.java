

class Student
{
  int admno;
  String name;
  void get(int admno,String name)
  {
    this.admno=admno;
    this.name=name;
  }
  void show()
  {
    System.out.println("Admission no="+admno);
    System.out.println("Name="+name);
  }
}
  
 class Marks extends Student
 {
   int mat,phy,che;
   void getMarks(int mat,int phy,int che)
   {
    this.mat=mat;
    this.phy=phy;
    this.che=che;
   }
   void showMarks()
   {
    System.out.println("Maths="+mat);
    System.out.println("Physics="+phy);
    System.out.println("Chemistry="+che);
    System.out.println("Total="+(mat+phy+che));
    System.out.println("Average="+(mat+phy+che)/3);
   }          
 }
 class Result extends  Marks
 {
     void showResult()
     {
         System.out.println("Total="+(mat+phy+che));
         System.out.println("average="+(mat+phy+che)/3);
     }
 }
class Single
  {
    public static void main(String[] args)
    {
     Result r1=new Result();
     r1.get(402,"NAWAZ");
     r1.getMarks(89,98,89);
     r1.show();
     r1.showMarks();
     r1.showResult();
    }
  }
  
