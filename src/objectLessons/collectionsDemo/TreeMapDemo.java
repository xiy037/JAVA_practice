package objectLessons.collectionsDemo;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

  public static void main(String[] args) {
    TreeMap<Integer, String> map = new TreeMap<>();
    map.put(3, "val3");
    map.put(2, "val2");
    map.put(1, "val1");
    map.put(5, "val5");
    map.put(4, "val4");
    System.out.println(map.firstEntry());
    System.out.println(map.floorEntry(6));
    System.out.println(map.higherKey(2));

    NavigableMap<Integer, String> desMap = map.descendingMap();
    System.out.println("Sort in descending order: " + desMap);
    System.out.println("firstKey in desMap is: " + desMap.firstKey());
    System.out.println("pollFirstEntry return the element: " + map.pollFirstEntry());

    System.out.println("===============================");
    ageSort();
  }

  public static void ageSort() {
    TreeMap<Integer, String> student = new TreeMap<>();
    student.put(15, "Emma");
    student.put(12, "Alex");
    student.put(10, "Joey");
    student.put(18, "Jessie");
    student.put(21, "Lia");
    SortedMap<Integer, String> youngTeam = student.headMap(15);
    SortedMap<Integer, String> oldTeam = student.tailMap(18);
    NavigableMap<Integer, String> middleTeam = student.subMap(15, true, 18, false);
    System.out.println("Young team is : " + youngTeam);
    System.out.println("Middle team is : " + middleTeam);
    System.out.println("Old team is : " + oldTeam);
  }
}
