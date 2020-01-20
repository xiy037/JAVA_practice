package objectLessons.example.thread;

public class Main {
  public static void main(String[] args) {
    Thread aThr = new ThreadA();
    Thread bThr = new ThreadB();
    aThr.start();
    bThr.start();
    System.out.println(Thread.getAllStackTraces());
  }
}
