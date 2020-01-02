package objectLessons.collectionsDemo;

import java.util.ArrayList;

public class ArrayListDemo {
  public static void main(String[] args) {
    ArrayList list = new ArrayList();
    list.add("demo");
    String x = (String)list.get(0);
    System.out.println(x);

    ArrayList<String> list2 = new ArrayList<>();
    list2.add("hello");
    list2.add("world");
    list2.add("2020");
    for (String item : list2) {
      System.out.print(item + " ");
    }
  }
}
