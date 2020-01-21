package objectLessons.example.thread;

public class Main {
  public static void main(String[] args) {
    Thread aThr = new ThreadA();
    Thread bThr = new ThreadB();
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    aThr.start();
    try {
      aThr.join();
    } catch (InterruptedException e) {
      System.out.println(e);
    }
    bThr.start();
    System.out.println(Thread.getAllStackTraces());
  }
}
