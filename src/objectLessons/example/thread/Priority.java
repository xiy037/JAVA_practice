package objectLessons.example.thread;

public class Priority {
  public static void main(String[] args) {
    Thread a = new ThreadC();
    Thread b = new ThreadC();
    a.setName("a");
    b.setName("b");
    a.setPriority(Thread.MIN_PRIORITY);
    b.setPriority(Thread.MAX_PRIORITY);
    a.start();
    b.start();
  }
}
