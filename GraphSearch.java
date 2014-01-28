import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class GraphSearch {
	
	//Collaborated with Joshua Alley

	/**
	 * Searches the Graph passed in as an AdjcencyList(adjList) to find if a path exists from the start node to the goal node
	 * using General Graph Search.
	 * 
	 * Assume the AdjacencyList contains adjacent nodes of each node in the order they should be visited.
	 * 
	 * The structure(struct) passed in is an empty structure may behave as a Stack or Queue and the
	 * correspondingly search function should execute DFS(Stack) or BFS(Queue) on the graph.
	 * 
	 * @param start
	 * @param struct
	 * @param adjList
	 * @param goal
	 * @return true if path exists false otherwise
	 */
	public static <T> boolean search(T start, Structure<T> struct, Map<T, List<T>> adjList, T goal) {
		HashSet<T> visited = new HashSet<T>();
		if (start == null || goal == null) {
			return false;
		}
		struct.add(start);
		while(!struct.isEmpty()) {
			T current = struct.remove();
			if(current.equals(goal)) {
				return true;
			}
			else {
				for(T neighbor: adjList.get(current)) {
					if(!visited.contains(neighbor)) {
						visited.add(current);
						struct.add(neighbor);
					}
				}
			}
		}
		return false;
	}
	
	/**
	 * Find the shortest distance between the start node and the goal node in the given a weighted graph 
	 * in the form of an adjacency list where the edges only have positive weights
	 * Return the aforementioned shortest distance if there exists a path between the start and goal,-1
	 * otherwise.
	 * 
	 * Assume the AdjacencyList contains adjacent nodes of each node in the order they should be visited.
	 * There are no negative edge weights in the graph.
	 * 
	 * @param start
	 * @param adjList
	 * @param goal
	 * @return the shortest distance between the start and the goal node
	 */
	public static <T> int dsp(T start, Map<T, List<Pair<T, Integer>>> adjList, T goal) {
		if (start == null || goal == null  ) {
			return -1;
		}
		Comparator<Pair<T,Integer>> comp = new Comparator<Pair<T,Integer>>() {
			public int compare(Pair<T,Integer> p1, Pair<T,Integer> p2) {
				if(p1.b == null) {
					return 1;
				}
				if(p2.b == null) {
					return -1;
				}
				return ((p1.b).compareTo(p2.b));
			}
		};
		
		PriorityQueue<Pair<T,Integer>> pq = new PriorityQueue<Pair<T,Integer>>(adjList.size(),comp); //Priority queue that organizes the weights
		HashSet<T> visited = new HashSet<T>(); //visited Node list
		HashMap<T,Integer> map = new HashMap<T,Integer>();
		
		for(T key: adjList.keySet()) {
			if(key.equals(start)) {
				map.put(key, 0);
			}
			else {
				map.put(key,Integer.MAX_VALUE);
			}
		}
		
		Pair<T,Integer> startPair = new Pair<T,Integer>(start,0);
		pq.add(startPair);
		
		while(!pq.isEmpty()){
			Pair<T,Integer> current = pq.poll();
			for(Pair<T,Integer> value : adjList.get(current.a)) {
				if(!visited.contains(value.a)) {
					visited.add(value.a);
					pq.add(value);
				}
				if ((current.b + value.b) < map.get(value.a)) {
					map.put(value.a, current.b + value.b);
					
				}
			}
 		}
		if(map.get(goal) != Integer.MAX_VALUE) {
			return map.get(goal);
		}
		else {
			return -1;
		}
	}
	
}
		

