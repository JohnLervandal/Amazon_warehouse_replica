import java.util.*;
public class MainClass {
	String currentUserName;
	int speed; //tracks user speed;
	int itemsPicked; //# of items user picked
	int itemsStowed; //# of items user stowed
	
	public void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		System.out.println("Welcome To Amazon! Please enter Your User Name "
				+ "Displayed On Your Badge!");
		String userName = console.nextLine();
		currentUserName = userName;
		
		System.out.print("Welcome! " + currentUserName);
		System.out.println("Go See a Manager And Get Assigned A Job!"
				+ " When You Get Assigned Type In Either Inbound or OutBound!");
		String work = console.nextLine();
		work = work.toLowerCase();
		if(work == "inbound") {
			Inbound();
		} else if (work=="outbound") {
			Outbound();
		} else {
			throw new NoSuchElementException("Please Type In Inbound or Outbound");

		}
		
	}
	
	public void Inbound() {
		String work = "Y";
		System.out.println("Welcome to Inbound! This is where we take items sent to the Warehouse and place them in Bins");
		@SuppressWarnings("resource")
		Scanner inbound = new Scanner(System.in);
		while(work.equals("Y"));
			System.out.println("Please enter the Bin you want to place the item.");
			String binName = inbound.nextLine();
			Map<String, Item> curBin = Bins.SpecBin(binName);
			System.out.println("Enter the name of the item.");
			String itemName = inbound.next();
			System.out.println("Enter the quantity of the item.");
			int itemQuantity = inbound.nextInt();
			System.out.println("Enter the Month the Item(s) expire.");
			int monthExpire = inbound.nextInt();
			System.out.println("Enter the Day of the Month the Item(s) expire.");
			int dayExpire = inbound.nextInt();
			System.out.println("Enter the Year the Item(s) expire.");
			int yearExpire = inbound.nextInt();
		
			Date curDate = new Date(monthExpire, dayExpire, yearExpire);
			Item curItem = new Item(itemName, itemQuantity, curDate);
			curBin.put(itemName, curItem);
			System.out.println("You sucessfully added the item: " + itemName + " with a Quantity of " + itemQuantity + "that is set to"
				+ "expire on " + curDate.toString());
			System.out.println("You would like to add another item?, If Yes enter 'Y' if No, enter 'N");
			work = inbound.nextLine();
		

		


		
		
	}
	
	public void Outbound() {
		//we need a database of all the customers orders that has their names, address, phone number, and 
				// a list of all the items they ordered. If the user can't find the item in the bin it will send
				//them to an alternative that should also hold the item, if the user can't find the item whatsoever
				// then it will be added to a database that managers can access and tell the user to send that bag to
				//problem solve and a Bin doctor will be in charge of that order now.
	}

}
	
