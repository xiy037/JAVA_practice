package objectLessons.example.exceptionHandling;

public class ExceptionDemo {
  public static double divide(float argument) {
    return Math.floor(10 / argument);
  }

  public static void main(String[] args) {
    for (String x: args) {
      float argument = Float.parseFloat(x);
      try {
        System.out.println("10 /" + argument + " = " + divide(argument));
      } catch (Exception e) {
        System.out.println("Input Exception: " + e.getMessage());
      }
    }
  }
}
