package objectLessons.example.inheritance;

//无参数constructor 在继承里的隐式调用的例子
class Base {
  public Base() {
    System.out.println("Base Class Constructor Called ");
  }
}


public class Derived extends Base {
  public Derived() {
    System.out.println("Derived Class Constructor Called ");
  }

  public static void main(String[] args) {
    Derived demo = new Derived();
  }
}
