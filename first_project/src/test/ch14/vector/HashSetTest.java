package test.ch14.vector;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
//		Set<string> set = new HashSet<String>();
		HashSet<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("jdbc");
		set.add("jsp");
		set.add("java");
		
		int size = set.size();
		System.out.println(size);
		
	}
}
