import java.util.LinkedList;

/**
 * A structure that behaves like a queue but implements the Structure interface
 * Feel free to build on existing java implementations, no need to build from
 * scratch. (you can import and use something like LinkedList for example)
 * 
 * @param <T>
 */
public class StructureQueue<T> implements Structure<T> {

	LinkedList<T> queue = new LinkedList<T>();
	
	@Override
	public boolean isEmpty() {
		return queue.isEmpty();
	}

	@Override
	public void clear() {
		queue.clear();
	}

	@Override
	public void add(T node) {
		queue.add(node);
	}

	@Override
	public T remove() {
		return queue.removeFirst();
	}

}