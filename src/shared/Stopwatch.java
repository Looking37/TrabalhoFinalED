package shared;

public class Stopwatch {
  private Stopwatch() {
  }

  public static long calcElapsedTime(Runnable runnable) {
    long start = System.currentTimeMillis();
    runnable.run();
    long end = System.currentTimeMillis();
    return end - start;
  }

}
