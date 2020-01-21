package objectLessons.example.thread;

public class ThreadB extends Thread {
  @Override
  public void run() {
    System.out.println("ThreadB is running " + Thread.currentThread() + Thread.currentThread().getPriority());
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("ThreadB ends running");
  }
}
