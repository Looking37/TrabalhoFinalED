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
public class Consulter {

	  private Consulter() {
	  }

	  public static void readFileToMap(Map<String, Integer> map) {
		  	String[] st = {"Lisbon", "NASA", "Kyunghee", "Konkuk",
		  			"Sogang", "momentarily", "rubella", "vaccinations",
		  			"government", "Authorities"};
		  	for (int i=0; i<10; i++) {
		  		if(map.containsKey(st[i])) {
		  			System.out.println("word found: " + st[i]);
		  		}
		  		else
		  			System.out.println("word not found");
		  	}
	  }
	  
	  public static void readFileToSet(Set<String> set) {
		  	String[] st = {"Lisbon", "NASA", "Kyunghee", "Konkuk",
		  			"Sogang", "momentarily", "rubella", "vaccinations",
		  			"government", "Authorities"};
		  	for (int i=0; i<10; i++) {
		  		if(set.contains(st[i])) {
		  			System.out.println("word found: " + st[i]);
		  		}
		  		else
		  			System.out.println("word not found");
		  	}
	  }

		  public static void readFileToList(List<String> list) {
			  	String[] st = {"Lisbon", "NASA", "Kyunghee", "Konkuk",
			  			"Sogang", "momentarily", "rubella", "vaccinations",
			  			"government", "Authorities"};
			  	for (int i=0; i<10; i++) {
			  		if(list.contains(st[i])) {
			  			System.out.println("word found: " + st[i]);
			  		}
			  		else
			  			System.out.println("word not found");
			  	}
		  }
	}

