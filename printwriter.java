import java.io.*;
import java .util.*;
class Test
{
public static void main(String[] args)throws Exception
{
Scanner s=new Scanner(Syatem.in);
int admno,mat,phy,che,tot,avg;
String name;
Syatem.out.println(""enter admno");
admno=s.nextInt();
Syatem.out.println("Enter name");
name=s.next();
System.out.println("Enter 3 subjects marks");
mat=s.nextInt();
phy=s.nextInt();
che=s.nextInt();
Printwriter p1=new printWriter("student.txt");
p1.println("admmission no="+admno);
p1.println("Name="+name)
p1.println("Maths="+mat)
p1.println('Physics="+phy)
p1.println("Chemistry="+che)
p1.println("Total="+tot)
p1.println("Average="+avg)
p1.close();
}
}

