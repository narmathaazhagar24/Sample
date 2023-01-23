package org;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Maping {
public static void main(String[] args) {
	Map<String,Integer>m= new TreeMap<>();
	
	m.put("Diamond",50000);
	m.put("Topaz",60000);
	m.put("Emerald",20000);
	m.put("Saphire",100000);

Set<Entry<String, Integer>> e = m.entrySet();
System.out.println(e);

for(Entry<String,Integer> entry : e) {
	System.out.println(entry);	
}
/*for(Entry<String,Integer> entry : e) {
	System.out.println(""+entry.getKey());
} 

for(Entry<String,Integer> entry : e) {
	System.out.println(""+entry.getValue());
}*/

}
}