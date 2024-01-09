class MyThread extends Thread
{
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println("Userdifined Thread");
}
}
}
class Test
{
public static void main(String[] args)
{
MyThread t=new Thread();
t.start();
for(i=0;i<10;i++)
}
System.out.println("main Thread");
}
}
}
