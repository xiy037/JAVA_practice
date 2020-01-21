package objectLessons.example.thread;

public class ThreadC extends Thread {
  @Override
  public void run() {
    System.out.println(this.getName() + ": no time slicing for the thread" + Thread.currentThread() + this.getPriority());
  }
}
