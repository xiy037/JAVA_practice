package objectLessons.collectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();
    list.add("Hello");
    list.add("World");
    List<String> subList = new ArrayList<>();
    subList.add("New");
    subList.add("Year");
    subList.add("is");
    subList.add("coming");
    subList.add(".");
    list.addAll(subList);

    list.add(2, ", ");
    list.addFirst("Demo: ");
    list.set(list.size()-1, "!");

    Iterator itr = list.iterator();
    while (itr.hasNext()) {
      String newElement = itr.next() + "!!! ";
      System.out.print(newElement);
    }

    for (String x : list) {
      x = x + "$";
      System.out.println(x);
    }
  }
}

