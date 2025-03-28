import java.util.ArrayList;

public class ArrayQueue<T> implements Queue<T> {
	private ArrayList<T> queueList = new ArrayList<T>();
	private int queueSize = 0;

	@Override
	public void enqueue(T item) {  //O(1)
		queueList.add(item);
		queueSize++;
	}

	@Override
	public T dequeue() {			//O(1)
		T temp = queueList.remove(0);
		queueSize--;
		return temp;
	}

	@Override
	public T peek() {			//O(1)
		if (!this.isEmpty()){
			return queueList.get(0);
		}
		else{
			return null;
		}
	}

	@Override
	public boolean isEmpty() {	//O(1)
		return queueSize == 0;
	}

	@Override
	public int size() {			//O(1)
		return queueSize;
	}

	@Override
	public String toString() {
		return "Front: " + this.peek();
	}
}
