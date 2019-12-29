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
  public Employee(String x) {
    super(x);
  }

  @Override
  public String getDescription() {
    return "This employee's name is " + this.getName();
  }
}
