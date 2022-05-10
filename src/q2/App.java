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
        .calcElapsedTime(() -> Reader.readFileToSet(hashSet, file));

    System.out.println("HashSet: " + elapsedTime + " ms");

    elapsedTime = Stopwatch
        .calcElapsedTime(() -> Reader.readFileToSet(linkedHashSet, file));

    System.out.println("LinkedHashSet: " + elapsedTime + " ms");

    elapsedTime = Stopwatch
        .calcElapsedTime(() -> Reader.readFileToSet(treeSet, file));

    System.out.println("TreeSet: " + elapsedTime + " ms");

  }
}