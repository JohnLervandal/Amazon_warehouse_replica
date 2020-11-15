import java.util.ArrayList;

public class Order {

	private ArrayList<Item> cus;
	
	public Order() {
		cus = new ArrayList<Item>();
	}
	
	public void addToOrder(Item b) {
		cus.add(b);
	}
	
	public void deleteFromOrder(Item b) {
		cus.remove(b);
	}
	
	public ArrayList<Item> getOrders(){
		return cus;
	}
}
