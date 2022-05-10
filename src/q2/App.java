package q2;

import java.util.*;
import shared.*;

public class App {
  public static void main(String[] args) {
    final String file = "./src/resources/leipzig100k.txt";

    HashSet<String> hashSet = new HashSet<String>();
    LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
    TreeSet<String> treeSet = new TreeSet<String>();

    long elapsedTime;

    System.out.println("====  Questão 2  ====");
    elapsedTime = Stopwatch
        .calcElapsedTime(() -> Reader.readFile(hashSet, file));

    System.out.println("HashSet: " + elapsedTime + " ns");

    elapsedTime = Stopwatch
        .calcElapsedTime(() -> Reader.readFile(linkedHashSet, file));

    System.out.println("LinkedHashSet: " + elapsedTime + " ns");

    elapsedTime = Stopwatch
        .calcElapsedTime(() -> Reader.readFile(treeSet, file));

    System.out.println("TreeSet: " + elapsedTime + " ns");

  }
}