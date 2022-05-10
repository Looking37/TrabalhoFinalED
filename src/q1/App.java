package q1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

import shared.Reader;
import shared.Stopwatch;

public class App {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		LinkedList<String> linkedList = new LinkedList<String>();
		ArrayList<String> arrayList = new ArrayList<String>();

		long elapsedTime;

		elapsedTime = Stopwatch
				.calcElapsedTimeInMs(() -> Reader.readFileToList(vector,
						"./src/resources/leipzig100k.txt"));
		System.out.println("vector: " + elapsedTime + " ms");

		elapsedTime = Stopwatch
				.calcElapsedTimeInMs(() -> Reader.readFileToList(linkedList,
						"./src/resources/leipzig100k.txt"));
		System.out.println("linkedList: " + elapsedTime + " ms");

		elapsedTime = Stopwatch
				.calcElapsedTimeInMs(() -> Reader.readFileToList(arrayList,
						"./src/resources/leipzig100k.txt"));
		System.out.println("arrayList: " + elapsedTime + " ms");

	}
}
