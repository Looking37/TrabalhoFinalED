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
public class Delete {

	  private Delete() {
	  }

	  public static void deleteFileToMap(Map<String, Integer> map) {
		  	String[] st = {"Lisbon", "NASA", "Kyunghee", "Konkuk",
		  			"Sogang", "momentarily", "rubella", "vaccinations",
		  			"government", "Authorities"};
		  	System.out.println("Deleting...");
		  	for (int i=0; i<10; i++) {
		  		if(map.remove(st[i])!=null) {
		  			System.out.print(st[i] + ", ");
		  		}
		  		else
		  			System.out.println("\nnot found: " + st[i]);
		  	}
		  	System.out.print("\n");
	  }
	  
	  public static void deleteFileToSet(Set<String> set) {
		  	String[] st = {"Lisbon", "NASA", "Kyunghee", "Konkuk",
		  			"Sogang", "momentarily", "rubella", "vaccinations",
		  			"government", "Authorities"};
		  	System.out.println("Deleting...");
		  	for (int i=0; i<10; i++) {
		  		if(set.remove(st[i])==true) {
		  			System.out.print(st[i] + ". ");
		  		}
		  		else
		  			System.out.println("\nnot found: " + st[i]);
		  	}
		  	System.out.print("\n");
	  }

		  public static void deleteFileToList(List<String> list) {
			  	String[] st = {"Lisbon", "NASA", "Kyunghee", "Konkuk",
			  			"Sogang", "momentarily", "rubella", "vaccinations",
			  			"government", "Authorities"};
			  	System.out.print("Deleting...");
			  	for (int i=0; i<10; i++) {
			  		if(list.remove(st[i])==true) {
			  			System.out.print(st[i] + ", ");
			  		}
			  		else
			  			System.out.println("\nnot found: " + st[i]);
			  	}
			  	System.out.print("\n");
		  }
	}
