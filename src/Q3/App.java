package Q3;

import shared.*;

import java.util.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.*;

public class App {
  public static void main(String[] args) {
	HashMap<String, Integer> hashmap = new HashMap<>();
	LinkedHashMap<String, Integer> linkedhashmap = new LinkedHashMap<>();
	TreeMap<String, Integer> treemap = new TreeMap<>();
	long elapsedTime;
	System.out.println("==== Questão 3 ====");
	elapsedTime = Stopwatch.calcElapsedTime(() -> Reader.readFile(hashmap, "./src/resources/leipzig100k.txt"));
	System.out.println("HashMap: " + (elapsedTime / 1000000) + " ms");
	
	elapsedTime = Stopwatch.calcElapsedTime(() -> Reader.readFile(linkedhashmap, "./src/resources/leipzig100k.txt"));
	System.out.println("LinkedHashMap: " + (elapsedTime / 1000000) + " ms");
	
	elapsedTime = Stopwatch.calcElapsedTime(() -> Reader.readFile(treemap, "./src/resources/leipzig100k.txt"));
	System.out.println("TreeMap: " + (elapsedTime / 1000000) + " ms");
  }
}
