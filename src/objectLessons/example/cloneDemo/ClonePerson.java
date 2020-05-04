package objectLessons.example.cloneDemo;

public class ClonePerson implements Cloneable {
  private String name;
  private int age;
  private int id;

  public ClonePerson(String n, int a, int id) {
    this.name = n;
    this.age = a;
    this.id = id;
  }

  /**
   * copy constructor
   * @param original object to copy
   */
  public ClonePerson(ClonePerson original) {
    this.name = original.getName();
    this.age = original.getAge();
    this.id = original.getId();
  }


  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public int getId() {
    return id;
  }

  @Override
  public ClonePerson clone() throws CloneNotSupportedException {
    return (ClonePerson)super.clone();
  }

  @Override
  public String toString() {
    return "ClonePerson{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", id=" + id +
            '}';
  }

  public static void main(String[] args) {
    ClonePerson bob = new ClonePerson("Bob", 18, 1);
    System.out.println(bob);
    try {
      ClonePerson bobCopy = bob.clone();
      System.out.println(bobCopy);
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }

    ClonePerson anotherCopy = new ClonePerson(bob);
    System.out.println(anotherCopy);
  }
}
