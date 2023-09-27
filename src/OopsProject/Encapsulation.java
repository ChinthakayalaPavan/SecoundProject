package OopsProject;
public class Encapsulation
{
     private String name;
     private int age;
  public void Encapsulation(String name, int age)
  {
     this.name = name;
     this.age = age;
  }
  public void setName(String newName)
  {
     name = newName;
  }
  public void setAge(int newAge)
  {
     age = newAge;
  }
  public String getName()
  {
     return name;
  }
  public int getAge()
  {
     return age;
  }
   public static void main(String[] args) {
    	Encapsulation a1 = new Encapsulation();
        a1.Encapsulation("pavan",23);
        System.out.println(a1.getName());
        System.out.println(a1.getAge());
       
    }
}
