package objectLessons.mathDemo;
import java.lang.Float;

/**
 * float and decimal in java also have the rounding problem.
 * Be careful when comparing them. Do not directly use == to compare them.
 */
public class FloatDemo {
  public static boolean compareDoubleUsingThreshold(Double a, Double b) {
    final double threshold = 0.0001;
    if (Math.abs(a - b) < threshold) {
      return true;
    } else {
      return false;
    }
  }

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

    double f1 = .0;
    for (int i = 1; i <= 11; i++) {
      f1 += .1;
    }
    System.out.println(f1);
    System.out.println(compareDoubleUsingThreshold(f1, 1.1));

    //Float.compare也是内部设置了threshold的。
    float aFloat = 2.0f;
    float bFloat = 2.0000001f;
    System.out.println(Float.compare(aFloat, bFloat));

    System.out.println(0 / 0.0f);
    System.out.println(((Float)Float.NaN).equals((Float)Float.NaN));
    System.out.println(Float.NaN == Float.NaN);
  }
}
