import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;


public class GraphSearchTest {

	@Test
	public void simpleSearchTest() {
		Map<Node, List<Node>> adjList = new HashMap<Node, List<Node>>();
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		
		List<Node> list1 = new ArrayList<Node>();
		list1.add(node2);  //node 1 points to node 2
		List<Node> list2 = new ArrayList<Node>();
		list2.add(node3); //node 2 points to node 3
		List<Node> list3 = new ArrayList<Node>();
		list3.add(node1); //node 3 points to node 1
		
		adjList.put(node1, list1);
		adjList.put(node2, list2);
		adjList.put(node3,  list3);
		
		StructureStack<Node> ss = new StructureStack<Node>();
		StructureQueue<Node> sq = new StructureQueue<Node>();
		
		assertTrue(GraphSearch.search(node1, ss, adjList, node3));
		assertTrue(GraphSearch.search(node1, sq, adjList, node3));
		
		assertTrue(GraphSearch.search(node2, ss, adjList, node1));
		assertTrue(GraphSearch.search(node2, sq, adjList, node1));
		
		assertFalse(GraphSearch.search(node2, ss, adjList, node4));
		assertFalse(GraphSearch.search(node2, sq, adjList, node4));
	}
	
	@Test
	public void complexSearchTest(){
		Map<Node, List<Node>> adjList = new HashMap<Node, List<Node>>();
		Node node0 = new Node(0);
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		Node node8 = new Node(8);
		Node node9 = new Node(9);
		Node node10 = new Node(10);
		Node node11 = new Node(11);
		
		List<Node> list0 = new ArrayList<Node>();
		list0.add(node3);
		List<Node> list1 = new ArrayList<Node>();
		list1.add(node2);
		list1.add(node3);
		list1.add(node4);
		List<Node> list2 = new ArrayList<Node>();
		list2.add(node4);
		list2.add(node5);
		List<Node> list3 = new ArrayList<Node>();
		list3.add(node4);
		List<Node> list4 = new ArrayList<Node>();
		list4.add(node1);
		list4.add(node2);
		list4.add(node6);
		list4.add(node7);
		list4.add(node8);
		List<Node> list5 = new ArrayList<Node>();
		List<Node> list6 = new ArrayList<Node>();
		list6.add(node10);
		List<Node> list7 = new ArrayList<Node>();
		list7.add(node8);
		List<Node> list8 = new ArrayList<Node>();
		List<Node> list9 = new ArrayList<Node>();
		list9.add(node6);
		List<Node> list10 = new ArrayList<Node>();
		list10.add(node11);
		List<Node> list11 = new ArrayList<Node>();
		list11.add(node7);

		adjList.put(node0, list0);
		adjList.put(node1, list1);
		adjList.put(node2, list2);
		adjList.put(node3, list3);
		adjList.put(node4, list4);
		adjList.put(node5, list5);
		adjList.put(node6, list6);
		adjList.put(node7, list7);
		adjList.put(node8, list8);
		adjList.put(node9, list9);
		adjList.put(node10, list10);
		adjList.put(node11, list11);
		
		StructureStack<Node> ss = new StructureStack<Node>();
		StructureQueue<Node> sq = new StructureQueue<Node>();
		
		assertTrue(GraphSearch.search(node0, ss, adjList, node4));
		assertTrue(GraphSearch.search(node0, sq, adjList, node4));
		
		assertTrue(GraphSearch.search(node2, ss, adjList, node5));
		assertTrue(GraphSearch.search(node2, sq, adjList, node5));
		
		assertTrue(GraphSearch.search(node4, ss, adjList, node11));
		assertTrue(GraphSearch.search(node4, sq, adjList, node11));
		
		assertTrue(GraphSearch.search(node9, ss, adjList, node8));
		assertTrue(GraphSearch.search(node9, sq, adjList, node8));
		
		assertTrue(GraphSearch.search(node2, ss, adjList, node2));
		assertTrue(GraphSearch.search(node2, sq, adjList, node2));
		
		assertFalse(GraphSearch.search(node5, ss, adjList, node2));
		assertFalse(GraphSearch.search(node5, sq, adjList, node2));
		
		assertFalse(GraphSearch.search(node0, ss, adjList, node9));
		assertFalse(GraphSearch.search(node0, sq, adjList, node9));
	}
	
