package objectLessons.collectionsDemo;

import java.util.*;

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
    HashMap<Integer, String> lastName = new HashMap<>();
    lastName.put(1, "Smith");
    lastName.put(2, "Watson");
    lastName.put(3, "Morison");
    firstName.forEach((key, newV) -> lastName.merge(key, newV, (prev, curr) -> prev + ", " + curr));
    lastName.forEach((k, v) -> System.out.println("id " + k + " is " +v));
    sortMap(lastName);
  }

  public static void sortMap(HashMap<Integer, String> map) {
    List<Map.Entry<Integer, String>> sortedList = new ArrayList<>(map.entrySet());
    Comparator<Map.Entry<Integer, String>> keyComparator = new Comparator<Map.Entry<Integer, String>>() {
      @Override
      public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
        return o2.getKey() - o1.getKey();
      }
    };
    Collections.sort(sortedList, keyComparator);
    Map<Integer, String> sortedMap= new LinkedHashMap<>();
    for (Map.Entry<Integer, String> x : sortedList) {
      sortedMap.put(x.getKey(), x.getValue());
    }
    System.out.println(sortedMap);
  }
}
