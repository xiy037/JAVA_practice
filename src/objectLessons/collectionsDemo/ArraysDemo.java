package objectLessons.collectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysDemo {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    System.out.println(Arrays.asList(arr).size()); //primitive类型的用asList，转为的List里面的element还是array
    ArrayList<int[]> aList = new ArrayList<>(Arrays.asList(arr));
    System.out.println(aList.size());

    String[] stringArray = { "a", "b", "c", "d", "e" };
    System.out.println(Arrays.asList(stringArray).size());
    ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(stringArray));
    System.out.println(arrayList);

    boolean[] arr2 = {true, true, false};
    System.out.println(Arrays.asList(arr2).size());
  }
}
