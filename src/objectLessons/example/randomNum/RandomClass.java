package objectLessons.example.randomNum;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomClass {
  //生成0-bound之间的n个不重复随机数
  public static Set<Integer> produceNonrepeatedRandomInt(int n, int bound) {
    Set<Integer> result = new HashSet<>();
    for (int i = 0; i < n; i++) {
      Random producer = new Random();
      Integer num = producer.nextInt(bound);
      boolean isUnique = result.add(num);
      System.out.println(num);
      if(!isUnique) {
        n++;
        System.out.println("However, " + num + " is repeated");
      }
    }
    System.out.println("produced result");
    return result;
  }

  public static void main(String[] args) {
    //seed相同时，在Random中会生成相同的伪随机数sequence。
    Random one = new Random(4);
    System.out.println(one.nextInt());
    System.out.println(one.nextInt(100));
    Random two = new Random(4);
    System.out.println(two.nextInt());
    System.out.println(two.nextInt(100));
    System.out.println("==================");

    Set<Integer> randomSet = produceNonrepeatedRandomInt(6, 20);
    for (Integer integer : randomSet) {
      System.out.println(integer);
    }
  }
}
