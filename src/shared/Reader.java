package shared;

import java.io.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {

  private Reader() {
  }

  public static List<String> readFile(String path) {
    try {
      List<String> result = new ArrayList<String>();
      File file = new File(path);
      Scanner scanner = new Scanner(file);

      while (scanner.hasNext()) {
        String word = scanner.next();
        result.add(word);
      }
      scanner.close();
      return result;

    } catch (FileNotFoundException e) {
      return null;
    }
  }
}
