package q2;

import shared.*;

import java.util.*;

// EXEMPLO DE UTILIZAÇÃO

public class App {
  public static void main(String[] args) {
    HashMap<String, Integer> hashMapWords = new HashMap<String, Integer>();

    long elapsedTime = Stopwatch
        .calcElapsedTime(() -> Reader.readFile(hashMapWords,
            "./src/resources/leipzig100k.txt"));

    System.out.println("TEMPO GASTO: " + elapsedTime + " ns");

  }
}
