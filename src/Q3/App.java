package Q3;

import shared.*;
import java.util.*;

public class App {
	public static void main(String[] args) {
		final String file =  "./src/resources/leipzig100k.txt";
		
		HashMap<String, Integer> hashmap = new HashMap<>();
		LinkedHashMap<String, Integer> linkedhashmap = new LinkedHashMap<>();
		TreeMap<String, Integer> treemap = new TreeMap<>();

		System.out.println("==== Questão 3 ====");
		long elapsedTime;
		elapsedTime = Stopwatch
				.calcElapsedTimeInMs(() -> Reader.readFileToMap(hashmap, file));
		System.out.println("HashMap: " + elapsedTime + " ms");
		System.out.print("\n");

		elapsedTime = Stopwatch
				.calcElapsedTimeInMs(() -> Reader.readFileToMap(linkedhashmap, file));
		System.out.println("LinkedHashMap: " + elapsedTime + " ms");
		System.out.print("\n");

		elapsedTime = Stopwatch
				.calcElapsedTimeInMs(() -> Reader.readFileToMap(treemap, file));
		System.out.println("TreeMap: " + elapsedTime + " ms");
		System.out.print("\n");
	}
}

