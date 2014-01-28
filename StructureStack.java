import java.util.LinkedList;

/**
 * A structure that behaves like a stack but implements the Structure interface
 * Feel free to build on existing java implementations, no need to build from
 * scratch. (you can import and use something like LinkedList for example)
 * 
 * @param <T>
 */
public class StructureStack<T> implements Structure<T> {
	
	LinkedList<T> stack = new LinkedList<T>();

	@Override
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	@Override
	public void clear() {
		stack.clear();
	}

	@Override
	public void add(T node) {
		stack.add(node);

	}

	@Override
	public T remove() {
		return stack.remove();
	}

}

