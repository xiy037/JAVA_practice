package objectLessons.collectionsDemo;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

  public static void main(String[] main) {
    LinkedHashMap<Integer, String> hotComments = cacheDemo();
    hotComments.put(1, "Awesome");
    hotComments.put(2, "Good Movie");
    hotComments.put(3, "Nice film");
    System.out.println(hotComments);
    hotComments.put(4, "Good job!");
    System.out.println(hotComments);
  }
  public static final int Max = 3;

  public static LinkedHashMap cacheDemo() {
    LinkedHashMap<Integer, String> list = new LinkedHashMap<Integer, String>( Max + 1, 0.75F, false) {
      @Override
      protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
        return size() > Max;
      }
    };
    return list;
  }
}
