import java.io.*;
import java.util.*;
class Test
{
public static void main(Satring [] args)
{
int a,b,c;
Properties p=new properties();
FileinputStream f1=new FileInputStream("data.txt");
p.load(f1);
a=Integer.parseInt(p.getProperty("num1"));
b=Integer.parseInt(p.getProperty("num2"));
c=a+b;System.out.println(c);
}
}
