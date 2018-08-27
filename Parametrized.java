class Base
{
Base()
{
System.out.println("called by parametrized constructor");
}
Base(int x)
{
this();
}
}
class Parametrized
{
public static void main(String[] args)
{
Base b=new Base(2);
}
}