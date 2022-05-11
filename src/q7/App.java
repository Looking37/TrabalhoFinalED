package q7;

import java.util.*;
import shared.*;

public class App {
	static String[] words = { "Lisbon", "NASA", "Kyunghee", "Konkuk",
			"Sogang", "momentarily", "rubella", "vaccinations",
			"government", "Authorities"};

	public static void deleteOnMap(Map<String, Integer> map) {
		System.out.println("Excluindo...");
		for (int i = 0; i < 10; i++) {
			if (map.remove(words[i]) != null) {
				System.out.print(words[i] + ", ");
			} else
				System.out.println("\nNão encontrada: " + words[i]);
		}
		System.out.print("\n");
		System.out.print("\n");
	}

	public static void deleteOnSet(Set<String> set) {
		System.out.println("Excluindo...");
		for (int i = 0; i < 10; i++) {
			if (set.remove(words[i]) == true) {
				System.out.print(words[i] + ". ");
			} else
				System.out.println("\nNão encontrada: " + words[i]);
		}
		System.out.print("\n");
		System.out.print("\n");
	}

	public static void deleteOnList(List<String> list) {
		System.out.print("Excluindo...");
		for (int i = 0; i < 10; i++) {
			if (list.remove(words[i]) == true) {
				System.out.print(words[i] + ", ");
			} else
				System.out.println("\nNão encontrada: " + words[i]);
		}
		System.out.print("\n");
		System.out.print("\n");
	}

	public static void main(String[] args) {
		final String file = "./src/resources/leipzig100k.txt";
		long elapsedTime;

		Vector<String> vector = new Vector<String>();
		LinkedList<String> linkedList = new LinkedList<String>();
		ArrayList<String> arrayList = new ArrayList<String>();
		HashSet<String> hashSet = new HashSet<String>();
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		TreeSet<String> treeSet = new TreeSet<String>();
		HashMap<String, Integer> hashMap = new HashMap<>();
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
		TreeMap<String, Integer> treeMap = new TreeMap<>();

		Reader.readFileToList(vector, file);
		Reader.readFileToList(arrayList, file);
		Reader.readFileToList(linkedList, file);
		Reader.readFileToMap(hashMap, file);
		Reader.readFileToMap(linkedHashMap, file);
		Reader.readFileToMap(treeMap, file);
		Reader.readFileToSet(hashSet, file);
		Reader.readFileToSet(linkedHashSet, file);
		Reader.readFileToSet(treeSet, file);

		System.out.println("====  Questão 7  ====");

		elapsedTime = Stopwatch.calcElapsedTimeInNs(() -> deleteOnList(vector));
		System.out.println("Vector: " + elapsedTime + " ms");
		elapsedTime = Stopwatch.calcElapsedTimeInNs(() -> deleteOnList(linkedList));
		System.out.println("LinkedList: " + elapsedTime + " ms");
		elapsedTime = Stopwatch.calcElapsedTimeInNs(() -> deleteOnList(arrayList));
		System.out.println("ArrayList: " + elapsedTime + " ms");

		elapsedTime = Stopwatch.calcElapsedTimeInNs(() -> deleteOnMap(hashMap));
		System.out.println("HashMap: " + elapsedTime + " ms");
		elapsedTime = Stopwatch.calcElapsedTimeInNs(() -> deleteOnMap(linkedHashMap));
		System.out.println("LinkedHashMap: " + elapsedTime + " ms");
		elapsedTime = Stopwatch.calcElapsedTimeInNs(() -> deleteOnMap(treeMap));
		System.out.println("TreeMap: " + elapsedTime + " ms");

		elapsedTime = Stopwatch.calcElapsedTimeInNs(() -> deleteOnSet(hashSet));
		System.out.println("HashSet: " + elapsedTime + " ms");
		elapsedTime = Stopwatch.calcElapsedTimeInNs(() -> deleteOnSet(linkedHashSet));
		System.out.println("LinkedHashSet: " + elapsedTime + " ms");
		elapsedTime = Stopwatch.calcElapsedTimeInNs(() -> deleteOnSet(treeSet));
		System.out.println("TreeSet: " + elapsedTime + " ms");

	}
}
