class Parent
{
void value()
{
System.out.println("enter in parent class");
}
}
class child extends Parent
{
void value()
{
Super.value();
System.out.println("Enter in child class");
}
}
class Inv
{
public static void main(String[] args)
{
child c=new child();
c.value();
System.out.println("without object");
}
}