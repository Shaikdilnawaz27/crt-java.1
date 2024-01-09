
import java.io.*;
import java .util.*;
class Test
{
public static void main(String[] args)throws Exception
{
FileReader f1=new FileReader("names.txt");
BufferedReader b1=new BufferedReader(f1);
Scanner s=new Scanner(System.in);
System.out.println("Enter name to search");
String name=s.next();
String str=b1.readLine();
while(str1=null)
{
if(name.equals(str))
{
System.out.println("name is exist");
}
str=b1.readLine();
}
b1.close();
f1.close();
}
}
