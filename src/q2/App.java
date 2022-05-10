package q2;

import shared.*;

import java.util.*;

// EXEMPLO DE UTILIZAÇÃO

public class App {
  public static void main(String[] args) {
    HashSet<String> words = new HashSet<String>();
    Reader.readFile(words, "./src/resources/leipzig100k.txt");

    long elapsedTime = Stopwatch.calcElapsedTime(() -> words.contains("Travis"));
    System.out.println("Tempo Gasto: " + elapsedTime + " ns");

  }
}
