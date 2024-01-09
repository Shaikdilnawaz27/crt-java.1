class Test
{
public static void main(String[] args)
{
try
{
System.out.println("Try block");
System.out.println(10/2);
}
catch(ArthematicException e)
{
System.out.println("Catch block");
}
finally
{
System.out.println("Finally block);
}
}
}
