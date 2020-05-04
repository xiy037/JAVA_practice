package objectLessons.example.OverrideEqual;

public class Person {
  private String name;
  private long id;
  private int age;

  public Person(Long i, String n, int a) {
    this.id = i;
    this.name = n;
    this.age = a;
  }

  public String getName() {
    return name;
  }

  public long getId() {
    return id;
  }

  public int getAge() {
    return age;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    } else if (obj instanceof Person) {
      if (((Person)obj).getId() == (this.getId())) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    Person alex1 = new Person(1001L, "Alex", 18);
    Person alex2 = new Person(1101L, "Alex", 18);
    System.out.println(alex1.equals(alex2));

    Person alexander = new Person(1001L, "Alexander", 18);
    boolean result = alex1.equals(alexander);
    System.out.println(result);
  }
}