	@Test
	public void dspTest(){
		Map<Node, List<Pair<Node, Integer>>> adjList = new HashMap<Node, List<Pair<Node, Integer>>>();
		
		Node node0 = new Node(0);
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		
		List<Pair<Node, Integer>> list0 = new ArrayList<Pair<Node, Integer>>();
		list0.add(new Pair<Node, Integer>(node2, 1));
		list0.add(new Pair<Node, Integer>(node4, 5));
		list0.add(new Pair<Node, Integer>(node5, 2));
		List<Pair<Node, Integer>> list1 = new ArrayList<Pair<Node, Integer>>();
		list1.add(new Pair<Node, Integer>(node3, 1));
		list1.add(new Pair<Node, Integer>(node4, 6));
		List<Pair<Node, Integer>> list2 = new ArrayList<Pair<Node, Integer>>();
		list2.add(new Pair<Node, Integer>(node0, 1));
		list2.add(new Pair<Node, Integer>(node4, 3));
		list2.add(new Pair<Node, Integer>(node5, 2));
		List<Pair<Node, Integer>> list3 = new ArrayList<Pair<Node, Integer>>();
		list3.add(new Pair<Node, Integer>(node1, 1));
		list3.add(new Pair<Node, Integer>(node5, 1));
		List<Pair<Node, Integer>> list4 = new ArrayList<Pair<Node, Integer>>();
		list4.add(new Pair<Node, Integer>(node0, 5));
		list4.add(new Pair<Node, Integer>(node1, 6));
		list4.add(new Pair<Node, Integer>(node2, 3));
		List<Pair<Node, Integer>> list5 = new ArrayList<Pair<Node, Integer>>();
		list5.add(new Pair<Node, Integer>(node0, 2));
		list5.add(new Pair<Node, Integer>(node2, 2));
		list5.add(new Pair<Node, Integer>(node3, 1));
		
		adjList.put(node0, list0);
		adjList.put(node1, list1);
		adjList.put(node2, list2);
		adjList.put(node3, list3);
		adjList.put(node4, list4);
		adjList.put(node5, list5);
		
		assertEquals(0, GraphSearch.dsp(node0, adjList, node0));
	//	assertEquals(4, GraphSearch.dsp(node0,  adjList,  node1));
		assertEquals(1, GraphSearch.dsp(node0,  adjList,  node2));
		//assertEquals(3, GraphSearch.dsp(node0, adjList, node3));
		assertEquals(4, GraphSearch.dsp(node0, adjList, node4));
		assertEquals(2, GraphSearch.dsp(node0,  adjList,  node5));
		
		//assertEquals(-1, GraphSearch.dsp(node0, adjList, new Node(6)));
		
		assertEquals(3, GraphSearch.dsp(node3, adjList, node0));
		assertEquals(1, GraphSearch.dsp(node3,  adjList,  node1));
		assertEquals(3, GraphSearch.dsp(node3,  adjList,  node2));
		assertEquals(0, GraphSearch.dsp(node3, adjList, node3));
	//	assertEquals(6, GraphSearch.dsp(node3, adjList, node4));
		assertEquals(1, GraphSearch.dsp(node3,  adjList,  node5));
		
	}
	
	private static class Node{
		public static int nodeCount;
		private int val;
		private int id;
		
		public Node(int val){
			this.val = val;
			id=nodeCount++;
		}
		
		public String toString(){
			return "NodeVal: "+val+"\t\tNodeID: "+id;
		}
	}

}

