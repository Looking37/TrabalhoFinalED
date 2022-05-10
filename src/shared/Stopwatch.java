package shared;

public class Stopwatch {
  private Stopwatch() {
  }

  public static long calcElapsedTimeInMs(Runnable runnable) {
    long start = System.currentTimeMillis();
    runnable.run();
    long end = System.currentTimeMillis();
    return end - start;
  }

  public static long calcElapsedTimeInNs(Runnable runnable) {
    long start = System.nanoTime();
    runnable.run();
    long end = System.nanoTime();
    return end - start;
  }

}
