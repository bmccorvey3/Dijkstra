import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;


public class HW7Test {

	//@Test
	@Test(timeout = 300)
	public void test() {
		

		ArrayList<Pair<String, Integer>> a = new ArrayList<Pair<String, Integer>>();
		a.add(new Pair("B", 6));
		a.add(new Pair("C", 2));
		a.add(new Pair("D", 9));
		a.add(new Pair("E", 5));

		
		ArrayList<Pair<String, Integer>> b = new ArrayList<Pair<String, Integer>>();
		b.add(new Pair("A", 6));
		b.add(new Pair("F", 0));

		
		ArrayList<Pair<String, Integer>> c = new ArrayList<Pair<String, Integer>>();
		c.add(new Pair("A", 2));
		c.add(new Pair("F", 1));


		
		ArrayList<Pair<String, Integer>> d = new ArrayList<Pair<String, Integer>>();
		d.add(new Pair("A", 9));
		d.add(new Pair("F", 0));



		
		ArrayList<Pair<String, Integer>> e = new ArrayList<Pair<String, Integer>>();
		e.add(new Pair("A", 5));
		e.add(new Pair("C", 0));
		
		ArrayList<Pair<String, Integer>> f = new ArrayList<Pair<String, Integer>>();
		f.add(new Pair("C", 1));
		f.add(new Pair("B", 0));
		f.add(new Pair("D", 0));
		

		
		ArrayList<Pair<String, Integer>> g = new ArrayList<Pair<String, Integer>>();
//		g.add(new Pair("C", 5));
//		g.add(new Pair("F", 5));

		
		ArrayList<String> h = new ArrayList<String>();
		h.add("A");
		h.add("D");
		h.add("E");
		
		
		HashMap graphMap = new HashMap();
		graphMap.put("A", a);
		graphMap.put("B", b);
		graphMap.put("C", c);
		graphMap.put("D", d);
		graphMap.put("E", e);
		graphMap.put("F", f);
//		graphMap.put("G", f);
		

		assertEquals(GraphSearch.dsp("A", graphMap, "F"), 3);
//		assertEquals(GraphSearch.dsp("A", graphMap, "C"), -1);
//		assertEquals(GraphSearch.dsp("A", graphMap, "D"), 2);
//		assertEquals(GraphSearch.dsp("A", graphMap, "E"), 4);
//		assertEquals(GraphSearch.dsp("A", graphMap, "F"), 7);

	}

}
