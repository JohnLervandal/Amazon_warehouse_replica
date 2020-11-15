import java.util.ArrayList;

public class OrderQueue<T> {
	  
	private ArrayList<Order> queue;

	public OrderQueue() {
		this.queue = new ArrayList<Order>();
	}
	
	public void enqueue(Order data) {
		queue.add(data);
	}
	
 
	public Order dequeue(Order data) {
		Order temp = queue.get(0);
		queue.remove(0);
		return temp;
	}
	
	public Order front() {
		return queue.get(0);
	}
	
	public int size() {
		return queue.size();
	}
	
	public boolean isEmpty() {
		if(size() == 0) {
			return true;
		}  else {
			return false;
		}
	}
	
}
