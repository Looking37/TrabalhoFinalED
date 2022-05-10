package Q3;

import java.io.*;
import java.util.*;

public class Reader {

  private Reader() {
  }

  public static void readFile(Map<String, Integer> collection, String path) {
    try {
      File file = new File(path);
      Scanner scanner = new Scanner(file);

      while (scanner.hasNext()) {
        String word = scanner.next();
        collection.put(word, 0);
      }
      scanner.close();

    } catch (FileNotFoundException e) {
      System.out.println("Não foi possível abrir o arquivo");
    }
  }

  public static void readFile(Collection<String> collection, String path) {
    try {
      File file = new File(path);
      Scanner scanner = new Scanner(file);

      while (scanner.hasNext()) {
        String word = scanner.next();
        collection.add(word);
      }
      scanner.close();

    } catch (FileNotFoundException e) {
      System.out.println("Não foi possível abrir o arquivo");
    }
  }
}