
public class Item {
	private String name;
	private int quantity;
	private Date expiration;

	public Item(String name, int quantity, Date expire ) {
		this.name = name;
		this.quantity = quantity;
		this.expiration = expire;
		}
	
	public String getName() {
		return name;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public Date getExpire() {
		return expiration;
	}
}
