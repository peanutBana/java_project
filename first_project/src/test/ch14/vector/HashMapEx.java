package test.ch14.vector;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
//		Map<> map = new HashMap<>();
		//HashMap<key, 객체> key / value
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("김하서", 85);
		map.put("김명현", 90);
		map.put("양준수", 80);
		map.put("노은비", 95);
		
		System.out.println("map.size(): " + map.size());
		
		//키로 값 얻기
		String key = "김하서";
		int value = map.get(key);
		System.out.println("value: " + value);
	
		//반복해서 키와 값 얻기
		Set<String> keySet = map.keySet();
		Iterator<String> keyInterator = keySet.iterator();
		
		while(keyInterator.hasNext()) {
			String k = keyInterator.next();		// 4개의 key
			Integer v = map.get(k);
			System.out.println(k + " : " + v);
		}
		
		System.out.println("--------------------------------------");
		
		//반복해서 키와 값 얻기 2번째
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();	//반복된 키를 얻는다.
		
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k + " : " + v);
		}
		
	}

}
