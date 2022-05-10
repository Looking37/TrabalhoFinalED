package Q3;

public class Stopwatch {
  private Stopwatch() {
  }


  public static long calcElapsedTime(Runnable runnable) {
    long start = System.nanoTime();
    runnable.run();
    long end = System.nanoTime();
    return end - start;
  }

}
