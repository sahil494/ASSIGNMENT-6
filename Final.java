final class A
{
A()
{
System.out.println("can't extend me!");
}
}
class Final
{
public static void main(String[] args)
{
A a=new A();
}
}
