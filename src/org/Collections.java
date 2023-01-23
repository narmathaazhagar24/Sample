package org;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Collections {
/*public static void main(String[] args) {
	List<Integer> l = new ArrayList<Integer>();
	l.add(20);
	l.add(199);
	l.add(15);
	l.add(25);
	l.add(57);
	l.add(15);
	l.add(99);
	l.add(200);

for(int i=0; i<l.size();i++) {
	System.out.println(l.get(i));    */
	
/*	public static void main(String[] args) {
		Set<Integer> s = new TreeSet<Integer>();
		s.add(100);
		s.add(50);
		s.add(1000);
		s.add(1081);
		s.add(477);
		
		for (Integer Sets : s) {
			System.out.println(Sets);
		}
	}
	*/

public static void main(String[] args) {
	Map<Integer,String> m = new TreeMap<Integer,String>();
	m.put(10, "Diamond");
	m.put(20, "Saphire");
	m.put(5,"Amethyst");
	m.put(18, "Topaz");
	
	Set<Entry<Integer, String>> e = m.entrySet();
	System.out.println(e);
	
	for(Entry<Integer,String> entry: e) {
		System.out.println(entry);
	}
	
for(Entry <Integer,String> entry: e) {
	System.out.println(""+entry.getKey());
}

for(Entry <Integer,String> entry: e) {
System.out.println(""+entry.getValue());
}
}}