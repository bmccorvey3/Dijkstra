import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import sun.misc.Queue;


public class BossClass {

	@Test
	public void test() {
		

//		ArrayList<Pair<String, Integer>> a = new ArrayList<Pair<String, Integer>>();
//		a.add(new Pair("B", 2));
//		a.add(new Pair("C", 1));
//
//		
//		ArrayList<Pair<String, Integer>> b = new ArrayList<Pair<String, Integer>>();
//		b.add(new Pair("A", 2));
//		b.add(new Pair("C", 3));
//
//		
//		ArrayList<Pair<String, Integer>> c = new ArrayList<Pair<String, Integer>>();
//		c.add(new Pair("A", 1));
//		c.add(new Pair("B", 3));
//		c.add(new Pair("D", 1));
//		c.add(new Pair("E", 3));
//		c.add(new Pair("G", 5));
//
//		
//		ArrayList<Pair<String, Integer>> d = new ArrayList<Pair<String, Integer>>();
//		d.add(new Pair("C", 1));
//		d.add(new Pair("E", 3));
//		d.add(new Pair("F", 6));
//
//
//		
//		ArrayList<Pair<String, Integer>> e = new ArrayList<Pair<String, Integer>>();
//		e.add(new Pair("C", 3));
//		e.add(new Pair("D", 3));
//		e.add(new Pair("F", 3));
//		
//		ArrayList<Pair<String, Integer>> f = new ArrayList<Pair<String, Integer>>();
//		f.add(new Pair("D", 6));
//		f.add(new Pair("E", 3));
//		f.add(new Pair("G", 5));
//		
//		ArrayList<Pair<String, Integer>> g = new ArrayList<Pair<String, Integer>>();
//		g.add(new Pair("C", 5));
//		g.add(new Pair("F", 5));
//
//		
//		ArrayList<String> h = new ArrayList<String>();
//		h.add("A");
//		h.add("D");
//		h.add("E");


		
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("B");
		a.add("C");
		
		ArrayList<String> b = new ArrayList<String>();
		b.add("A");
		b.add("D");
		
		ArrayList<String> c = new ArrayList<String>();
		c.add("A");
		
		ArrayList<String> d = new ArrayList<String>();
		d.add("B");
		d.add("E");
		d.add("F");
		
		ArrayList<String> e = new ArrayList<String>();
		e.add("D");
		e.add("G");
		
		ArrayList<String> f = new ArrayList<String>();
		f.add("D");
		
		ArrayList<String> g = new ArrayList<String>();
		g.add("E");
		
		ArrayList<String> h = new ArrayList<String>();
		//g.add("H");
		
		
		HashMap graphMap = new HashMap();
		graphMap.put("A", a);
		graphMap.put("B", b);
		graphMap.put("C", c);
		graphMap.put("D", d);
		graphMap.put("E", e);
		graphMap.put("F", f);
		graphMap.put("G", f);
		graphMap.put("H", h);
		
		
		assertTrue(GraphSearch.search("A", new StructureQueue<String>(), graphMap, "A"));
		assertTrue(GraphSearch.search("A", new StructureQueue<String>(), graphMap, "B"));
		assertTrue(GraphSearch.search("A", new StructureQueue<String>(), graphMap, "C"));
		assertTrue(GraphSearch.search("A", new StructureQueue<String>(), graphMap, "D"));
		assertTrue(GraphSearch.search("A", new StructureQueue<String>(), graphMap, "E"));
		assertFalse(GraphSearch.search("A", new StructureQueue<String>(), graphMap, "H"));


	}

}