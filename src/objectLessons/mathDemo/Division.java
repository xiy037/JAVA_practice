package objectLessons.mathDemo;

public class Division {
  public static void main(String[] args) {
    int x = 1;
    System.out.println(x/2); //equals 0, cause int/int will produce int, so 0.5 will be rounded to 0.
    System.out.println((double)x/2); //0.5
  }
}
