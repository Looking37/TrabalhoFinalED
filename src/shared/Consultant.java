package shared;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
Lisbon
NASA
Kyunghee
Konkuk
Sogang
momentarily
rubella
vaccinations
government
Authorities
 */
public class Consultant {

	  private Consultant() {
	  }

	  public static void consultFileToMap(Map<String, Integer> map) {
		  	String[] st = {"Lisbon", "NASA", "Kyunghee", "Konkuk",
		  			"Sogang", "momentarily", "rubella", "vaccinations",
		  			"government", "Authorities"};
		  	System.out.println("Searching...");
		  	for (int i=0; i<10; i++) {
		  		if(map.containsKey(st[i])) {
		  			System.out.print(st[i] + ", ");
		  		}
		  		else
		  			System.out.println("\nnot found: " + st[i]);
		  	}
		  	System.out.print("\n");
	  }
	  
	  public static void consultFileToSet(Set<String> set) {
		  	String[] st = {"Lisbon", "NASA", "Kyunghee", "Konkuk",
		  			"Sogang", "momentarily", "rubella", "vaccinations",
		  			"government", "Authorities"};
		  	System.out.println("Searching...");
		  	for (int i=0; i<10; i++) {
		  		if(set.contains(st[i])) {
		  			System.out.print(st[i] + ", ");
		  		}
		  		else
		  			System.out.println("\nnot found: " + st[i]);
		  	}
		  	System.out.print("\n");
	  }

		  public static void consultFileToList(List<String> list) {
			  	String[] st = {"Lisbon", "NASA", "Kyunghee", "Konkuk",
			  			"Sogang", "momentarily", "rubella", "vaccinations",
			  			"government", "Authorities"};
			  	System.out.println("Searching...");
			  	for (int i=0; i<10; i++) {
			  		if(list.contains(st[i])) {
			  			System.out.print(st[i] + ", ");
			  		}
			  		else
			  			System.out.println("\nnot found: " + st[i]);
			  	}
			  	System.out.print("\n");
		  }
	}

