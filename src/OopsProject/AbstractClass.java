package OopsProject;

abstract class demo
{
     abstract public void m1();
     abstract public void m2();
}
class demo1 extends demo
{
     public void m1()
     {
          System.out.println("good mornig");
     }
     public void m2()
     {
          System.out.println("good evening");
     }
}
class AbstractClass
{
     public static void main(String[] args)
     {
          demo1 d1 = new demo1();
          d1.m2();
     }
}