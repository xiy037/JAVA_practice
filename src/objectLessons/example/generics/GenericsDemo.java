package objectLessons.example.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {
  public static void print(List<? extends Object> aList) {
    for (Object x: aList) {
      System.out.println(x);
    }
  }

  public static <E> List<E> makeList(E x, E y, E z) {
    List<E> result = new ArrayList<>();
    result.add(x);
    result.add(y);
    result.add(z);
    return result;
  }

  public static void main(String[] args) {
    List<Integer> scoreList = new ArrayList<>();
    scoreList.add(95);
    scoreList.add(80);
    scoreList.add(91);
    List<Double> heightList = new ArrayList<>();
    heightList.add(168.2);
    heightList.add(175.9);
    heightList.add(177.2);
    print(makeList("John", "Alex", "Jessie"));
    print(makeList(1,2,3));
    print(scoreList);
    print(heightList);
  }
}
