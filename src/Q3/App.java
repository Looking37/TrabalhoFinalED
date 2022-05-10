package Q3;

import shared.*;
import java.util.*;

public class App {
	public static void main(String[] args) {
		HashMap<String, Integer> hashmap = new HashMap<>();
		LinkedHashMap<String, Integer> linkedhashmap = new LinkedHashMap<>();
		TreeMap<String, Integer> treemap = new TreeMap<>();

		long elapsedTime;

		System.out.println("==== Quest�o 3 ====");
		elapsedTime = Stopwatch.calcElapsedTimeInMs(() -> Reader.readFileToMap(hashmap, "./src/resources/leipzig100k.txt"));
		System.out.println("HashMap: " + elapsedTime + " ms");

		elapsedTime = Stopwatch
				.calcElapsedTimeInMs(() -> Reader.readFileToMap(linkedhashmap, "./src/resources/leipzig100k.txt"));
		System.out.println("LinkedHashMap: " + elapsedTime + " ms");

		elapsedTime = Stopwatch.calcElapsedTimeInMs(() -> Reader.readFileToMap(treemap, "./src/resources/leipzig100k.txt"));
		System.out.println("TreeMap: " + elapsedTime + " ms");
	}
}
