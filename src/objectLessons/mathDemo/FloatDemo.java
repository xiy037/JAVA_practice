package objectLessons.mathDemo;
import java.lang.Float;

public class FloatDemo {
  public static void main(String[] args) {
    float a = 0.00001f;
    int result = Float.compare(a, 0.0f);
    if ( result == 0) {
      System.out.println("a = 0");
    } else if (result < 0) {
      System.out.println("a < 0");
    } else {
      System.out.println("a > 0");
    }
  }
}
