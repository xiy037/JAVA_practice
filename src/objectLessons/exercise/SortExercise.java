package objectLessons.exercise;

import java.util.*;

import static java.util.Collections.*;

public class SortExercise {
  public static void main(String[] args) {
    Map<String, Double> stuEngScore = new HashMap<>();
    stuEngScore.put("Allie", 96.5);
    stuEngScore.put("Mike", 90.0);
    stuEngScore.put("John", 88.5);
    stuEngScore.put("Alex", 98.0);
    List<Map.Entry<String, Double>> sortedL= new ArrayList<>(stuEngScore.entrySet());
    sortedL.sort(((o1, o2) -> {
      return o1.getValue() > o2.getValue() ? -1 : 1;
    }));
    Map<String, Double> sortedEngScore = new LinkedHashMap<>();
    for (Map.Entry<String, Double> x: sortedL) {
      sortedEngScore.put(x.getKey(), x.getValue());
    }
    sortedEngScore.forEach((k, v) -> System.out.println(k + ": " + v));


  }
}
