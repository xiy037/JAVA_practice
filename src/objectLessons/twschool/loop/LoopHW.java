package objectLessons.twschool.loop;

public class LoopHW {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      System.out.print(i);
      if (i == 2) {
        break;
      }
    }
    System.out.println(" ");
    for (int i = 0; i < 5; i++) {
      System.out.print(i);
      if (i == 2) {
        continue;
      }
    }

  }
}
