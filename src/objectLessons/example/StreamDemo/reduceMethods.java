package objectLessons.example.StreamDemo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class reduceMethods {
  static class School {
    String name;
    List<Klass> klasses = new ArrayList<>();

    public School(String str) {
      this.name = str;
    }
  }

  static class Klass {
    String name;

    public Klass(String kStr) {
      this.name = kStr;
    }
  }

  public static void main(String[] args) {
    //reduce
    List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6);
    Integer evenSum = numberList.stream()
            .filter(x -> {
              System.out.println("filter: " + x);
              return x % 2 == 0;
            })
            .reduce(0, (prev, curr) -> {
              System.out.println("prev: " + prev + ", curr:" + curr);
              return prev + curr;
            });
    System.out.println(evenSum);

    System.out.println("==========================");
    //flatMap
    List<School> schoolList = new ArrayList<>();
    schoolList.add(new School("school1"));
    schoolList.add(new School("school2"));
    schoolList.add(new School("school3"));
    schoolList.forEach(x -> {
      x.klasses.add(new Klass("klassA of " + x.name));
      x.klasses.add(new Klass("klassB of " + x.name));
      x.klasses.add(new Klass("klassC of " + x.name));
    });

    schoolList.stream()
            .flatMap(x -> x.klasses.stream())
            .forEach(x -> System.out.println(x.name));

    System.out.println("==========================");

    //Collect
    List<String> nameList = Arrays.asList("Peter", "Paul", "John", "Abby", "Christian", "Mike", "Allie", "Alex");
    List<String> filteredNameList = new ArrayList<>();
    filteredNameList = nameList.stream()
            .filter(x -> x.startsWith("A"))
            .collect(Collectors.toList());
    filteredNameList.forEach(System.out::println);
  }
}
