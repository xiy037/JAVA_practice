package objectLessons.example.StreamDemo;

import java.util.stream.Stream;

public class StreamOrder {
  public static void main(String[] args) {
    // Operations except sorted() will be operated vertically
    Stream.of("a", "b", "c", "d")
            .filter(x -> {
              System.out.println("filter: " + x);
              return true;
            }).forEach(x -> System.out.println("forEach: " + x));

    System.out.println("========================");

    Stream.of("d2", "a2", "b1", "b3", "c")
            .map(s -> {
              System.out.println("map: " + s);
              return s.toUpperCase();
            })
            .filter(s -> {
              System.out.println("filter: " + s);
              return s.startsWith("A");
            })
            .forEach(s -> System.out.println("forEach: " + s));
    System.out.println("we will change the order of filter and map to improve efficiency!!!");
    Stream.of("d2", "a2", "b1", "b3", "c")
            .filter(x -> {
              System.out.println("filter: " + x);
              return x.startsWith("a");
            })
            .map(x -> {
              System.out.println("map: " + x);
              return x.toUpperCase();
            })
            .forEach(System.out::println);

    System.out.println("========================");

    // operations order for sorted is horizontally, i.e. sorted for all elements at a time then move forward
    Stream.of("d1", "a1", "b1", "b3", "c")
            .sorted((o1, o2) -> {
              System.out.println("sort: " + o1 +", " + o2);
              return o1.compareTo(o2);
            })
            .filter(x -> {
              System.out.println("filter: " + x);
              return x.startsWith("b");
            })
            .map(x -> {
              System.out.println("map: " + x);
              return x.toUpperCase();
            })
            .forEach(System.out::println);

    System.out.println("change the oreder of sorted and filter: ");
    Stream.of("d1", "a1", "b1", "b3", "c")
            .filter(x -> {
              System.out.println("filter: " + x);
              return x.startsWith("b");
            })
            .map(x -> {
              System.out.println("map: " + x);
              return x.toUpperCase();
            })
            .sorted((o1, o2) -> {
              System.out.println("sort: " + o1 +", " + o2);
              return o1.compareTo(o2);
            })
            .forEach(System.out::println);
    ;
  }

}
