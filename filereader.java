import java.io.*;
class Test
{
public static void main(String[] args)throws Exception
{
FileReader f1=new  FileReader("abc.txt");
int ch;
ch=f1.read;
while(ch!=-1)
{
System.out.print(ch);    
ch=f1.read();                                          
}
f1.close();
}
}
