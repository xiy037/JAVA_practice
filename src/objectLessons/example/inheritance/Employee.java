package objectLessons.example.inheritance;
import java.time.LocalDate;

abstract class Person {
  private String name;
  public Person(String x) {
    this.name = x;
  }
  public String getName() {
    return name;
  }
  public abstract String getDescription();
}

public class Employee extends Person {
  private int salary;
  public Employee(String x, int y) {
    super(x);
    this.salary = y;
  }

  public int getSalary() {
    return salary;
  }

  @Override
  public String getDescription() {
    return "This employee's name is " + this.getName() + " and his salary is " + this.getSalary() + " rmb";
  }
}
