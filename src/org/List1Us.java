package org;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class List1Us {
	public static void main(String[] args) {
		Map <Pojo1,Integer> m = new HashMap<>();
		Pojo1 p = new Pojo1();
		p.setEmpId(2036944);
		p.setName("NarmathaAzhagarraj");
		Pojo1 p1 = new Pojo1();
		p1.setEmpId(12345);
		p1.setName("Gayu");

		m.put(p, null);
		m.put(p1, null);

		Set<Entry<Pojo1, Integer>> entry = m.entrySet();
		
		for (Entry<Pojo1, Integer> x :entry) {
			System.out.println(x.getKey().getEmpId());
			System.out.println(x.getKey().getName());
		}	}
}
