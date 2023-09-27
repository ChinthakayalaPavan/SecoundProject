package OopsProject;

import OopsProject.A;
import OopsProject.factoryclass;
import OopsProject.pro;

interface pro
{
	public void m1();
	public void m2();
}
class A implements pro
{
	public void m1()
	{
		System.out.println("thos is m1");
	}
	public void m2()
	{
		System.out.println("this is m2");
	}
}	
class factoryclass
{
	public static pro helpermethod()
	{
		pro p1 = new A();
		return p1;
	}
}
public class Abstarction
{
	public static void main(String[] args) 
	{
		pro p2 = factoryclass.helpermethod();
		p2.m1();
		p2.m2();
	}
}
