package objectLessons.example.StreamDemo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyIntStream {
  public static void main(String[] args) {
    String divider = "===========================";
    //use IntStream.range(x, y) to get the source stream of int
    IntStream.range(1, 10)
            .filter(x -> x % 2 == 0)
            .forEach(System.out::println);
    System.out.println(divider);

    //use Stream.of to get the source stream; IntStream.of
    Stream.of(2, 4, 10, 1)
            .sorted()
            .forEach(System.out::println);
    IntSummaryStatistics summary = IntStream.of(2, 4, 10, 1).summaryStatistics();
    System.out.println(summary);
    System.out.println(divider);

    // Arrays.stream() to get the source stream
    String[] names = {"Alex", "Mike", "Stephen", "Steve", "Simon", "Allie", "Susan"};
    Arrays.stream(names) //same as Stream.of(names)
            .filter(x -> x.startsWith("S"))
            .sorted()
            .forEach(System.out::println);
    System.out.println(divider);

    //stream from List
    List<String> people = Arrays.asList(names);
    people.stream()
            .map(String::toLowerCase)
            .filter(x -> x.startsWith("a"))
            .forEach(System.out::println);
    System.out.println(divider);

    //Files.lines to get source stream in file
    try(Stream<String> patient = Files.lines(Paths.get("./src/objectLessons/example/StreamDemo/file.txt"));) {
      patient.map(x -> x.split(","))
              .filter(x -> x.length == 3)
              .filter(x -> Double.parseDouble(x[2]) > 37.0)
              .forEach(x -> System.out.println(x[0] + ", " + x[1] + ", "+ x[2]));
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
    System.out.println(divider);

    Map<String, Double> patientMap = new LinkedHashMap<>();
    try(Stream<String> patient = Files.lines(Paths.get("./src/objectLessons/example/StreamDemo/file.txt"));) {
      patientMap = patient.map(x -> x.split(","))
              .filter(x -> x.length == 3)
              .collect(Collectors.toMap(x -> x[0], x -> Double.parseDouble(x[2])));
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
    patientMap.forEach((k, v) -> System.out.println("Patient " + k + "'s temperature is " + v + " C"));
  }
}
