package objectLessons.example.thread.synDemo;

public class Counter {
  int total = 500;

  synchronized void subtract() {
    total--;
  }

  public static void main(String[] args) throws InterruptedException {
    Counter count = new Counter();
    Thread a = new Thread() {
      private int num = 0;
      @Override
      public void run() {
       while(count.total >= 1) {
         count.subtract();
         num++;
         try {
           Thread.sleep(1);
         } catch (InterruptedException e) {
           e.printStackTrace();
         }
       }
        System.out.println("火车站售票窗口卖：" + num);
      }
    };
    Thread b = new Thread() {
     private int num = 0;
      @Override
      public void run() {
        while(count.total >= 1) {
          count.subtract();
          num++;
          try {
            Thread.sleep(5);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
        System.out.println("携程APP卖：" + num);
      }
    };
    Thread c = new Thread() {
      private int num = 0;
      @Override
      public void run() {
        while(count.total >= 1) {
          count.subtract();
          num++;
          try {
            Thread.sleep(10);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
        System.out.println("12306官网：" + num);
      }
    };
    a.start();
    b.start();
    c.start();
    a.join();
    b.join();
    c.join();
    System.out.println("票卖完了，余票为： " + count.total);
  }

}
