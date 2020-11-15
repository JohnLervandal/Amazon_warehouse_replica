
public class OrderStack {
	private int size;
	private Item arr[];
	private int top;
	
	public OrderStack(int size) {
		this.size = size;
		this.arr = new Item[size];
		this.top = -1;
	}
	
	public void push(Item order) {
		if(isFull() == false) {
			top++;
			arr[top] = order;
			System.out.print("You have succesfully added " + order.toString() +" to your cart.");
		} else {
			throw new IllegalArgumentException("Your cart is full! Either remove the last item you put or finish your cart.");

		}
	}
	
	public Item pop() {
		if (!isEmpty()) {
			int tempTop = top;
			top--;
			System.out.println("You have sucessfully removed: " + arr[tempTop].toString());
			return arr[tempTop];
 
		} else {
			throw new IllegalArgumentException("Your cart is empty, you can't remove anything!");
		}
	}
 
	public Item peek() {
		if(!this.isEmpty()) {
			return arr[top];
		} else {
        	  throw new IllegalArgumentException("Your cart is empty, look at your most recent added item");
       }
	}
 
	public boolean isEmpty() {
		if(top > -1) {
			return false;
		} else {
			return true;
	}
}
 
	public boolean isFull() {
		if(top == size) {
			return true;
		} else {
			return false;
		}
	}
}