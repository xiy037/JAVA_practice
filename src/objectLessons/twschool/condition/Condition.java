package objectLessons.twschool.condition;

public class Condition {
  public static void main(String[] args) {
//    int aNumber = 3;
//    if (aNumber >= 0)
//      if (aNumber == 0)
//        System.out.println("first string");
//      else System.out.println("second string");
//    System.out.println("third string");

    //判断是不是质数
    int number = 4;
    boolean isPrime = true;
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        isPrime = false;
        break;
      }
    }
    if (isPrime) {
      System.out.println("number is Prime number");
    } else {
      System.out.println("number is not Prime number");
    }
  }
}
