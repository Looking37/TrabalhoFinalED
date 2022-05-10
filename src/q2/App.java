package q2;

import shared.*;

import java.util.*;

// EXEMPLO DE UTILIZAÇÃO

public class App {
  public static void main(String[] args) {
    List<String> words = Reader.readFile("./src/resources/leipzig100k.txt");

    if (words == null) {
      System.out.println("Não foi possível ler o arquivo");
    }

    long elapsedTime = Stopwatch.calcElapsedTime(() -> words.contains("Mickey"));

    System.out.println("Tempo Gasto: " + elapsedTime + " ns");

  }
}
