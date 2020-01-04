package objectLessons.collectionsDemo;

import java.util.HashSet;
import java.util.Iterator;

class Student {
  private String name;
  private int age;
  private int id;

  public Student(int sId, String sName, int sAge) {
    this.name = sName;
    this.age = sAge;
    this.id = sId;
  }

  public String getName() {
    return this.name;
  }
  public int getId() {
    return this.id;
  }
  public int getAge() {
    return this.age;
  }
}

public class HashSetDemo {
  public static void main(String[] args) {
    HashSet<Student> roster = new HashSet<>();
    roster.add(new Student(1, "Mike", 24));
    roster.add(new Student(2, "Kyle", 25));
    roster.add(new Student(3, "Rebecca", 21));

    Iterator itr = roster.iterator();
    System.out.println("The group includes: ");
    while (itr.hasNext()) {
      Student member = (Student)itr.next();
      System.out.println("No." + member.getId() + ": " + member.getName());
    }
    System.out.print("Their average age is: ");
    int avgAge = 0;
    for (Student x : roster) {
      avgAge += x.getAge();
    }
    avgAge = avgAge / roster.size();
    System.out.print(avgAge + " years old.");
  }
}
