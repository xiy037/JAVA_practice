package objectLessons.example.serialization;

import java.io.Serializable;

public class Student implements Serializable {
  private String name;
  private int age;

  public Student(String aName, int sAge) {
    this.name = aName;
    this.age = sAge;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }
}
