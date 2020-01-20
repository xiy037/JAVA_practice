package objectLessons.example.thread;

public class ThreadA extends Thread {
  @Override
  public void run() {
    System.out.println("ThreadA is running " + Thread.currentThread());
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("ThreadA ends running");
  }
}
