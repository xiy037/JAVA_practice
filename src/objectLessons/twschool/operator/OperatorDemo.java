package objectLessons.twschool.operator;

public class OperatorDemo {
  public static void main(String[] args) {
    int a = 3;
    int b = 4;
    b++;
    System.out.println(b);
    int result = b*12+(b--)+a*(b--);
    System.out.println(b);
    System.out.println(result);

    int i = 10;
    int n = i++%5;
    System.out.println(n);
  }
}

