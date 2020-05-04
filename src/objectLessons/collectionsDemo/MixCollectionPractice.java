package objectLessons.collectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class MixCollectionPractice {
  public static Comparator<Person> ageComparator = new Comparator<Person>() {
    @Override
    public int compare(Person o1, Person o2) {
      return o1.age < o2.age ? -1 :
              (o1.age == o2.age) ? 0 : 1;
    }
  };
  public static Comparator<Person> nameComparator = new Comparator<Person>() {
    @Override
    public int compare(Person o1, Person o2) {
      return o1.name.compareTo(o2.name);
    }
  };

  private static class Person {
    public String name;
    public int age;

    public Person(String n, int a) {
      this.name = n;
      this.age = a;
    }

    @Override
    public String toString() {
      return "Person{" +
              "name='" + name + '\'' +
              ", age=" + age +
              '}';
    }
  }
  public static void compareArrayList() {
    ArrayList<Person> personList = new ArrayList<>();
    personList.add(new Person("Alex", 18));
    personList.add(new Person("Bob", 20));
    personList.add(new Person("Mike", 17));

   Collections.sort(personList, ageComparator);
    for (Person person : personList) {
      System.out.println(person);
    }

    Collections.sort(personList, nameComparator);
    for (Person person : personList) {
      System.out.println(person);
    }
  }


  public static void main(String[] args) {

  }
}
