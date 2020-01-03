package objectLessons.collectionsDemo;

import java.util.HashMap;

public class HashMapDemo {

  public static void main(String[] args) {
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    capitalCities.put("USA", "SanDiego");
    capitalCities.put("UK", "London");
    capitalCities.put("CN", "Beijing");
    capitalCities.forEach((k, v) -> System.out.println("The capital of " + k + " is " + v));
    capitalCities.put("USA", "Washington");
    System.out.println(capitalCities.get("USA"));
    System.out.println(capitalCities.get("Germany"));
    capitalCities.put("Korea", "Pyongyang");
    String newCity = "Seoul";
    capitalCities.merge("Korea", newCity, (oldV, newV) -> oldV + ", " + newV);
    System.out.println(capitalCities.get("Korea"));

    mergeDemo();
  }

  static void mergeDemo() {
    HashMap<Integer, String> firstName = new HashMap<>();
    firstName.put(1, "Alan");
    firstName.put(2, "Emma");
    firstName.put(3, "Tom");
    HashMap<Integer, String> lasttName = new HashMap<>();
    lasttName.put(1, "Smith");
    lasttName.put(2, "Watson");
    lasttName.put(3, "Morison");
    firstName.forEach((key, newV) -> lasttName.merge(key, newV, (prev, curr) -> prev + ", " + curr));
    lasttName.forEach((k, v) -> System.out.println("id " + k + " is " +v));
  }
}
