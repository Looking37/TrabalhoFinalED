package q2;

import java.util.*;
import shared.*;

public class App {
  public static void main(String[] args) {
    final String file = "./src/resources/leipzig100k.txt";

    HashSet<String> hashSet = new HashSet<String>();
    LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
    TreeSet<String> treeSet = new TreeSet<String>();

	System.out.println("==== Questão 2 ====");
    long elapsedTime;
    elapsedTime = Stopwatch
        .calcElapsedTimeInMs(() -> Reader.readFileToSet(hashSet, file));

    System.out.println("HashSet: " + elapsedTime + " ms");

    elapsedTime = Stopwatch
        .calcElapsedTimeInMs(() -> Reader.readFileToSet(linkedHashSet, file));

    System.out.println("LinkedHashSet: " + elapsedTime + " ms");

    elapsedTime = Stopwatch
        .calcElapsedTimeInMs(() -> Reader.readFileToSet(treeSet, file));

    System.out.println("TreeSet: " + elapsedTime + " ms");

  }
}