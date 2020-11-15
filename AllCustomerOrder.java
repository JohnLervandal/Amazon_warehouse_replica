public class AllCustomerOrder {
	OrderQueue<OrderStack> orders;
	
	public AllCustomerOrder() {
		orders = new OrderQueue<OrderStack>();
	}
	
	public void addOrder(Order q) {
		orders.enqueue(q);
	}
	
}
