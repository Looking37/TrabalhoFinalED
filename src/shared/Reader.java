package shared;

import java.io.*;
import java.util.*;

public class Reader {

  private Reader() {
  }

  public static void readFileToMap(Map<String, Integer> map, String path) {
    try {
      File file = new File(path);
      Scanner scanner = new Scanner(file);

      while (scanner.hasNext()) {
        String word = scanner.next();
        map.put(word, 0);
      }
      scanner.close();

    } catch (FileNotFoundException e) {
      System.out.println("Não foi possível abrir o arquivo");
    }
  }

  public static void readFileToSet(Set<String> set, String path) {
    try {
      File file = new File(path);
      Scanner scanner = new Scanner(file);

      while (scanner.hasNext()) {
        String word = scanner.next();
        set.add(word);
      }
      scanner.close();

    } catch (FileNotFoundException e) {
      System.out.println("Não foi possível abrir o arquivo");
    }
  }

  public static void readFileToList(List<String> list, String path) {
    try {
      File file = new File(path);
      Scanner scanner = new Scanner(file);

      while (scanner.hasNext()) {
        String word = scanner.next();

        if (!list.contains(word)) {
          list.add(word);
        }
      }
      scanner.close();

    } catch (FileNotFoundException e) {
      System.out.println("Não foi possível abrir o arquivo");
    }
  }
}
