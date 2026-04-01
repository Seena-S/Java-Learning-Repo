package Java8.HashMap;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Map<String, Integer> students = new HashMap<>();
		students.put("Seena", 29);
		students.put("Simi", 32);
		students.put("Sara", 59);
		students.put("Soman", 67);
		System.out.println(students);
		System.out.println(students.get("Seena"));
		System.out.println(students.keySet());
		
		for(String key : students.keySet()) {
			System.out.println(key + " : " + students.get(key) );
		}
	}

}
