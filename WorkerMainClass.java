import java.util.*;
public class WorkerMainClass {
	public static void main(String[] args) {
		String currentUserName;
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
			Inbound(currentUserName);
		} else if (work=="outbound") {
			Outbound(currentUserName);
		} else {
			throw new NoSuchElementException("Please Type In Inbound or Outbound");
		}
		
	}
	
	public static void Inbound(String name) {
		String work = "Y";
		System.out.println("Welcome to Inbound " + name + ". This is where we take items "
				+ "sent to the Warehouse and place them in Bins");
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
	
	public static void Outbound(String name) {
		System.out.println("Welcome to Outbound " + name + ". Please Get a Bag and Get Ready To Shop!");
		
		
	}

}
	
