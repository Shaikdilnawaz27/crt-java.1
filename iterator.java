import java.util.*;
class Test
{
public static void main(String[] args )
{
Vector v=new Vector();
for(int i=1;i<=10;i++)
{
v.addElements(i);
}
Iterator e=v.iterator();
while (e.hasNext())
{
System.out.println(e.next());
}
}
